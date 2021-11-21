package com.itschool.practisetwofourfive.exercisecalculator.extendExamples;

public class Cat extends Animal {
    private String name;
    private Integer old;


    public Cat(String name) {
        nameType = "Котиковые";
        old = 1;
        weigth = 1.0f;
        this.name = name;

    }


    public Cat(String name, int old) {
        this(name);
        this.old = old;
    }


    public void meow() {
        System.out.println("Meow");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }
}
