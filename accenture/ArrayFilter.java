package accenture;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayFilter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr1[]=new int[5];
        int arr2[]=new int[4];
        int arr3[]=new int[3];
        System.out.println("Enter Element in aarr1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter Element in aarr2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=in.nextInt();
        }
        System.out.println("Enter Element in aarr3");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=in.nextInt();
        }
        FilterArrays(arr1,arr2,arr3);
        FilterArrays2(arr1,arr2,arr3);
        in.close();
    }

    private static void FilterArrays(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> ResArr1 = new ArrayList<>();
        ArrayList<Integer> ResArr2 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            boolean foundInArr2 = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    foundInArr2 = true;
                    break;
                }
            }
            if (!foundInArr2) {
                ResArr1.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean foundInArr3 = false;
            for (int j = 0; j < arr3.length; j++) {
                if (arr2[i] == arr3[j]) {
                    foundInArr3 = true;
                    break;
                }
            }
            if (!foundInArr3) {
                ResArr2.add(arr2[i]);
            }
        }

        System.out.println(ResArr1);
        System.out.println(ResArr2);
        System.out.println();
        System.out.println();
        System.out.println();
    }


    private static void FilterArrays2(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> ResArr1 = new ArrayList<>();
        ArrayList<Integer> ResArr2 = new ArrayList<>();

        HashSet<Integer> setArr2 = new HashSet<>();
        for (int num : arr2) {
            setArr2.add(num);
        }

        HashSet<Integer> setArr3 = new HashSet<>();
        for (int num : arr3) {
            setArr3.add(num);
        }

        // Check elements present in arr1 but not in arr2
        for (int num : arr1) {
            if (!setArr2.contains(num)) {
                ResArr1.add(num);
            }
        }

        // Check elements present in arr2 but not in arr3
        for (int num : arr2) {
            if (!setArr3.contains(num)) {
                ResArr2.add(num);
            }
        }

        System.out.println("Elements present in arr1 but not in arr2: " + ResArr1);
        System.out.println("Elements present in arr2 but not in arr3: " + ResArr2);
    }
}
