package ru.gb.pugacheva.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;   /// поле введено  и меняется по заданию, но после выполнения метода eat оно больше
    /// не используется. В дальнейшем может использоваться, если кормить выборочно
    ///, например, только голодных котов.
    static int commonAppetit = 0;  /// правильно понимаю, что раз переменная static, т.е. общая для всех объектов
                                /// класса, то мы ее можем вызывать, обращаясь прямо к названию класса?
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        commonAppetit += appetite;
    }

    public static int getCommonAppetit(){
        return commonAppetit;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            full = true;
            System.out.println("Кот " + name + " сыт.");
        }else {
            System.out.println("В миске осталось мало корма, кот " + name + " не поел и остался голоден.");
        }
    }
}
