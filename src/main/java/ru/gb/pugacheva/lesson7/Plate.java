package ru.gb.pugacheva.lesson7;

public class Plate {
    private int food;
    private int maxCapacity=100;

    public Plate(int food) {
        if (food <= maxCapacity) {
            this.food = food;
        } else {
            this.food = maxCapacity;
        }
    }

    public int getFood(){
        return food;
    }

    public void decreaseFood(int quantity) {
        if (quantity <= food) {
            food -= quantity;
        }else{              // в случае с котами это условие не обязательно, т.к. кот вообще не ест, если мало.
            food=0;         // но вдруг решим кроме котов еще кого-то кормить, поэтому пусть будет.
        }
    }

    public void increaseFood(int commonAppetite){
        if (food < commonAppetite && commonAppetite <= maxCapacity){
            food=commonAppetite;
            System.out.println("В тарелку добавили еду. Теперь там " + food + " грамм корма.");
        }else if (food < commonAppetite && commonAppetite > maxCapacity){
            food=maxCapacity;
            System.out.println("В тарелку добавили еду. Теперь там " + food + " грамм корма.");
        }else{
            System.out.println("В тарелке достаточно еды, чтобы накормить всех котов");
        }
    }

    public void info() {
        System.out.printf("В тарелке %d грамм корма из %d максимально вмещаемых.\n", food, maxCapacity);
    }
}
