import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            System.out.println("Value: " + arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range.");
        }
    }
}
