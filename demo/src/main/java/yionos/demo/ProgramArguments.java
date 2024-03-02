package yionos.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;

public class ProgramArguments
{
    private final Map<String, String[]> m_registeredArgs = new HashMap<>();

    public ProgramArguments(String[] args)
    {
        for (String arg : args)
        {
            if (arg.length() > 2 && arg.startsWith("--"))
            {
                String[] splitted = arg.substring(2).split("=", 2);
                this.m_registeredArgs.putIfAbsent(splitted[0], splitted[1].split(","));
            }
        }
    }

    public boolean contains(String arg)
    {
        return this.m_registeredArgs.containsKey(arg);
    }

    public int getNumValuesOfArg(String arg)
    {
        String[] values = this.m_registeredArgs.get(arg);

        return values == null ? 0 : values.length;
    }

    public Optional<String> getArgValueIndexed(String arg, int index)
    {
        assert index >= 0;

        String[] values = this.m_registeredArgs.get(arg);
        if (values != null && index < values.length)
        {
            return Optional.of(values[index]);
        }

        return Optional.empty();
    }

    public <T> T[] getArgValues(String arg, Function<String, T> mapper, IntFunction<T[]> arraySupplier)
    {
        String[] values = this.m_registeredArgs.get(arg);
        if (values != null)
        {
            T[] dest = arraySupplier.apply(values.length);
            for (int i = 0; i < values.length; i++)
            {
                dest[i] = mapper.apply(values[i]);
            }

            return dest;
        }

        return arraySupplier.apply(0);
    }
}
