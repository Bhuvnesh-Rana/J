class AA implements Runnable{
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}

class BB implements Runnable{
    public void run(){
        for(int i = 0; i < 10 ;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class ImplementsRunnable {
    public static void main(String[] args) {


        AA obj1 = new AA();                                     // MTHD 1  class(ref var) to class(obj)
        Runnable obj2 = new BB();                               // MTHD 2  interface(ref var) to class(obj)

        Runnable obj3 = new Runnable() {                        // MTHD 3   anon inner class.
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println("tata");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    };
                }
            }
        };

        Runnable obj4 = () -> {                                  // MTHD 4     lambda functions.
                for(int i = 0; i < 10; i++){
                    System.out.println("bye");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    };
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
