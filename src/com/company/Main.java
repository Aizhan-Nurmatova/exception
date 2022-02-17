package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zoo zoos = new WhiteSwan("Аккуу", "Белый", 2, "Одетта");
        Zoo zoo = new Lion("Лев", "Золотисто-желтый", 3, "Симба");
        Zoo zoo1 = new Eagle("Орел", "Белый", 2, "Акшумкар");
        Zoo[] zoo2 = {zoos,zoo,zoo1};
        for (Zoo a:zoo2) {
        if (a instanceof Swimable){
            System.out.println(a);
            ((Swimable) a).swim();
            a.simbol();
            a.dikye();
            a.beauty();
        }
        if (a instanceof Flyable){
            System.out.println(a);
            ((Flyable) a).fly();
            a.simbol();
            a.dikye();
            a.beauty();
        }
        if (a instanceof Runable){
            System.out.println(a);
            ((Runable) a).run();
            a.simbol();
            a.dikye();
            a.beauty();
        }
        }
    }
}