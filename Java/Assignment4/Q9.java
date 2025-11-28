class Point {
    int xCo, yCo;

    Point(int xCo, int yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }

    double distanceBetPoints(Point p) {
        return Math.sqrt((p.xCo - this.xCo) * (p.xCo - this.xCo) +
                         (p.yCo - this.yCo) * (p.yCo - this.yCo));
    }
}

class Driver9 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);

        System.out.println("Distance = " + p1.distanceBetPoints(p2));
    }
}
