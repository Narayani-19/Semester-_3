/* Write a program to create a class named 'Student' with members 'name', 'roll', ‘branch’. Declare two methods to input the student details and display the details of the student.
Create a Main class to test the functionalities of the above class.*/
import java.util.scanner;
class Student{
    String name,branch;
    int roll;
    public static void getter(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name, branch and roll_no respectively");
      name = sc.next();
      branch = sc.next();
      roll = sc.nextInt();
    }
    public static void display()
    {
        System.out.println("Name:-"+name);
        System.out.println("Name:-"+branch);
        System.out.println("Name:-"+roll);
    }
}    
class CallStudent{
    public static void main(String s[])
    {
        Student.getter();
        Student.display();
    }
}
