import java.util.*;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String w : arr) {
            sb.append(w.charAt(0));
        }

        System.out.println("Initials: " + sb.toString().toUpperCase());
    }
}
