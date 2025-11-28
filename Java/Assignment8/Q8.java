class MyThread1 extends Thread {
    public void run(){
        System.out.println("Thread 1 running");
    }
}

class MyThread2 extends Thread {
    public void run(){
        System.out.println("Thread 2 running");
    }
}

class Q8 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setPriority(3);
        t2.setPriority(8);

        System.out.println("Priority of T1 = " + t1.getPriority());
        System.out.println("Priority of T2 = " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
