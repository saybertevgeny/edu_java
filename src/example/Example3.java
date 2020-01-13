package example;

import code.MyClass;
import code.MyFunc;
import code.StringFunc;

public class Example3 {

    public static void example5(){

        MyFunc myFunc = MyClass::new; // это краткая запись вот этого -> MyFunc<Double> myFunc = MyClass<Double>::new;
        MyClass myClass = myFunc.func(1.0);
        System.out.println("Применение функционального интерфейса вместо конструктора:" + myClass.getVal());
    }
}
