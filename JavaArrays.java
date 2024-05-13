import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("home");

        //problem 1 sort numeric and alphabetic array..
        int []a={10,30,80,20,60,50};
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();

        //problem 2 sum of values of array.
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum is: "+sum);

        //problem 3 grid output
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("- ");
            }
            System.out.println();
        }

        //problem 4 avg of integer array.
        int avg = sum/a.length;
        System.out.println("Average is: "+avg);

        //problem 5 check if array contains a specific element.
        int e = 990;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if (a[i]==e) {
                System.out.println("Element "+e+" is present in the array.");
                flag=true;
                break;
            }    
        }
        if (!flag) {
            System.out.println("Element not present in the array.");
        }

        //problem 6 find index of a array.
        int e1=50;
        for(int i=0;i<a.length;i++){
            if (a[i]==e1) 
                System.out.println("Element is present in "+i+" position.");
        }

        //problem 7 remove specific element from the array
        int removeIndex=3;
        for(int i=removeIndex;i<a.length-1;i++){
            a[i]=a[i+1];
            
        }
        System.out.println(Arrays.toString(a));

        //problem 8 copy an array by uterating it.



    }
}