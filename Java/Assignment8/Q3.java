import java.util.Scanner;

class ArmCheck implements Runnable {
    int n;
    ArmCheck(int num){
      n = num;
    }

    public void run() {
        int temp = n, sum = 0;
        while(temp > 0){
            int d = temp % 10;
            sum += d*d*d;
            temp /= 10;
        }
        if(sum == n) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong");
    }
}

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        ArmCheck obj = new ArmCheck(n);
        Thread t = new Thread(obj);
        t.start();
    }
}
