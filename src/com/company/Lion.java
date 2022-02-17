package com.company;

public class Lion extends Zoo implements Runable{
    public Lion() {
    }

    public Lion(String vidAnimal, String color, int age, String nickName) {
        super(vidAnimal, color, age, nickName);
    }

    @Override
    public void run() {
        System.out.println(getVidAnimal()+" умеет быстро бегать");
    }

    @Override
    public void simbol() {
        System.out.println(getVidAnimal()+" симбол лидерство и храбрасти");
    }
}
