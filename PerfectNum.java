package com.SortingAlgorithmsAndBasicProblemsPractice;

public class PerfectNum {
    public static void main(String[] args) {
        perfectCheck(19);
        perfectCheck(28);
        perfectNumRange(10,1000);
    }
    public static void perfectCheck(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num%i == 0){
                sum += i;
            }
        }
        if (sum == num){
            System.out.println(num + " is a Perfect Number");
        }else{
            System.out.println(num + " is not a Perfect NUmber");
        }
    }
    public static void perfectNumRange(int num1,int num2){
        for (int i = num1; i <= num2 ; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.print(i+"  ");
            }
        }
    }
}
