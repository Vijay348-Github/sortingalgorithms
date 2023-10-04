package com.SortingAlgorithmsAndBasicProblemsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.SortingAlgorithmsAndBasicProblemsPractice.InsertionSort.swap;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
    }
    public static void cycleSort(int[] arr){
        int index = 0;
        while(index< arr.length){
            int correct = arr[index]-1;
            if (arr[index]!=arr[correct]){
                swap(arr,index,correct);
            }else{
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
