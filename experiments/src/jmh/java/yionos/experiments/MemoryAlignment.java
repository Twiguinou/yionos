package yionos.experiments;

import jdk.incubator.vector.DoubleVector;
import org.openjdk.jmh.annotations.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

@State(Scope.Benchmark)
public class MemoryAlignment
{
    public static final int NUM_BLOCKS = 10000;

    public MemorySegment nativeSegmentData;
    public double[] arrayData;

    @Setup
    public void setup()
    {
        nativeSegmentData = Arena.ofAuto().allocateArray(ValueLayout.JAVA_DOUBLE, NUM_BLOCKS * 4);

        arrayData = new double[NUM_BLOCKS * 4];
        for (int i = 0; i < arrayData.length; i++)
        {
            arrayData[i] = Math.random();
        }
    }

    @Benchmark
    public void nativeSegmentLoads1()
    {
        DoubleVector accumulator = DoubleVector.fromMemorySegment(DoubleVector.SPECIES_256, nativeSegmentData, 0, null);
        for (int i = 1; i < NUM_BLOCKS; i++)
        {
            DoubleVector v0 = DoubleVector.fromMemorySegment(DoubleVector.SPECIES_256, nativeSegmentData, (long) i * Double.BYTES * 4, null);

            accumulator = v0.add(accumulator);
        }

        accumulator.intoMemorySegment(nativeSegmentData, (long) (NUM_BLOCKS - 1) * Double.BYTES * 4, null);
    }

    @Benchmark
    public void nativeSegmentLoads2()
    {
        DoubleVector accumulator = DoubleVector.fromMemorySegment(DoubleVector.SPECIES_256, nativeSegmentData, 0, null);
        for (int i = 1; i < NUM_BLOCKS; i++)
        {
            DoubleVector v0 = DoubleVector.fromMemorySegment(DoubleVector.SPECIES_256, nativeSegmentData, (long) i * Double.BYTES * 4, null);

            accumulator = accumulator.add(v0);
        }

        accumulator.intoMemorySegment(nativeSegmentData, (long) (NUM_BLOCKS - 1) * Double.BYTES * 4, null);
    }

    //@Benchmark
    public void arrayNoVectorLoads()
    {
        double d0 = arrayData[0], d1 = arrayData[1], d2 = arrayData[2], d3 = arrayData[3];

        for (int i = 1; i < NUM_BLOCKS; i++)
        {
            d0 += arrayData[i * 4];
            d1 += arrayData[i * 4 + 1];
            d2 += arrayData[i * 4 + 2];
            d3 += arrayData[i * 4 + 3];
        }

        arrayData[(NUM_BLOCKS - 1) * 4] = d0;
        arrayData[(NUM_BLOCKS - 1) * 4 + 1] = d1;
        arrayData[(NUM_BLOCKS - 1) * 4 + 2] = d2;
        arrayData[(NUM_BLOCKS - 1) * 4 + 3] = d3;
    }
}
