public class Example {

    static void example1(){
        System.out.println("Яблоки:");
        for(Apple a: Apple.values()){
            System.out.println(a);
        }
        System.out.println("Ценя яблока Jonathan: "+ Apple.Jonathan.getPrice());
        System.out.println("Порядковый номер яблока Jonathan:" + Apple.Jonathan.ordinal());
        System.out.println("Ценя яблока Jonathan: "+ Apple.GoldenDel.getPrice());
        System.out.println("Порядковый номер яблока Jonathan:" + Apple.GoldenDel.ordinal());
    }
}
