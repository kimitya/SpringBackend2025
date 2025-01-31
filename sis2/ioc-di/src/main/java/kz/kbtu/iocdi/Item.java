package kz.kbtu.iocdi;

public class Item {
    private final String name;

    public Item (String name) {
        System.out.println("Creating new Item with name " + name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
