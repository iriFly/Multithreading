public class exampleMultiThreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        //To see the current status of the thread:
        //Be careful: if the thread is long and complicated we could miss the RUNNABLE part as the program will simply skip it and will continue reading the rest of the code.
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Method main ends");

    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
