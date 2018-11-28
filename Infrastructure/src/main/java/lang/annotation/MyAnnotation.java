package lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.FIELD})
public @interface MyAnnotation {
    public String name();
}
