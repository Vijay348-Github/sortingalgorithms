package com.SortingAlgorithmsAndBasicProblemsPractice;

public class PrimeNUmberRec {
    public static void main(String[] args) {
        int num = 10;
        if (isPrime(num)){
            System.out.println(num + " is Prime");
        }else {
            System.out.println(num +" is not a Prime");
        }
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        return isPrimeNumRec(num,2);
    }
    public static boolean isPrimeNumRec(int num,int div){
        if(num == div){
            return true;
        }
        if (num%div == 0){
            return false;
        }
        return isPrimeNumRec(num,div+1);
    }

}
