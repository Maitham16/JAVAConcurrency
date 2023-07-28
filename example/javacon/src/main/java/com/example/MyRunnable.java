package example.javacon.src.main.java.com.example;

public class MyRunnable implements Runnable {

    private String taskName;

    public MyRunnable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is starting");
        try {
            Thread.sleep(2000); // Simulate time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " has finished");
    }
}

