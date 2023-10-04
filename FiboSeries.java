package com.SortingAlgorithmsAndBasicProblemsPractice;

public class FiboSeries {
    public static void main(String[] args) {
        fibo(10);
    }
    public static void fibo(int num){
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= num ; i++) {
            System.out.print(num1+"  ");
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
        int m1 = num1;
        int m2 = num2-num1;
        for (int i = 1; i <= 10 ; i++) {
            int m3 = m1-m2;
            System.out.print(m2+"  ");
            m1 = m2;
            m2 = m3;
        }
    }

}
