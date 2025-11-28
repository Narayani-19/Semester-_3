class OddThread extends Thread {
    int m, n;
    OddThread(int a, int b){
      m=a; 
      n=b;
    }

    public void run(){
        for(int i=m;i<=n;i++){
            if(i%2!=0) System.out.print(i+" ");
        }
    }
}

class Q5 {
    public static void main(String[] args) {
        int m=1, n=20;

        OddThread t = new OddThread(m,n);
        t.start();

        for(int i=m;i<=n;i++){
            if(i%2==0) System.out.print(i+" ");
        }
    }
}
