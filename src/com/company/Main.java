package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] java = new double[]{3.0, 4.5, 5.4, -6.2, 7.6, 8.4, -9.5, 1.3, -1.6, 2.4, 1.7, -3.6, 6.6, 8.9, -7.4};
        double sum = 0;
        int num = 0;
        boolean proverka = false;
        for (double cool : java) {
            if (cool < 0) {
                proverka = true;
            } else if (cool > 0 && proverka) {
                sum += cool;
                num++;
                System.out.println(cool);
            }
        }
        System.out.println("Общее арифметическое число = " + sum / num);
        for (int i = 0; i < java.length - 1; i++) {
            for (int j = 0; j < java.length - i - 1; j++) {
                if (java[j] > java[j + 1]) {
                    double temp = java[j];
                    java[j] = java[j + 1];
                    java[j + 1] = temp;
                    System.out.println(Arrays.toString(java));
                }
            }
        }
    }
}
