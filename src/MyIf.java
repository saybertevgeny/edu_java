public interface MyIf {
    int getNumber();

    default String getString(){
        return "Строка по умолчанию";
    }
}
