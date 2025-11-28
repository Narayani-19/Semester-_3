import java.util.*;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());

        System.out.print("Enter second string: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        if(sb1.toString().equals(sb2.toString()))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
