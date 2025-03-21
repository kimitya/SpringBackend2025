package kz.kbtu.autowired;

import org.springframework.stereotype.Component;

@FormatterType("Foo")
@Component
public class FooFormatter implements Formatter{
    public String format() {
        return "foo";
    }

    @Override
    public String toString() {
        return "foo";
    }
}
