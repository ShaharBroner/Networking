public class MyThreadedClass implements Runnable {
    private static final int MAX = 100000;
    private String id;

    public MyThreadedClass(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX; i++) {
            System.out.println(id + " is on loop #" + i);
        }
    }
}
