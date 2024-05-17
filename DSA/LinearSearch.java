class LinearSearch{
    public static void main(String[] args) {

        //Linear Search.
        int a[]={4,2,8,7,1};
        int target = 7;
        boolean flag=false;
        int steps=0;

        for(int i=0;i<a.length;i++){
            steps++;
            if (a[i]==target) {
                System.out.println("Element "+target+" found at array index "+i+".");
                flag=true;
                break;
            }
        }
        System.out.println("No. of steps: "+steps);
        if (flag==false)
            System.out.println("Element not present in the array.");
        
        // best case, element found in first position time complexity = O(1).
        // worst case time complexity = O(n).   n is size of the list.

    }
}