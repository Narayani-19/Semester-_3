import java.util.Scanner;

class Student50 {
    int regNo;
    String stdName, branch;
    double CGPA;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regNo, name, branch, CGPA:");
        regNo = sc.nextInt();
        sc.nextLine();
        stdName = sc.nextLine();
        branch = sc.nextLine();
        CGPA = sc.nextDouble();
    }

    void display() {
        System.out.println(regNo + "  " + stdName + "  " + branch + "  " + CGPA);
    }
}

class Driver6 {
    public static void main(String[] args) {
        Student50[] s = new Student50[50];

        for (int i = 0; i < 50; i++) {
            s[i] = new Student50();
            s[i].input();
        }

        double max = s[0].CGPA;
        int index = 0;

        for (int i = 1; i < 50; i++) {
            if (s[i].CGPA > max) {
                max = s[i].CGPA;
                index = i;
            }
        }

        System.out.println("Student with highest CGPA:");
        s[index].display();
    }
}
