interface Servicing {
    void getServiceTime();
}

class Car implements Servicing {
    public void getServiceTime() {
        System.out.println("Car Service Time: 2 hours");
    }
}

class Bike implements Servicing {
    public void getServiceTime() {
        System.out.println("Bike Service Time: 1 hour");
    }
}

class Driver5 {
    public static void main(String[] args) {
        Servicing s;

        s = new Car();
        s.getServiceTime();

        s = new Bike();
        s.getServiceTime();
    }
}
