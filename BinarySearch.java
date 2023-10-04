package com.SortingAlgorithmsAndBasicProblemsPractice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,6,8,12,14,16};
        System.out.println(binarySearchAo(arr,14));
        int[] arr1 = {20,18,16,14,12,10};
        System.out.println(binAoDo(arr1,12));
    }
    public static int binarySearchAo(int[] arr,int target){
        if (arr.length == 0){
            return 0;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid= start + (end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            }
            if (target > arr[mid]){
                start = mid+1;
            }
            if (target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }

    public static int binAoDo(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target > arr[mid]){
                    start = mid+1;
                }else if(target<arr[mid]){
                    end = mid-1;
                }
            }else{
                if (target < arr[mid]){
                    start = mid+1;
                }else if(target>arr[mid]){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
