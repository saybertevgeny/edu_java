package example;

import code.MyNumber;
import code.MyNumberWithParams;

public class Example1 {

    public static void example1(){
        MyNumber i = () -> 123.4;
        System.out.println("i from func interface:"+i.getValue());
    }

    public static void example2(){
        MyNumberWithParams i = j -> j*2;
        System.out.println("i from func interface with params:"+i.getValue(3));
    }
}
