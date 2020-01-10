enum Apple {
    Jonathan(10), GoldenDel(5);

    private int price;

    Apple(int p){
        System.out.println("Вызван конструктор перечисления");
        price = p;
    }

    int getPrice(){
        return price;
    }
}
