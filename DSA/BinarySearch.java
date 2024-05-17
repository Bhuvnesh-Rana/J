public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,3,6,8,10};
        int target = 81;
        int result = binarySearch(a,target);

        if (result!=-1) {
            System.out.println("Element found in array index: "+result+".");
        }
        else
        System.out.println("Elemen not found.");

    }

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
