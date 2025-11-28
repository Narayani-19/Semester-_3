import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        StringBuffer sb = new StringBuffer(s);
        String rev = sb.reverse().toString();

        System.out.println("Reverse: " + rev);

        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
