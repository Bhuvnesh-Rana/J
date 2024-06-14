
class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi "+i);
            try {                               // can set priority.
                Thread.sleep(80);       //machine fast, so printing thread at once hence using sleep().
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello "+i);
            try {
                Thread.sleep(80);    //machine fast, so printing thread at once hence using sleep().
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}

                // printing thread one after another

public class ExtendsThread {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();       //mthd call name start(), but in class A mthd name run.
        try {
            Thread.sleep(5);    //machine fast, so printing thread at once hence using sleep().
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();       //mthd call name start(), but in class B mthd name run.
    }
    
}