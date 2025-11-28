class SquareThread extends Thread {
    int n;
    SquareThread(int x){ 
      n=x;
    }
    public void run(){
        System.out.println("Square: " + (n*n));
    }
}

class SumThread extends Thread {
    int n;
    SumThread(int x){
      n=x;
    }
    public void run(){
        int temp=n, sum=0;
        while(temp>0){
            sum += temp%10;
            temp/=10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

class Q6 {
    public static void main(String[] args) {
        int n=123;
        new SquareThread(n).start();
        new SumThread(n).start();
    }
}
