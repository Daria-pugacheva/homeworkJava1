package ru.gb.pugacheva.lesson7;

public class MainApp {
    public static void main(String[] args) {

        Plate plate = new Plate(80);

        plate.info();

        Cat[] cat = {
                new Cat("Барсик", 50),
                new Cat("Рыжик", 20),
                new Cat("Пушок", 15)
        };

        for (int i = 0; i < cat.length; i++) {  //облом, конечно, что они едят строго по очереди. Но ни к чему,
            cat[i].eat(plate);                  //пожалуй, усложнять это рандомом
        }

        plate.info();

        plate.increaseFood(Cat.getCommonAppetit());//логично досыпать столько, сколько нужно котам, чтоб наелись

        plate.info();

    }
}
