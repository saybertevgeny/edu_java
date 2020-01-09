public class VarArgs {

    public void test(){
        System.out.println("Аргументы не переданы");
    }

    public void test(String arg){
        System.out.println("Передан один аргумент: " + arg);
    }

    public void test(String arg1,String arg2){
        System.out.println("Передано два аргумента: " + arg1 + ", " + arg2);
    }

    public void test(String arg1,String arg2,String arg3){
        System.out.println("Передано два аргумента: " + arg1 + ", " + arg2 + ", " + arg3);
    }

    public void test(String ...args){
        System.out.println("Переданно разное количество аргументов:" + args.length);
    }
}
