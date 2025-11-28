class ComplexNum {
    int real, img;

    ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real, this.img + c.img);
    }
}

class Driver8 {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(4, 3);
        ComplexNum c2 = new ComplexNum(2, 5);

        ComplexNum c3 = c1.addCompNumber(c2);

        c1.displayCompNumber();
        c2.displayCompNumber();
        System.out.println("Addition:");
        c3.displayCompNumber();
    }
}
