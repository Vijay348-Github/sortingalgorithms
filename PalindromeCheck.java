package com.SortingAlgorithmsAndBasicProblemsPractice;

public class PalindromeCheck {
    public static void main(String[] args) {
        palindrome(121);
        palindrome(122);
        palinRange(100,1000);
    }
    public static void palindrome(int num){
        int ans = 0;
        int numEx = num;
        while(num!=0){
            int rem = num%10;
            ans = ans*10+rem;
            num/=10;
        }
        if(numEx == ans){
            System.out.println(numEx + " is Palindrome");
        }else{
            System.out.println(numEx + " is not a Palindrome");
        }
    }
    public static void palinRange(int num1,int num2){
        for (int i = num1; i <= num2 ; i++) {
            int ans = 0;
            int dup = i;
            int temp = i;
            while(temp!=0){
                int rem = temp%10;
                ans = ans*10+rem;
                temp/=10;
            }
            if (dup == ans){
                System.out.print(dup+"  ");
            }
        }
    }
}
