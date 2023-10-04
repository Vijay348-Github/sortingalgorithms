package com.SortingAlgorithmsAndBasicProblemsPractice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        selSort(arr);
    }
    public static void selSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-1-i;
            int maxIndex = maxValue(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int maxValue(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
