class AddThread extends Thread {
    int start, end;
    static int total = 0;

    AddThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        for(int i=start; i<=end; i++) {
            synchronized(AddThread.class) {
                total += i;
            }
        }
    }
}

class Q10 {
    public static void main(String[] args) {
        int n = 10;

        AddThread t1 = new AddThread(1, 5);
        AddThread t2 = new AddThread(6, 10);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {}

        System.out.println("Sum = " + AddThread.total);
    }
}
