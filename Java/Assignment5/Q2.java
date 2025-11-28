class Figure {
    int d1, d2;

    Figure(int x, int y) {
        d1 = x;
        d2 = y;
    }

    double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(int x, int y) {
        super(x, y);
    }

    double area() {
        return d1 * d2;
    }
}

class Triangle extends Figure {
    Triangle(int x, int y) {
        super(x, y);
    }

    double area() {
        return (d1 * d2) / 2;
    }
}

class Square extends Figure {
    Square(int x) {
        super(x, x);
    }

    double area() {
        return d1 * d1;
    }
}

class Driver2 {
    public static void main(String[] args) {
        Figure f;

        f = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + f.area());

        f = new Triangle(10, 5);
        System.out.println("Triangle Area: " + f.area());

        f = new Square(5);
        System.out.println("Square Area: " + f.area());
    }
}
