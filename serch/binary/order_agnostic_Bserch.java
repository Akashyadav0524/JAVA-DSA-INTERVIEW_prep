package serch.binary;

public class order_agnostic_Bserch {

    // agnostic means its given that array is sorted but we dont no it is sorted in
    // asecending oredr or descending oredr
    // so to find that we comapre 1no of array with last no of array

    public static void main(String[] args) {
        int[] arr = { 50, 46, 34, 24, 12, 9, 7, 5, 3, 2 };
        int target = 12;
        int ans = agoBserch(arr, target);
        System.out.println(ans);
    }

    private static int agoBserch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        int mid = start + (end - start) / 2;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }

        return 0;
    }

}
