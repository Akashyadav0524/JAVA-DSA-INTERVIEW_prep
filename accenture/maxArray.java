package accenture;

public class maxArray {
    

    public static void MaxInArray(int arr[], int length) {
        if (length == 0) {
            // Handle the case when the array is empty
            System.out.println("The array is empty.");
            return;
        }

        int max = arr[0];
        int maxIndex = 0;

        // Iterate through the array to find the maximum element and its index
        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // Print the maximum element and its index
        System.out.println(max);
        System.out.println(maxIndex);
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 82, 27, 66, 12, 78, 13, 71, 86};
        int length = arr.length;
        MaxInArray(arr, length);
    }
}
