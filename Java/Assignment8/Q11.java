class MinThread extends Thread {
    int arr[], start, end;
    static int min = Integer.MAX_VALUE;

    MinThread(int a[], int s, int e) {
        arr = a;
        start = s;
        end = e;
    }

    public void run() {
        for(int i=start; i<end; i++) {
            synchronized(MinThread.class) {
                if(arr[i] < min) min = arr[i];
            }
        }
    }
}

class Q11 {
    public static void main(String[] args) {

        int arr[] = {8, 3, 9, 1, 7, 2};

        MinThread t1 = new MinThread(arr, 0, 3);
        MinThread t2 = new MinThread(arr, 3, 6);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {}

        System.out.println("Minimum = " + MinThread.min);
    }
}
