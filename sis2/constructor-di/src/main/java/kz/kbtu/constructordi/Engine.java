package kz.kbtu.constructordi;

public class Engine {
    private String type;
    private int cylinders;

    public Engine(String type, int cylinders) {
        this.type = type;
        this.cylinders = cylinders;
    }

    public String getType() {
        return type;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Engine{type='" + type + "', cylinders=" + cylinders + "}";
    }


}
