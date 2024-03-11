package account;

import java.time.LocalDate;

public class DepositAccount extends Account{

    private LocalDate expDate;
    private int period;

    public DepositAccount() { }

    public DepositAccount(String accNum, String custName, long balance, double interest, int period) {
        super(accNum, custName, balance, interest);
        this.expDate = getStartDate().plusMonths(period);
        this.period = period;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public int getPeriod() {
        return period;
    }

    public long Cancel() {

        long balance = getBalance();

        if (LocalDate.now().isBefore(expDate)) {
            System.out.println("아직 만기일 이전입니다.");
            return 0L;
        }

        withdraw(balance);
        return balance;
    }
}
