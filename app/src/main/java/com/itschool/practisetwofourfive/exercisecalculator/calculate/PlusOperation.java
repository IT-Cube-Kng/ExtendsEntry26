package com.itschool.practisetwofourfive.exercisecalculator.calculate;

public class PlusOperation extends Operation {


    public PlusOperation() {
        operName = "Сложение";
        op1 = 0d;
        op2 = 0d;
    }

    public PlusOperation(Double op1, Double op2) {
        this();
        this.op1 = op1;
        this.op2 = op2;

    }

    @Override
    public Double calc() {
        return op1 + op2;
    }
}
