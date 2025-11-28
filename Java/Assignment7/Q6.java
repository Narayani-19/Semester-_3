import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet, inch;

        while(true){
            try {
                System.out.print("Enter feet: ");
                feet = sc.nextDouble();

                System.out.print("Enter inches: ");
                inch = sc.nextDouble();

                if(feet < 0 || inch < 0){
                    throw new Exception("Negative values not allowed.");
                }

                double cm = (feet * 30.48) + (inch * 2.54);
                System.out.println("Length in CM: " + cm);
                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
            }
        }
    }
}
