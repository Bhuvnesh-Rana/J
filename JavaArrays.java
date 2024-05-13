
public class JavaArrays {

    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("home");

        int []a={1,4,2,6,8};
        for(int b:a)
            System.out.print(b+" ");

            System.out.println();

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

            System.out.println();

        for(int i=0;i<=4;i++){
            for(int k=1;k<=i;k++){
                System.out.print("  ");
            }
            for(int j=i;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}