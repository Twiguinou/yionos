package yionos.demo.app.data;

public final class ParsedModels
{private ParsedModels() {}

    public static final OBJModel gCubeModel;
    public static final OBJModel gIcosphereModel;

    static
    {
        OBJLoader loader = new OBJLoader("models");

        gCubeModel = loader.parseGeometry("cube.obj");
        gIcosphereModel = loader.parseGeometry("icosphere.obj");
    }
}
