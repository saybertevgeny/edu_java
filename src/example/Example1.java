package example;

import code.MyNumber;

public class Example1 {

    public static void example1(){
        MyNumber i = () -> 123.4;
        System.out.println("i from func interface:"+i.getValue());
    }
}
