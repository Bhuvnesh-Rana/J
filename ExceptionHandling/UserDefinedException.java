package ExceptionHandling;

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class UserDefinedException {
    public static void main(String[] arg) {
        int i = 19;
        int j = 0;

        try {
            j = 18/i;
            if (j == 0) {
                throw new MyException("Issue occured.");
            }
        } catch (ArithmeticException | MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
