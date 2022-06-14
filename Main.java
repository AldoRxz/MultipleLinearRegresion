package com.company;

public class Main {

    public static void main(String[] args) {

        DataSet datos= new DataSet();
        Sumatorias sum = new Sumatorias();
        MLR operacion = new MLR();


        //operacion.setValor(10);
       // operacion.setValor2(10);


        datos.DataS();   //Esto lo usamos para llamar a la funcion y imprimir el DataSet

/*
        String val1=args[0];
        String val2=args[1];

        float dato1=Float.parseFloat(val1);
        float dato2=Float.parseFloat(val2);


        /*
        System.out.println("\n");
        System.out.println("Valor inicial:    "+operacion.getValor());
        System.out.println("Valor inicial 2:  "+operacion.getValor2());
        System.out.println("Beta0 = "+operacion.getBeta0());
        System.out.println("Beta1 = "+operacion.getBeta1());
        System.out.println("Beta1 = "+operacion.getBeta2()+"\n");

        System.out.println("Determinante de sistema = "+operacion.getDSistem()+"\n");


        System.out.printf("Resultado = Beta0 + Beta1 * Valor ");
        System.out.printf("\nResultado = %.2f", operacion.getResultado());

         */


    }
}
