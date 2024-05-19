import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrays {

    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("home");

        //problem 1 sort numeric and alphabetic array..
        int []a={10,30,80,20,60,50};
        // Arrays.sort(a);
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
        int []b=new int[6];
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        System.out.println(Arrays.toString(b));

        //problem 9 insert element at a specific position.      ???????????
        int pos=1;
        int val=11;
        for(int i=a.length-1;i<pos;i--){
            a[i]=a[i-1];
        }
        a[pos]=val;
        System.out.println(Arrays.toString(a)+"ckjn");

        //problem 10 find max and min value in array.
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("Maximum no. is: "+max);

        //problem 11 reverse an array.
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(a));

        //problem 12 find duplicate elements in an array.
        int bb [] = {1,2,4,2,6,3,7};
        for(int i=0;i<bb.length-1;i++){
            for(int j=i+1;j<bb.length;j++){
                if (bb[i]==bb[j] && i!=j){
                    System.out.println("duplicate element found: "+bb[i]);
                }
            }
           
        }

        //problem 13 find dulplicate elements in an String array.
        String cc[]={"abc","def","ghi","def","abc"};
        for(int i=0;i<cc.length-1;i++){
            for(int j=i+1;j<cc.length;j++){
                if((cc[i].equals(cc[j])) && (i!=j)){
                    System.out.println("duplicate element found: "+cc[i]);
                }
            }
        }

        //problem 14 find common elements in two string arrays.
        String cc1[]={"xyz","abc","nppm"};
        for(int i=0;i<cc.length;i++){
            for(int j=i;j<cc1.length;j++){
                if (cc[i].equals(cc1[j])) {
                    System.out.println("same elemesnts found: "+cc[i]);
                }
            }
          
        }


        //problem 15 find commmon elements in two arrays.
        int nums[]={4,2,1,5,3,9};
        int nums1[]={6,8,4,2,19,9};
        List<Integer> common = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums1.length;j++){
                if (nums[i]==nums1[j]) {
                    common.add(nums[i]);
                }
            }
        }
        System.out.println("Common elements are: "+common);


        //problem 16 remove duplicate elements from an array.

        //problem 17 find second largest no.
        Arrays.sort(nums);
        System.out.println("Second largest no. is: "+nums[nums.length-2]);

        //problem 18 find second smallest no.
        System.out.println("Second smallest no. is: "+nums[1]);
        
        
        

    }
}