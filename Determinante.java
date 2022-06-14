package com.company;

public class Determinante {

    Sumatorias s=new Sumatorias();

    double DS() {
        double DS = 0;
        double p1, p2, p3, p4, p5, p6;

        //En este bloque de codigo calculamos la determinante de sistema
        p1 = (17 * s.sumx1cuad() * s.sumx2cuad());
        p2 = (s.SumX1() * s.sumx1x2() * s.SumX2());
        p3 = (s.SumX2() * s.SumX1() * s.sumx1x2());
        p4 = (s.SumX2() * s.sumx1cuad() * s.SumX2());
        p5 = (17 * s.sumx1x2() * s.sumx1x2());
        p6 = (s.sumx2cuad() * s.SumX1() * s.SumX1());
        DS = (p1 + p2 + p3 - p4 - p5 - p6);

        return DS;
    }

    double DB0() {
        double  DB0 = 0;
        double p1, p2, p3, p4, p5, p6;
        //En este bloque de codigo calculamos la determinante de B0
        p1 = (s.SumY() * s.sumx1cuad() * s.sumx2cuad());
        p2 = (s.SumX1() * s.sumx1x2() * s.sumx2y());
        p3 = (s.SumX2() * s.sumx1y() * s.sumx1x2());
        p4 = (s.sumx2y() * s.sumx1cuad() * s.SumX2());
        p5 = (s.sumx1x2() * s.sumx1x2() * s.SumY());
        p6 = (s.sumx2cuad() * s.sumx1y() * s.SumX1());
        DB0 = (p1 + p2 + p3 - p4 - p5 - p6);

        return DB0;
    }

    double DB1() {
        //En este bloque de codigo calculamos la determinante de B1
        double  DB1 = 0;
        double p1, p2, p3, p4, p5, p6;
        p1 = (17 * s.sumx1y() * s.sumx2cuad());
        p2 = (s.SumY() * s.sumx1x2() * s.SumX2());
        p3 = (s.SumX2() * s.SumX1() * s.sumx2y());
        p4 = (s.SumX2() * s.sumx1y() * s.SumX2());
        p5 = (s.sumx2y() * s.sumx1x2() * 17);
        p6 = (s.sumx2cuad() * s.SumX1() * s.SumY());
        DB1 = (p1 + p2 + p3 - p4 - p5 - p6);

        return DB1;
    }

    double DB2() {
        //En este bloque de codigo calculamos la determinante de B2
        double  DB2 = 0;
        double p1, p2, p3, p4, p5, p6;
        p1 = (17 * s.sumx1cuad() * s.sumx2y());
        p2 = (s.SumX1() * s.sumx1y() * s.SumX2());
        p3 = (s.SumY() * s.SumX1() * s.sumx1x2());
        p4 = (s.SumX2() * s.sumx1cuad() * s.SumY());
        p5 = (s.sumx1x2() * s.sumx1y() * 17);
        p6 = (s.sumx2y() * s.SumX1() * s.SumX1());
        DB2 = (p1 + p2 + p3 - p4 - p5 - p6);

        return DB2;
    }

    public double beta0(){
        double b0=0;
        b0= DB0()/DS();
        return b0;
    }

    public double beta1(){
        double b1=0;
        b1=DB1()/DS();
        return b1;
    }

    public double beta2(){
        double b2=0;
        b2=DB2()/DS();
        return b2;
    }
}