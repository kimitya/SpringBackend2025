package kz.kbtu.iocdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Item item1() {
        return new Item("First product");
    }

    @Bean("item2")
    public Item item2() {
        return new Item("Second product");
    }

    @Bean("item3")
    public Item item3() {
        return new Item("Third product");
    }

    @Bean
    public Store store() {
        return new Store(item1());
    }

    @Bean("store2")
    public Store store2() {
        var store = new Store();
        store.setItem(item3());
        return store;
    }


}
