package kz.kbtu.iocdi;

public class Store {
    private Item item;

    public Store(Item item1) {
        System.out.println("Creating new Store instance");
        this.item = item1;
        System.out.println("The Store has item: " + this.item.getName());

    }

    public Store() {

    }

    public void setItem(Item item) {
        this.item = item;
        System.out.println("The Store has item: " + this.item.getName());
    }
}
