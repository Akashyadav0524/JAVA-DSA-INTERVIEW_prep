package sorting;
//--Recursive 
// -- Dived & Conquer
// -- Not stable (if two elemet are same may or may not be in same oredr)
// -- Merge sort is better for LL

import java.util.Arrays;

//in this we will take a random element s piviot and placed a piviot such a way that right hand side of piviot has smaller and left -larger
// after every pass piviot was at correct postion

// s p     e
// 5 4 3 2 1

// while n[s] < p :true then keep moving forward s++
// while n[e] > p :true then keep moving backward e++
// while we find voilation then we swap start and end if not then we inc-s and dec-e
// [_ _ _ _ _ _]P [_ _ _ _ _ _]
//      (k)          (n-k-1)
// T(N)= T(K) + T(N-K-1) + O(N) -- recurence relation

// worst case piviot elemet was chossen smallest or largest ,
// when k =0
// t(n) = t(0) + t(n-1) + O(n)
// t(n) = t(n-1) + O(n) == o(n^2)

// best case piviot will be  middle element == O nlog(n)

public class QuickSort {
    public static void main(String[] args) {
    
        int arr[] = { 6, 3, 9, 5, 2,7 };
        quicker(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }



    private static void quicker(int[] nums, int low, int high) {
        if(low >= high){
         return;
        }

        int start = low;
        int end = high;
         int mid = start +(end - start)/2;
         int pivot = nums[mid];

         while (start <= end){
             while (nums[start] < pivot){
                start++;
             }
              while (nums[end] > pivot){
                end--;
             }
             if(start <= end){
                int temp = nums[start];
                nums[start]= nums[end];
                nums[end] = temp;
                start++;
                end--;
             }
         }
    // Lets sort two halves
     quicker(nums, low, end);
     quicker(nums, start, high);
    }
}                                                      
