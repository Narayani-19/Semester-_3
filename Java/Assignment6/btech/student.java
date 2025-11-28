package btech;

public class Student {
    String name;
    int m1, m2, m3;

    public Student(String n, int a, int b, int c) {
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public void display() {
        System.out.println("Name: " + name);
        int total = m1 + m2 + m3;
        double per = total / 3.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per);
    }
}
