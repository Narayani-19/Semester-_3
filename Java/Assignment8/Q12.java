class Store {
    int num;
    boolean ready = false;
}

class Producer extends Thread {
    Store s;
    Producer(Store st){ s = st; }

    public void run() {
        for(int i=0;i<10;i++) {
            synchronized(s) {
                s.num = (int)(Math.random()*100)+1;
                System.out.println("Produced: " + s.num);
                ready = true;
                s.notify();
                try{ s.wait(); } catch(Exception e){}
            }
        }
    }
}

class Consumer extends Thread {
    Store s;
    int count = 0;

    Consumer(Store st){
      s = st;
    }

    public void run() {
        for(int i=0;i<10;i++) {
            synchronized(s) {
                try{ 
                  s.wait();
                }catch(Exception e){}
                System.out.println("Consumed: " + s.num);

                if(s.num % 2 == 0) count++;

                s.notify();
            }
        }
        System.out.println("Total Even Numbers = " + count);
    }
}

class Q12 {
    public static void main(String[] args) {
        Store s = new Store();
        new Producer(s).start();
        new Consumer(s).start();
    }
}
