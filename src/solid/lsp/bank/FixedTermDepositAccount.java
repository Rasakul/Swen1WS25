package solid.lsp.bank;

import java.time.LocalDate;

class FixedTermDepositAccount extends Account
        implements Depositable {
    private final LocalDate maturity;

    public FixedTermDepositAccount(double initial, LocalDate maturity) {
        super(initial);
        this.maturity = maturity;
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal not allowed before " + maturity);
    }

}