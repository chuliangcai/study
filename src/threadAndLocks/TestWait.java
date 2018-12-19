package threadAndLocks;

public class TestWait {
    public static void main(String[] args) {
        TestWait testWait = new TestWait();

        Thread t = new Thread(() -> {

            try {
                testWait.sayHello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void sayHello() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+"before wait");
        System.out.println();
        this.wait();
        System.out.println(threadName+"after wait");
    }
}
