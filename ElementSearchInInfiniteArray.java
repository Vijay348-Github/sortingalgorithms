package com.SortingAlgorithmsAndBasicProblemsPractice;

public class ElementSearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,180};
        System.out.println(ans(arr,100));
    }
    public static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(end < arr.length && target > arr[end]){
            int newStart = end+1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        if (end >= arr.length){
            end = arr.length-1;
        }
        return binSearch(arr,target,start,end);
    }
    static int binSearch(int[] arr,int target,int start,int end){
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == mid){
                return mid;
            }
            if (target < arr[mid]){
                end = mid-1;
            }
            if (target > arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }

}
