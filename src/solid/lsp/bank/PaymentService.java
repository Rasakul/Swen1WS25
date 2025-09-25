package solid.lsp.bank;

class PaymentService {

    public void collectFee(Withdrawable account, double fee) {
        account.withdraw(fee);
    }

    public void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }

}