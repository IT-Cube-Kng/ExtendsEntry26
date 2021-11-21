package com.itschool.practisetwofourfive.exercisecalculator.calculate;

public abstract class Operation implements CalcOperation{
    // название операции
    protected String operName;
    // Первый операнд
    protected Double op1;
    // Второй операнд
    protected Double op2;



    // Вызываемый метод при расчете
    @Override
    public Double calc() {
        return Double.NaN;
    }


    public Double getOp1() {
        return op1;
    }

    public void setOp1(Double op1) {
        this.op1 = op1;
    }

    public Double getOp2() {
        return op2;
    }

    public void setOp2(Double op2) {
        this.op2 = op2;
    }
}
