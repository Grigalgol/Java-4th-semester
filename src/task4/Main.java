package task4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyExecutesService myExecutesService = new MyExecutesService(2);
        myExecutesService.submit(new MyRunnable());
        System.out.println(myExecutesService.submit(new MyCallable()).get());
        myExecutesService.shutdown();
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("1");
        }
    }

    static class MyCallable implements Callable {

        @Override
        public Object call() throws Exception {
            return "2";
        }
    }

}
