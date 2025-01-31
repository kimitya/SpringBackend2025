package kz.kbtu.iocdi;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StoreComponent {

  @Autowired
  @Qualifier("item2")
  private Item item;

  public StoreComponent() {
    System.out.println("Creating new StoreComponent instance");
  }

  @PostConstruct
  public void afterConstructCheck() {
    System.out.println("The StoreComponent has item: " + this.item.getName());
  }
}
