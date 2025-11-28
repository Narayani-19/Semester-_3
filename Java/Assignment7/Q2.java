import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int diff = x - y;

        try {
            if (diff == 0) {
                throw new Exception("Error: (x - y) is zero. Cannot divide.");
            }

            double result = x / (double) diff;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
