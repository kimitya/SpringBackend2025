package kz.kbtu.task1;

import kz.kbtu.task1.publisher.CustomSpringEventPublisher;
import kz.kbtu.task1.publisher.GenericEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Task1Application {

    public static void main(String[] args) {

//        SpringApplication.run(Task1Application.class, args);
        ApplicationContext context = SpringApplication.run(Task1Application.class, args);

        CustomSpringEventPublisher customPublisher = context.getBean(CustomSpringEventPublisher.class);

        customPublisher.publishMultipleEvents();

    }

}
