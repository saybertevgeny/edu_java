import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Repeatable(MyRepeatAnno.class)
@interface MyAnno{
//    String str();
//    int val();
    String name();
    String text() default "Дефолтный текст";
}