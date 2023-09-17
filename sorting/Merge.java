package sorting;

public class Merge {

    public static void conquer(int arr[], int start_indx, int mid, int end_indx) {
        int merged[] = new int[end_indx - start_indx + 1]; // ek temporory array bano jo merged aur sorted value lega
                                             // sizee hoga

        // Left part: [6, 3, 9]
        // Right part: [5, 2, 8]

        int indx1 = start_indx; // ** starting of pehla element of left arrray matlb 6se
        int indx2 = mid + 1;// ** starting of pehla element of right array arrray matlb 5se
        int x = 0;

        while (indx1 <= mid && indx2 <= end_indx) {
            if (arr[indx1] <= arr[indx2]) { // compare krenge ki pehle me chota dusra me bada
                merged[x++] = arr[indx1++]; // merged[x] me dal denge apna array of indx1 ko q ki wu chota hai aur indx
                                            // ko ++ kardenge
            } else {
                merged[x++] = arr[indx2++]; // nahi to dal denege array of indx2 ko
            }
        }

        // ab jo element jada hai comaparision se wunko waise hi likhdo qki wu sorted
        // hai mere bhai

        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }
        while (indx2 <= end_indx) {
            merged[x++] = arr[indx2++];
        }
        for (int i = 0, j = start_indx; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int start_index, int end_index) {
        if (start_index >= end_index) {
            return; // divide tbtak karo jab tak ek element na bach jaiye
        }
        int mid = start_index + (end_index - start_index) / 2; // DIVIDE
        divide(arr, start_index, mid);// divide call for left side
        divide(arr, mid + 1, end_index);// divide call for right side
        conquer(arr, start_index, mid, end_index);
    }

    public static void main(String[] args) {
    
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
