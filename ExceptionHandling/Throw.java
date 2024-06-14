package ExceptionHandling;

// e.g. if primary db stops working due to some reason then rather than showing msg db error handle the eception
// by using throw keyword and writing login to connect to the secondary db.
public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18/i;       //as i>j will give ans 0 after deviding. i want something else insted of 0(i.e handeling)
            if (j == 0) {
                throw new ArithmeticException("i > j"); //
            }
        } catch (ArithmeticException e) {
            j=-1;
            System.out.println("My default ans. -1 "+ e);
        }
        System.out.println(j);
    }
}
