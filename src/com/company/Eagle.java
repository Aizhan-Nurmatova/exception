package com.company;

public class Eagle extends Zoo implements Flyable {
    public Eagle() {
        super();
    }

    public Eagle(String vidAnimal, String color, int age, String nickName) {
        super(vidAnimal, color, age, nickName);
    }

    @Override
    public void fly() {
        System.out.println(getVidAnimal()+" умеет высоко и быстро летать");
    }

    @Override
    public void simbol() {
        System.out.println(getVidAnimal()+" символ свободы");
    }
}
