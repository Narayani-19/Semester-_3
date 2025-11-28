class EvenThread extends Thread {
    int a[], b[], res[];
    EvenThread(int x[], int y[], int r[]){ a=x;b=y;res=r; }

    public void run(){
        for(int i=0;i<a.length;i+=2){
            res[i] = a[i] * b[i];
        }
    }
}

class OddThread extends Thread {
    int a[], b[], res[];
    OddThread(int x[], int y[], int r[]){ a=x;b=y;res=r; }

    public void run(){
        for(int i=1;i<a.length;i+=2){
            res[i] = a[i] * b[i];
        }
    }
}

class Q9 {
    public static void main(String[] args) throws Exception {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
        int res[]=new int[a.length];

        Thread t1 = new EvenThread(a,b,res);
        Thread t2 = new OddThread(a,b,res);

        t1.start();
        t2.start();

       try {
          t1.join();
          t2.join();
      } catch(Exception e) {
        System.out.println("Thread Interrupted");
        }


        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
