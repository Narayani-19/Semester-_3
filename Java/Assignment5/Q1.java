class Account {
    String cname;
    int accno;

    Account(String n, int a) {
        cname = n;
        accno = a;
    }

    void display() {
        System.out.println("Customer Name: " + cname);
        System.out.println("Account Number: " + accno);
    }
}

class Savings_Account extends Account {
    int min_bal;
    int sav_bal;

    Savings_Account(String n, int a, int m, int s) {
        super(n, a);
        min_bal = m;
        sav_bal = s;
    }

    void show() {
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + sav_bal);
    }
}

class Account_details extends Savings_Account {
    int dep;
    int wd;

    Account_details(String n, int a, int m, int s, int d, int w) {
        super(n, a, m, s);
        dep = d;
        wd = w;
    }

    void show1() {
        System.out.println("Deposit: " + dep);
        System.out.println("Withdrawal: " + wd);
    }
}

class Driver1 {
    public static void main(String[] args) {
        Account_details obj = new Account_details("Rohan", 1234, 1000, 5000, 2000, 500);
        obj.display();
        obj.show();
        obj.show1();
    }
}
