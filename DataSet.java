package com.company;

public class DataSet {

    int n = 17;
    int i;
    double x1[] = {41.9, 43.4, 43.9, 44.5, 47.3, 47.5, 47.9, 50.2, 52.8, 53.2, 56.7, 57, 63.5, 65.3, 71.1, 77, 77.8};
    double x2[] = {29.1,29.3,29.5,29.7,29.9,30.3,30.5,30.7,30.8,30.9,31.5,31.7,31.9,32,32.1,32.5,32.9};
    double y[] = {251.3,251.3,248.3,267.5,273,276.5,270.3,274.9,285,290,297,302.5,304.5,309.3,321.7,330.7,349};


    public void DataS() {

        System.out.printf("\t n\t x1 \t x2 \t y \n");

        for (i = 0; i < n; i++) {
            System.out.printf("\t %d\t %.2f \t %.2f\t %.2f \n", i + 1, x1[i], x2[i], y[i]);
        }
        System.out.println("\n");
    }

}
