package com.SortingAlgorithmsAndBasicProblemsPractice;

public class StrongNumber {
    public static void main(String[] args) {
        strongCheck(145);
        strongCheck(126);
        strongInRange(1,1000);
    }
    public static void strongCheck(int num){
        int num1 = num;
        int sum = 0;
        while(num1!=0){
            int rem = num1%10;
            int product = 1;
            for (int i = 1; i <= rem ; i++) {
                product *= i;
            }
            sum += product;
            num1/=10;
        }
        if (sum == num){
            System.out.println(num+" is Strong Number");
        }else{
            System.out.println(num+" is not a Strong number");
        }
    }
    public static void strongInRange(int num1,int num2){
        for (int i = num1; i <= num2 ; i++) {
            int m1 = i;
            int m2 = i;
            int sum = 0;
            while(m1!=0){
                int rem = m1%10;
                int pro = 1;
                for (int j = 1; j <= rem ; j++) {
                    pro *= j;
                }
                sum+=pro;
                m1/=10;
            }
            if (sum == m2){
                System.out.print(m2+"  ");
            }
        }
    }
}
