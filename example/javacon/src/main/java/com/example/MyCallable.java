package example.javacon.src.main.java.com.example;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private String taskName;

    public MyCallable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        System.out.println(taskName + " is starting");
        Thread.sleep(3000); // Simulate time-consuming task
        System.out.println(taskName + " has finished");
        return taskName + " should return this string";
    }
}
