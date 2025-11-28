class Bank {
    int getRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getRate() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRate() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRate() {
        return 9;
    }
}

class Driver6 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interest : " + s.getRate());
        System.out.println("ICICI Rate of Interest : " + i.getRate());
        System.out.println("AXIS Rate of Interest : " + a.getRate());
    }
}
