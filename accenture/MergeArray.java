package accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size1, size2;
        System.out.println("Enter Size of 1st Array -");
        size1 = in.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter Elemet in 1st Array-");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter Size of 2nd Array -");
        size2 = in.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter Elemet in 2st Array-");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }
        int result=MergeTwoArray(arr1,arr2);
        System.out.println(result);
        in.close();
    }

    private static int MergeTwoArray(int[] arr1, int[] arr2) {
        int n = arr1.length+arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> finalArr = new ArrayList<>(n);
    
            while(arr1.length==0){
                for (int i = 0; i < arr1.length; i++) {
                    finalArr.add(arr1[i]);
                }
            }
        
        return 0;
    }
}
