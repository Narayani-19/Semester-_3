class Point2D {
    int x, y;

    Point2D() {
        x = 0;
        y = 0;
    }

    Point2D(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("X: " + x + " Y: " + y);
    }
}

class Point3D extends Point2D {
    int z;

    Point3D(int a, int b, int c) {
        super(a, b);
        z = c;
    }

    void show() {
        System.out.println("X: " + x + " Y: " + y + " Z: " + z);
    }
}

class Driver5 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(5, 10);
        p1.display();

        Point3D p2 = new Point3D(5, 10, 15);
        p2.show();
    }
}
