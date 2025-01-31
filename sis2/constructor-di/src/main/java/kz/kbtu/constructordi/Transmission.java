package kz.kbtu.constructordi;

public class Transmission {
    private String type;

    public Transmission(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Transmission{type='" + type + "'}";
    }
}
