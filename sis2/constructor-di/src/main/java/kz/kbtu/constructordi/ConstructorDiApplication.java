package kz.kbtu.constructordi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ConstructorDiApplication.class, args);
        Car car = ctx.getBean(Car.class);
        System.out.println(car);
    }

}
