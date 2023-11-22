package accenture;

import java.util.HashMap;
import java.util.Scanner;


public class MaxReturn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in . nextInt();
        }
        int ans = maxArray(n,arr);
        System.out.println("your answer is - "+ans);
        in.close();
    }

    private static int maxArray(int n, int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update the frequency in the HashMap
        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];

            // If the element is already present in the HashMap, increment its frequency
            if (frequencyMap.containsKey(currentElement)) {
                frequencyMap.put(currentElement, frequencyMap.get(currentElement) + 1);
            } else {
                // If the element is not present, add it to the HashMap with a frequency of 1
                frequencyMap.put(currentElement, 1);
            }
        }

        // Variables to keep track of the maximum frequency and the element with the maximum frequency
        int maxFrequency = 0;
        int maxFrequencyElement = arr[0]; // Initialize with the first element

        // Traverse the HashMap to find the element with the maximum frequency
        for (int key : frequencyMap.keySet()) {
            int currentFrequency = frequencyMap.get(key);

            // Update if the current frequency is greater than the maximum frequency
            // or if the frequencies are equal, update if the current element has a lower index
            if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && key < maxFrequencyElement)) {
                maxFrequency = currentFrequency;
                maxFrequencyElement = key;
            }
        }

        // Return the element with the maximum frequency
        return maxFrequencyElement;

    }
}
