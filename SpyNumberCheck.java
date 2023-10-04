package com.SortingAlgorithmsAndBasicProblemsPractice;

public class SpyNumberCheck {
    public static void main(String[] args) {
        spyCheck(123);
        spyCheck(124);
        spyNumInRange(100,1000);
    }
    public static void spyCheck(int num){
        int sum = 0;
        int product = 1;
        int num2 = num;
        while (num2!=0){
            int rem = num2%10;
            sum += rem;
            product *= rem;
            num2/=10;
        }
        if (sum == product){
            System.out.println(num +" is SPY number");
        }else{
            System.out.println(num + " is not SPY ");
        }
    }

    public static void spyNumInRange(int num1,int num2){
        for (int i = num1; i <= num2 ; i++) {
            int sum = 0;
            int product = 1;
            int num = i;
            while (num!=0){
                int rem = num%10;
                sum += rem;
                product *= rem;
                num/=10;
            }
            if(sum == product){
                System.out.print(i+"  ");
            }
        }
    }
}
