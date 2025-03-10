package kz.kbtu.task2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Task2Application {

    public static void main(String[] args) {
        SpringApplication.run(Task2Application.class, args);
    }

}
