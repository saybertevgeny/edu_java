package example;

import code.MyNumber;
import code.MyNumberWithParams;
import code.SomeFunc;
import code.StringFunc;

public class Example2 {

    private static String stringOpExample4(StringFunc func,String str){
        return func.func(str);
    }

    public static void example4(){
        System.out.println("Применение функционального интерфейса как параметра:" +  stringOpExample4(
                str -> {
                    return str.toUpperCase();
                },"Пример"
        ));
    }
}
