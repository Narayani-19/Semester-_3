import java.util.*;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String s = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        int start = s.indexOf(oldWord);
        StringBuffer sb = new StringBuffer(s);

        if(start != -1) {
            sb.replace(start, start + oldWord.length(), newWord);
            System.out.println("Result: " + sb);
        } else {
            System.out.println("Word not found.");
        }
    }
}
