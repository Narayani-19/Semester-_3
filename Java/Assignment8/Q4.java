import java.util.Scanner;

class PalThread extends Thread {
    int n;
    PalThread(int num){
      n = num;
    }

    public void run() {
        int temp = n, rev = 0;
        while(temp > 0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        if(rev == n) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==2) System.out.println("Prime");
        else System.out.println("Composite");

        PalThread t = new PalThread(n);
        t.start();
    }
}
