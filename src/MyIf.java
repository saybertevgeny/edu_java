public interface MyIf {
    int getNumber();

    default String getString(){
        return "Строка по умолчанию";
    }

    static int getDefaultNumber(){//его не будет ни в наследующих объектах ни в наследующих интерфесах
        return 0;
    }

    private int getPrivateNumber(){
        System.out.println("Приватный метод интерфейса");
        return this.getNumber();
    }

    public default int getPublicNumber(){
        System.out.println("Публичный метод интерфейса");
        return this.getPrivateNumber();
    }
}
