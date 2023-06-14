package com.pro06;

//税
public interface IPayTaxes {
    //常量
    double PI = 3.14159;        //final double PI=3.14159;

    //抽象方法
    double payTaxes();        //abstract double payTaxes();
}

class BuyCar implements IPayTaxes        //买车行为，要交税
{
    private double price = 100000;    //价格

    @Override    //重写接口中的方法
    public double payTaxes() {
        return 0.1 * price;
    }
}

class Work implements IPayTaxes        //打工收到工资，要交税
{
    private double salary = 6000;    //工资

    @Override    //重写接口中的方法
    public double payTaxes() {
        return (salary - 5000) * 0.07;
    }
}

class DoBusiness implements IPayTaxes        //开店收入，要交税
{
    private double turnover = 30000;    //营业额

    @Override    //重写接口中的方法
    public double payTaxes() {
        return turnover * 0.2;
    }
}




