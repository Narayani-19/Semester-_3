import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();

        while (true) {
            try {
                System.out.print("Enter number 2: ");
                n2 = sc.nextInt();
                int res = n1 / n2;
                System.out.println("Result: " + res);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Try again.");
            }
        }
    }
}
