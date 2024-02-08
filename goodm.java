class Threads extends Thread {
    public void run() {
        System.out.println("current thread:"+Thread.currentThread().getState());
        int i=0;
        while (i<10) {
            System.out.println("Good morning");
            System.out.println("Welcome!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            i++;
        }
        
    }
}

public class goodm {
    public static void main(String[] args) {
        Threads t = new Threads();
         
        System.out.println("State of the thread : "+t.getState());
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("State of the thread : "+t.getState());
    }
}
