class Q1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Thread Class: " + t.getClass());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Thread Group: " + t.getThreadGroup());
    }
}
