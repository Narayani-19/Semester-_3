import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String w : arr) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1))
              .append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
