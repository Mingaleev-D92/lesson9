package ru.innopolis.university.mingaleev.homework_3_9.task_1;

public abstract class Animal {
    private int age;
    private String color;


    public Animal(int age, String color) {
        this.age=age;
        this.color=color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getName();

    public abstract AnimalType getType();

    public abstract void running();

    public abstract void swimming();
}