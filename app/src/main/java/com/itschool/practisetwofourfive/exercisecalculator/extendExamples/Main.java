package com.itschool.practisetwofourfive.exercisecalculator.extendExamples;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.nameType = "Животное";


        Cat c = new Cat("Мурзик");

        System.out.println(a.getNameType());
        System.out.println(c.getNameType());
    }
}
