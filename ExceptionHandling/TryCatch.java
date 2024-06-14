package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int i = 2;
        int a[]= new int[5];
        try {
            int j = 18/i;
            System.out.println(j);
            System.out.println(a[5]);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception. "+e.getLocalizedMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds. "+e.getLocalizedMessage());
        }
        catch (Exception e) {           // parent Exception class at the end otherwise above catch block will be unreachable.
            System.out.println(e);
        }
    }
}
