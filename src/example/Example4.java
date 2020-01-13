package example;

import code.MyClass;
import code.MyFunc;

import java.util.function.Function;

public class Example4 {

    public static void example6(){

        Function<Integer,String> func = n -> {
            switch (n){
                case 1: return "одын";
                case 2: return "два";
                default: return "много";
            }
        };

        System.out.println("Пример встроенного функционального интерфейса:" + func.apply(1));
    }
}
