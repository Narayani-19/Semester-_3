import java.util.*;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        StringBuffer sb = new StringBuffer(s);
        System.out.println("Total characters: " + sb.length());
    }
}
