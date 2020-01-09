package package2;

import package1.A;

public class C {

    public void simpleMethod(){
        System.out.println("simpleMethod of C of package1");
        A a = new A();
        a.simpleMethod();//тут ошибка т.к A не в этом пакете
    }
}
