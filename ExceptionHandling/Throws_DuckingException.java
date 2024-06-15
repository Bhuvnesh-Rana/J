package ExceptionHandling;

class A{
    public void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}

class B{
    public int div() throws ArithmeticException {
        int i = 0;
        int j = 18/i;
        return j;
    }
}

public class Throws_DuckingException {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found..");
            // e.printStackTrace();
        }

        B obj1 = new B();
        try {
            System.out.println(obj1.div());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
