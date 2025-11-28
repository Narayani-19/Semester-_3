class MinimumBalanceException extends Exception {
    MinimumBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String n, int a, double b) {
        name = n;
        acc_no = a;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Balance below minimum limit.");
        }
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }
}

class Q5 {
    public static void main(String[] args) {
        Account a = new Account("Rahul", 101, 1000);

        try {
            a.withdraw(600);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
