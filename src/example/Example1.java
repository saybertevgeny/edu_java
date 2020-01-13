package example;

import code.MyNumber;
import code.MyNumberWithParams;
import code.SomeFunc;
import code.StringFunc;

public class Example1 {

    public static void example1() {
        MyNumber i = () -> 123.4;
        System.out.println("i from func interface:" + i.getValue());
    }

    public static void example2() {
        MyNumberWithParams i = j -> j * 2;
        System.out.println("i from func interface with params:" + i.getValue(3));
    }

    public static void example3() {
        SomeFunc<String> reverse = (str) -> {
            return "reverse";
        };

        SomeFunc<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Вызов факториала 4" + factorial.func(4));
    }
}
