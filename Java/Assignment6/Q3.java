abstract class Shape {
    abstract void RectangleArea(int l, int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}

class Area extends Shape {

    void RectangleArea(int l, int b) {
        System.out.println("Rectangle Area: " + (l * b));
    }

    void SquareArea(int s) {
        System.out.println("Square Area: " + (s * s));
    }

    void CircleArea(int r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Driver3 {
    public static void main(String[] args) {

        Area a = new Area();
        a.RectangleArea(10, 5);
        a.SquareArea(6);
        a.CircleArea(4);
    }
}
