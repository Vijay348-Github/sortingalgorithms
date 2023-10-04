package com.SortingAlgorithmsAndBasicProblemsPractice;

public class NeonNumber {
    public static void main(String[] args) {
        neonCheck(9);
        neonCheck(8);
        neonInRange(1,10000);
    }
    public static void neonCheck(int num){
        int num2 = num*num;
        int num3 = num;
        int sum = 0;
        while (num2!=0){
            int rem = num2%10;
            sum += rem;
            num2/=10;
        }
        if (sum == num3){
            System.out.println(num3+" is Neon number");
        }else{
            System.out.println(num3+" is not a Neon number");
        }
    }
    public static void neonInRange(int num1,int num2){
        for (int i = num1; i <= num2 ; i++) {
            int m1 = i;
            int m2 = i*i;
            int sum = 0;
            while (m2!=0){
                int rem = m2%10;
                sum += rem;
                m2/=10;
            }
            if (sum == m1){
                System.out.print(m1+"  ");
            }
        }
    }
}
