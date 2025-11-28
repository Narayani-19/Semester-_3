import org.shapes.*;

class Test3 {
    public static void main(String[] args) {

        Square s = new Square();
        s.area(5);
        s.peri(5);

        Circle c = new Circle();
        c.area(4);
        c.peri(4);

        Triangle t = new Triangle();
        t.area(6,4);
        t.peri(3,4,5);
    }
}
