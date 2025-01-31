package kz.kbtu.scopes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;

public class PrototypeTest {
    private static final String NAME = "John Smith";
    private static final String NAME_OTHER = "Anna Jones";

    @Test
    public void givenPrototypeScope_whenSetNames_thenDifferentNames() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PersonConfig.class);

        Person personPrototypeA = (Person) applicationContext.getBean("personPrototype");
        Person personPrototypeB = (Person) applicationContext.getBean("personPrototype");

        personPrototypeA.setName(NAME);
        personPrototypeB.setName(NAME_OTHER);

        assertEquals(NAME, personPrototypeA.getName());
        assertEquals(NAME_OTHER, personPrototypeB.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }

    @Configuration
    static class PersonConfig {
        @Bean
        @Scope("prototype")
        public Person personPrototype() {
            return new Person();
        }
    }
}
