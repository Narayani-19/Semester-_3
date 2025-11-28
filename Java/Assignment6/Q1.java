abstract class Bank {
    abstract int getROI();
}

class SBI extends Bank {
    int getROI() {
        return 7;
    }
}

class PNB extends Bank {
    int getROI() {
        return 8;
    }
}

class BOI extends Bank {
    int getROI() {
        return 9;
    }
}

class Driver1 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate : " + b.getROI());

        b = new PNB();
        System.out.println("PNB Rate : " + b.getROI());

        b = new BOI();
        System.out.println("BOI Rate : " + b.getROI());
    }
}
