package sorting;

public class Merge {

    public static void conquer(int arr[] , int si , int mid, int ei){
            int merged[] = new int[ei -si +1]; // ek temporory array bano jo merged aur sorted value lega
                                                // sizee hoga     

                                        // Left part: [6, 3, 9]
                                        // Right part: [5, 2, 8]


            int indx1 = si; //** starting of pehla element of left arrray matlb 6se
            int indx2 = mid+1;//** starting of pehla element of right array arrray matlb 6se
            int x =0;

            while(indx1 <= mid && indx2 <= ei){
                if(arr[indx1] <= arr[indx2]){ // compare krenge ki pehle me chota dusra me bada
                    merged[x++] = arr[indx1++]; //merged[x] me dal denge apna array of indx1 ko q ki wu chota hai aur indx ko ++ kardenge
                } else{
                    merged[x++] = arr[indx2++]; //nahi to dal denege array of indx2 ko
                }
            }

            // ab jo element jada hai comaparision se wunko waise hi likhdo qki wu sorted hai mere bhai

            while(indx1 <= mid){
                merged[x++] = arr[indx1++];
            }
            while(indx2 <= ei){
                merged[x++] = arr[indx2++];
            }
            for(int i=0, j =si; i<merged.length;i++,j++){
                arr[j] = merged[i];
            }
    }

    public static void divide(int arr[], int si,int ei){
        if(si >= ei){
            return;  // divide tbtak karo jab tak ek element na bach jaiye
        }
        int mid = si+(ei-si)/2; //DIVIDE
        divide(arr, si, mid);//divide call for left side
        divide(arr, mid+1, ei);//divide call for right side
        conquer(arr , si , mid ,ei);
    }
    public static void main(String[] args) {
        
        int arr[]  ={6,3,9,5,2,8};
        int n = arr.length;  
        divide(arr, 0,n-1);

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
                    public static void didvide2(int arr[], int st, int len){

                         if(st >= len){
                                return;  // divide tbtak karo jab tak ek element na bach jaiye
                            }
                        int mid = st +(len - st)/2;
                    
                    //     didvide2(arr,st,mid);
                    //     didvide2(arr,mid+1,len);
                    //     conqu(arr, st, mid, len);
                    // }
                    
                    
                    // public static void conqu(int arr[], int st, int mid, int len){
                    //     int milao[] = new int[len-st+1];
                    
                    //     int surwat= st;
                    //     int akhri = len;
                    //     int ginti =0;
                    
                    
                    //     while(arr[surwat] <= mid && arr[akhri] <= len){
                    //         if(arr[surwat] <= arr[akhri]){
                    //             milao[ginti++] = arr[surwat++];
                    //         }else{
                    //             milao[ginti++] = arr[akhri++];
                    //         }
                    //     }
                    
                    
                    //             while(surwat <= mid){
                    //                 milao[ginti++] = arr[surwat++];
                    //             }
                    
                    //             while(akhri <= len){
                    //                 milao[ginti++] = arr[akhri++];
                    //             }
                    
                    //      for(int i=0, j =st; i<milao.length;i++,j++){
                    //                 arr[j] = milao[i];
                    //             }
                    
                        
                    // }
}

