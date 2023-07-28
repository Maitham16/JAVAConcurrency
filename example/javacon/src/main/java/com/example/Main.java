package example.javacon.src.main.java.com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        MyRunnable runnableTask = new MyRunnable("Runnable task");
        Thread thread = new Thread(runnableTask);
        thread.start(); // This will call runnableTask.run()

        MyCallable callableTask = new MyCallable("Callable task");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callableTask); // This will call callableTask.call()

        // get() blocks until the task completes
        System.out.println("Callable task's result: " + future.get());

        // Shut down the executor service
        executorService.shutdown();
    }
}
