package com.company;

public abstract class Zoo {
    private String vidAnimal;
    private String color;
    private int age;
    private String nickName;

    public Zoo() {
    }

    public Zoo(String vidAnimal, String color, int age, String nickName) {
        this.vidAnimal = vidAnimal;
        this.color = color;
        this.age = age;
        this.nickName = nickName;
    }

    public String getVidAnimal() {
        return vidAnimal;
    }

    public void setVidAnimal(String vidAnimal) {
        this.vidAnimal = vidAnimal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public abstract void simbol();

    public void dikye() {
        System.out.println("Все они дикие животные");
    }
    public void beauty(){
        System.out.println("Все они красивые создания");
    }

    @Override
    public String toString() {
        return "Zoo:\n" +
                "vidAnimal:" + vidAnimal + '\n' +
                "color:" + color + '\n' +
                "age:" + age +"\n"+
                "nickName:" + nickName;

    }
}
