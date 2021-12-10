package Junits;

import java.lang.annotation.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("Sanity")
@Test
@DisplayName("Negative Test")
public @interface CustomAnnotation {

}
