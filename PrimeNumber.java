package com.SortingAlgorithmsAndBasicProblemsPractice;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNum(12);
        primeNumsSeries(10,100);
    }
    public static void primeNum(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {

            if (num%i == 0){
                count++;;
            }
        }
        if (count == 2){
            System.out.println(num +"  is a Prime Number .");
        }else {
            System.out.println(num +"  is not a Prime Number .");
        }
    }
    public static void primeNumsSeries(int num1,int num2){
        for (int i = num1; i <= num2; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i%j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i+"  ");
            }
        }
    }
}
