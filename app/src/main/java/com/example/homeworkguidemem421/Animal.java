package com.example.homeworkguidemem421;

public class Animal {
    // создадим поля
    private String neme; //  поле название мема
    private String discription; // поле описания мема
    private int animalResourse; // поле ресурса мема

    // конструктор

    public Animal(String neme, String discription, int animalResourse) {
        this.neme = neme;
        this.discription = discription;
        this.animalResourse = animalResourse;
    }
    // геттеры и сеттеры


    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getAnimalResourse() {
        return animalResourse;
    }

    public void setAnimalResourse(int animalResourse) {
        this.animalResourse = animalResourse;
    }
}


