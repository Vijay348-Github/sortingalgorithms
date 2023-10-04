package com.SortingAlgorithmsAndBasicProblemsPractice;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6};
        System.out.println(binRec(arr,6,0, arr.length-1));
    }
    public static int binRec(int[] arr,int target,int start,int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if (target < arr[mid]){
            return binRec(arr,target,start,mid-1);
        }
        if (target > arr[mid]){
            return binRec(arr,target,mid+1,end);
        }
        if (arr[mid] == target){
            return mid;
        }
        return 0;
    }
}
