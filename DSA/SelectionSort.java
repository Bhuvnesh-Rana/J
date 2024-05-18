public class SelectionSort {
    public static void main(String[] args) {        //time coplexity O(n^2) but efficient than bubble sort.
        int a[]={4,2,8,5,3,1,9};
        int minIndex=-1;

        System.out.println("Array before sorting:");
        for (int i : a) {
            System.out.print(i+" ");
        }
        
        for(int i=0;i<a.length-1;i++){
            minIndex=i;
            for(int j=i;j<a.length;j++){
                if (a[minIndex] > a[j]) {
                    minIndex=j;
                }
            }
            int temp = a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }

        System.out.println();
        System.out.println("Array after sorting:");
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
