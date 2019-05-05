public class Main {

    private static final long MAX_MEMERY = Runtime.getRuntime().maxMemory();

    public static void main(String[] args) {
       /* final int NCPU = Runtime.getRuntime().availableProcessors();
        final long FREE_MEMERY = Runtime.getRuntime().freeMemory();
        System.out.println("Hello World! " + NCPU + " 个cpu");
        System.out.println(FREE_MEMERY + " 空闲内存");
        System.out.println(MAX_MEMERY + " 最大内存");*/
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Hoder(i).asserSanity();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Hoder(i).asserSanity();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Hoder(i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                new Hoder(i).asserSanity();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                new Hoder(i).asserSanity();
            }
        }).start();
    }
}

class Hoder {
    private int n;

    public Hoder(int n) {
        this.n = n;
    }

    public void asserSanity() {
        if (n != n) {
            System.out.println("=====================");
        }
        System.out.println("........");
    }
}



