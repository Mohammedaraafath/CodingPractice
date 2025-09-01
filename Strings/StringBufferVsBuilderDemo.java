package Strings;

public class StringBufferVsBuilderDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Using StringBuffer (Thread-Safe) ===");
        testStringBuffer();

        System.out.println("\n=== Using StringBuilder (Not Thread-Safe) ===");
        testStringBuilder();
    }

    // -------------------------
    // StringBuffer Example
    // -------------------------
    private static void testStringBuffer() throws InterruptedException {
        StringBuffer buffer = new StringBuffer("Start");

        // Two threads appending to the same StringBuffer
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                buffer.append("B");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Always consistent length = 5 (Start) + 2000
        System.out.println("Final Length (Buffer) : " + buffer);
        System.out.println("Final Length (Buffer) : " + buffer.length());
    }

    // -------------------------
    // StringBuilder Example
    // -------------------------
    private static void testStringBuilder() throws InterruptedException {
        StringBuilder builder = new StringBuilder("Start");

        // Two threads appending to the same StringBuilder
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                builder.append("X");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                builder.append("Y");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Expected length = 2005 (but sometimes it may be less!)
        System.out.println("Final Length (Builder): " + builder.length());
    }
}
