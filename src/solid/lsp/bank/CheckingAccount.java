package solid.lsp.bank;

class CheckingAccount extends Account
        implements Withdrawable, Depositable {

    public CheckingAccount(double initial) {
        super(initial);
    }

}
