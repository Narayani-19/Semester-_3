/*Write a program to print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
Define another Main class to demonstrate the basic operation.*/
import java.util.Scanner;
class Average {
    public static void cal(int a, int b, int c) {
        float avg = (a+b+c)/3.0f;
        System.out.println("The average of the three numbers is:-"+avg);
    }
}

class Calavg {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average.cal(a,b,c);
       
    }
}
