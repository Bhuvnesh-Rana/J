class Counter{
    int count;
    public synchronized void counter(){     //to remove data inconsistency, from using multiple threads using 
        count++;                            //same java obj.
    }                                       // synchronized for blocks/meyhods - volatile for variables only.
}


public class RaceCondition {
    public static void main(String[] args) {

        Counter count = new Counter();

        Runnable obj1 = () -> {
                for(int i = 0; i < 1000; i++){
                    count.counter();
                }
        };

        Runnable obj2 = () -> {
                for(int i = 0; i < 1000; i++){
                    count.counter();
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        try {
            t1.join();                    // waits for thread to die and then main thread will execute syso.
            t2.join();                    // otherwise thread woking simultaneously and main printing count
        } catch (InterruptedException e) {  // before t1 or t2 has finished their task.
            e.printStackTrace();
        }
        
        System.out.println(count.count);
        
    }
    
}