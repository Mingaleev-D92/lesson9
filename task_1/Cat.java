package ru.innopolis.university.mingaleev.homework_3_9.task_1;

import ru.innopolis.university.mingaleev.homework_3_9.task_2.Run;

public class Cat extends Animal implements Run {

    protected Cat(int age, String name, String color) {
        super(age, color);
    }

    @Override
    public String getName() {
        return null;
    }

    public AnimalType getType() {
        return AnimalType.CAT;
    }

    @Override
    public void running() {
        System.out.println("Cat is running!");
    }
}
