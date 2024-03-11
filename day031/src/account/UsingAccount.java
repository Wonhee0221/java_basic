package account;

public class UsingAccount extends Account{

    private String cardNum;

    public UsingAccount(String cardNum) {
        this.cardNum = cardNum;
    }

    public UsingAccount(String accNum, String custName, long balance, double interest, String cardNum) {
        super(accNum, custName, balance, interest);
        this.cardNum = cardNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void transfer(String accNum, long money){
        //대충 accNum에 money 입금하는 로직
        withdraw(money);
    }
}
