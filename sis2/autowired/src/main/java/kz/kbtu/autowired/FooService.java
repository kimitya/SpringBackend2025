package kz.kbtu.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {
    @Autowired
    @FormatterType("Foo")
    private Formatter formatter;

    @Autowired
    public FooService(@Qualifier("fooFormatter") Formatter formatter) {
        this.formatter = formatter;
    }

    @Autowired
    @Qualifier("fooFormatter")
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String toString() {
        return "FooService: "+this.formatter;
    }
}
