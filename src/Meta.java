import java.lang.reflect.Method;

public class Meta {

    @MyAnno(name = "test")
    public static void meta(String str,int i){

        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method method = c.getMethod("meta", String.class, int.class);
            MyAnno my = method.getAnnotation(MyAnno.class);
            System.out.println("Значение из анотации: " + my.name());
        }
        catch (NoSuchMethodException e){
            System.out.println("Метод не найден");
        }
    }
}
