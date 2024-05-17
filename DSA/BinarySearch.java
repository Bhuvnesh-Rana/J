public class BinarySearch {
    public static void main(String[] args) {        //BINARY SEARCH WORKS ON SORTED ARRAY.
        int a[]={1,3,6,8,10};
        int target = 3;
        int result = binarySearch(a,target);
        // int result1 = binarySearch(a, target, 0, a.length-1);    //RECURSION

        if (result!=-1) {
            System.out.println("Element found in array index: "+result+".");
        }
        else
        System.out.println("Elemen not found.");

    }
//RECURSION
    // private static int binarySearch(int[] a, int target, int left, int right) {
    //     if (left<=right) {
    //         int mid1 = (left+right)/2;
    //         if (a[mid1]==target) 
    //             return mid1;
            
    //         else if(a[mid1]<target)
    //             binarySearch(a, target, mid1+1, right);
            
    //         else
    //             binarySearch(a, target, left, mid1-1);
    //     }
    //     return -1;
    // }

    public static int binarySearch(int[] a, int target) {
        int left =0;
        int right =a.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if (a[mid]==target) {
                return mid;
            }
            else if(a[mid]<target){
                left=mid+1;
            }
            else
            right=mid-1;
        }
        return -1;

        //time complexity: O(log n).
        
    }
}
