package com.SortingAlgorithmsAndBasicProblemsPractice;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6};
        revArray(arr);
    }
    public static void revArray(int[] arr){
        for (int i = 0; i < (arr.length)/2; i++) {
            swap(arr,i, arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
