package kz.kbtu.autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiredApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(AutowiredApplication.class, args);
        FooService fooService = ctx.getBean(FooService.class);
        System.out.println(fooService);
    }

}
