public class BubbleSort {
    
    public static void main(String[] args) {            //time complexity O(n^2)  2 for loops.
        int a[]={4,2,6,8,1,7};
        System.out.println("Array before swapping: ");
        for (int i : a) {
            System.out.print(i+" ");
        }
        for(int i=0; i<a.length; i++){
            for(int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp; 
                }
                
                }
                System.out.println();
                for (int k : a) {
                    System.out.print(k+" ");
                
            }
        }
        System.out.println();
        System.out.println("After sorting: ");
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
