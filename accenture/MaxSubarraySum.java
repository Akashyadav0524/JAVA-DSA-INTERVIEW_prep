package accenture;

public class MaxSubarraySum {

    // Function to find the maximum sum of any contiguous subarray
    public static int maxSubarraySum(int[] nums) {
        // Check if the array is null or empty
        if (nums == null || nums.length == 0) {
            return 0; // If so, return 0 (no subarray to consider)
        }

        // Initialize variables to keep track of the maximum sum ending at the current position
        int maxEndingHere = nums[0];
        // Initialize a variable to keep track of the global maximum sum
        int maxSoFar = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Calculate the maximum sum ending at the current position
            // It's either the current element or the sum of the previous maximum ending here plus the current element
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);

            // Update the global maximum sum if the current maximum ending here is greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        // Return the global maximum sum
        return maxSoFar;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage:

        // Example 1:
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarraySum(nums1);
        System.out.println(result1);  // Output: 6

        // Example 2:
        int[] nums2 = {3, -1, 2, 5, -6, 3};
        int result2 = maxSubarraySum(nums2);
        System.out.println(result2);  // Output: 9
    }
}

