public class Application{
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.test();
        varArgs.test("Первый аргумент");
        varArgs.test("Первый аргумент","Второй аргумент");
        varArgs.test("Первый аргумент","Второй аргумент","Третий аргумент");
    }
}