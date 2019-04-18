public class Main {

    private static final long MAX_MEMERY = Runtime.getRuntime().maxMemory();

    public static void main(String[] args) {
        final int NCPU = Runtime.getRuntime().availableProcessors();
        final long FREE_MEMERY = Runtime.getRuntime().freeMemory();
        System.out.println("Hello World! " + NCPU + " 个cpu");
        System.out.println(FREE_MEMERY + " 空闲内存");
        System.out.println(MAX_MEMERY + " 最大内存");
    }
}



