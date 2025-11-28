class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle1 extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square1 extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
    void erase() {
        System.out.println("Erasing Square");
    }
}

class Driver3 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        s = new Triangle1();
        s.draw();
        s.erase();

        s = new Square1();
        s.draw();
        s.erase();
    }
}
