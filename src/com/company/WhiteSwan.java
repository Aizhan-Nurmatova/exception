package com.company;

public class WhiteSwan extends Zoo implements Flyable,Swimable,Runable{
    public WhiteSwan() {
    }

    public WhiteSwan(String vidAnimal, String color, int age, String nickName) {
        super(vidAnimal, color, age, nickName);
    }

    @Override
    public void swim() {
        System.out.println(getVidAnimal()+" плавает в озере Иссык-Куль");
    }

    @Override
    public void fly() {
        System.out.println(getVidAnimal()+" умеет летать");
    }

    @Override
    public void run() {
        System.out.println(getVidAnimal()+" умеет бегать");
    }

    @Override
    public void simbol() {
        System.out.println(getVidAnimal()+" симбол любви и счастье");
    }
}
