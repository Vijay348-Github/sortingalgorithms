package com.SortingAlgorithmsAndBasicProblemsPractice;

public class FiboRec {
    public static void main(String[] args) {
        fiboNormal(0,1,10);
        System.out.println();
        fiboRev(0,1,10);
    }
    public static void fiboNormal(int a,int b,int num){
        if (num>0){
            System.out.print(a+"  ");
            fiboNormal(b,a+b,num-1);
        }
    }
    public static void fiboRev(int a, int b,int num){
        if (num>0){
            fiboRev(b,a+b,num-1);
            System.out.print(a+"  ");
        }
    }

}
