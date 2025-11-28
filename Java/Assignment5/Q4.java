abstract class Figure2 {
    int d1, d2;

    Figure2(int a, int b){
        d1 = a;
        d2 = b;
    }

    abstract double getArea();
}

class Rect2 extends Figure2 {
    Rect2(int a, int b){
        super(a, b);
    }

    double getArea(){
        return d1 * d2;
    }
}

class Tri2 extends Figure2 {
    Tri2(int a, int b){
        super(a, b);
    }

    double getArea(){
        return (d1 * d2)/2;
    }
}

class Driver4 {
    public static void main(String[] args) {
        Figure2 f;

        f = new Rect2(10, 5);
        System.out.println("Rectangle area: " + f.getArea());

        f = new Tri2(10, 5);
        System.out.println("Triangle area: " + f.getArea());
    }
}
