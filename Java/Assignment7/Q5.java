class MinimumBalanceException2 extends Exception {
    MinimumBalanceException2(String msg) {
        super(msg);
    }
}

class Account2 {
    String name;
    int acc_no;
    double balance;

    Account2(String n, int a, double b) {
        name = n;
        acc_no = a;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) throws MinimumBalanceException2 {
        if (balance - amt < 500) {
            throw new MinimumBalanceException2("Balance too low.");
        }
        balance -= amt;
    }

    void transfer(Account2 to, double amt) throws MinimumBalanceException2 {
        withdraw(amt);
        to.deposit(amt);
        System.out.println("Transferred: " + amt);
    }
}

class Q6 {
    public static void main(String[] args) {
        Account2 a1 = new Account2("Amit", 1, 2000);
        Account2 a2 = new Account2("Sumit", 2, 1000);

        try {
            a1.transfer(a2, 1800);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

