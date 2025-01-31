package kz.kbtu.scopes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

class SingletonTest {

    private static final String NAME = "John Smith";

    @Test
    void givenSingletonScope_whenSetName_thenEqualNames() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PersonConfig.class);

        Person personSingletonA = applicationContext.getBean(Person.class);
        Person personSingletonB = applicationContext.getBean(Person.class);

        personSingletonA.setName(NAME);
        assertEquals(NAME, personSingletonB.getName());

        ((AnnotationConfigApplicationContext) applicationContext).close();
    }

    @Configuration
    static class PersonConfig {
        @Bean
        @Scope("singleton")
        public Person personSingleton() {
            return new Person();
        }
    }
}
