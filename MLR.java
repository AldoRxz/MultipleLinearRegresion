package com.company;

public class MLR {

    Determinante d = new Determinante();

    public double yhat(double Valor1, double Valor2){

        double Yhat=0;

        System.out.printf("Y=b0 + b1 * x1+ b2 * x2\n");
        System.out.printf("y=%.4f + %.4f * %.4f+ %.4f * %.4f \n",d.beta0(),d.beta1(),Valor1,d.beta2(),Valor2);
        Yhat=d.beta0() + (d.beta1() * Valor1) + (d.beta2() * Valor2);
        return Yhat;
    }


}
