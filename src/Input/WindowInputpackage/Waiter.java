package Input.WindowInputpackage;

public class Waiter {
    private final Thread thread;

    public Waiter(Thread thread) {
        this.thread = thread;
    }

    public void waiting() {
        try {
            thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
        }
    }
}
