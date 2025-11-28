class TableThread extends Thread {
    int n;
    TableThread(int x){
      n=x;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}

class FactThread extends Thread {
    int n;
    FactThread(int x){
      n=x;
    }
    public void run(){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}

class Q7 {
    public static void main(String[] args) {
        int n = 5;

        TableThread t1 = new TableThread(n);
        FactThread t2 = new FactThread(n);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Both tasks completed.");
    }
}

