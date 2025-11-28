interface A {
    void show();
}

interface B {
    void display();
}

class TestClass implements A, B {

    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}

class Driver4 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.show();
        t.display();
    }
}
