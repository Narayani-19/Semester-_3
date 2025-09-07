/*	Q6. Write a program that will take employee id, employee name, department number, salary from the command prompt. If the user does not
		provide exactly two numbers of arguments then the program should display error message. Use methods display() to display the record of
		employee.
*/

class Main {
   private static void display(String id, String name, int dNo, double salary) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department No.: " + dNo);
        System.out.println("Salary: " + salary); 
   }
  public static void main(String s[]) {
        if (args.length != 2) {
            System.out.println("wrong Input");
            return;
        }
        String id = s[0], name = s[1];
        int dNo = Integer.parseInt(s[2]);
        double salary = Double.parseDouble(s[3]);
        display(id, name, dNo, salary);
    }
}
