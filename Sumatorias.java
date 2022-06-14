package com.company;

public class Sumatorias extends DataSet {


    //Suma de todos los valores de x1
    double SumX1(){
        double sumatoriax1 = 0;
        for (int i=0;i<n;i++){
            sumatoriax1+=x1[i];
        }
        return sumatoriax1;
    }

    //Suma de todos los valores de x2
    double SumX2(){
        double sumatoriax2 = 0;
        for (int i=0;i<n;i++){
            sumatoriax2+=x2[i];
        }
        return sumatoriax2;
    }

    //Suma de todos los valores de y1
    double SumY(){
        double sumatoriay = 0;
        for (int i=0;i<n;i++){
            sumatoriay+=y[i];
        }
        return sumatoriay;
    }

    //Multiplicamos todos los valores de x1 y x2 en cada posicion respectivamente
    double sumx1x2(){
        double sumatoriax1x2 = 0;
        for (int i=0;i<n;i++){
            sumatoriax1x2+=x1[i]*x2[i];
        }
        return sumatoriax1x2;
    }

    //Elevamos cada valor de x1 al cuadrado y los sumamos
    double sumx1cuad(){
        double sumatoriax1cuad = 0;
        for (int i=0;i<n;i++){
            sumatoriax1cuad+=x1[i]*x1[i];
        }
        return sumatoriax1cuad;
    }

    //Elevamos cada valor de x2 al cuadrado y los sumamos
    double sumx2cuad(){
        double sumatoriax2cuad = 0;
        for (int i=0;i<n;i++){
            sumatoriax2cuad+=x2[i]*x2[i];
        }
        return sumatoriax2cuad;
    }

    //Multiplicamos todos los valores de x1 y y1 en cada posici[on respectivamente
    double sumx1y(){
        double sumatoriax1y = 0;
        for (int i=0;i<n;i++){
            sumatoriax1y+=x1[i]*y[i];
        }
        return sumatoriax1y;
    }

    //Multiplicamos todos los valores de x2 y y1 en cada posici[on respectivamente
    double sumx2y(){
        double sumatoriax2y = 0;
        for (int i=0;i<n;i++){
            sumatoriax2y+=x2[i]*y[i];
        }
        return sumatoriax2y;
    }


}

