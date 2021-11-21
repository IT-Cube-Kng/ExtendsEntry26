package com.itschool.practisetwofourfive.exercisecalculator.extendExamples;

public class Animal {
    protected String nameType;
    protected Float weigth;



    public void breath() {
        System.out.println("Дышим");
    }


    public void eat() {
        System.out.println("Едим");
    }


    public String getNameType() {
        return nameType;
    }

    public Float getWeigth() {
        return weigth;
    }
}
