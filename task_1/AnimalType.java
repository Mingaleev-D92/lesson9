package ru.innopolis.university.mingaleev.homework_3_9.task_1;

public enum AnimalType {
    CAT ("КОШКА"),
    DOG ("СОБАКА");


    private String type;

    AnimalType(String type){
        this.type=type;
    }

    public String getType (){
        return type;
    }
}
