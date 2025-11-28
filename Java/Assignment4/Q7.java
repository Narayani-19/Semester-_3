class Box {
    int width, height, depth;

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }
}

class Driver7 {
    public static void main(String[] args) {
        Box b = new Box(3, 4, 5);
        System.out.println("Volume = " + b.volume());
    }
}
