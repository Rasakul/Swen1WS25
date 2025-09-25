package solid.lsp.bank;

class Account {
    protected double balance;

    public Account(double initial) {
        this.balance = initial;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("amount > 0");
        if (amount > balance) throw new IllegalStateException("insufficient funds");
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("amount > 0");
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
