import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}

class Driver4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth:");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Area a = new Area();
        a.setDim(l, b);

        System.out.println("Area = " + a.getArea());
    }
}
