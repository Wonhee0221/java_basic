package account;

public class App {
    public static void main(String[] args) {
        InstallmentAccount installmentAccount = new InstallmentAccount("1112","James",1000L,2.3, 12);
        DepositAccount depositAccount = new DepositAccount("1113", "한원희", 100000L, 6, 12);
        DepositAccount depositAccount2 = new DepositAccount("1114", "한원희", 1000000L, 5, 0);
        UsingAccount usingAccount = new UsingAccount("1115", "임탁균", 1000000L, 1.2, "1");

        System.out.println("생성된 계좌 정보 조회");
        System.out.println(installmentAccount);
        System.out.println(depositAccount);
        System.out.println(usingAccount);

        System.out.println();

        System.out.println("Test1 : 입출금 계좌에 입금하기");
        usingAccount.deposit(50000L);
        System.out.println("입금 후의 입출금 계좌 금액 조회 : " + usingAccount.getBalance());

        System.out.println();

        System.out.println("Test2 : 만기 이전 예금 계좌 해제하기");
        Long cash = depositAccount.Cancel();
        System.out.println("인출된 금액: " + cash);
        System.out.println("예금 계좌의 남은 금액: " + depositAccount.getBalance());

        System.out.println();

        System.out.println("Test3 : 만기된 예금 계좌 해제하기");
        Long cash2 = depositAccount2.Cancel();
        System.out.println("인출된 금액: " + cash2);
        System.out.println("예금 계좌의 남은 금액: " + depositAccount2.getBalance());

        System.out.println();

        System.out.println("Test4 : 만기 이전 적금 계좌 해제하기");
        Long cash3 = installmentAccount.Cancel();
        System.out.println("인출된 금액: " + cash3);
        System.out.println("적금 계좌의 남은 금액: " + installmentAccount.getBalance());

        System.out.println();

        System.out.println("Test5 : 입출금 통장에서 예금으로 계좌 이체 진행");
        usingAccount.transfer("1113", 100000L );
        System.out.println("이체 후 남은 금액 : " + usingAccount.getBalance());
        depositAccount.deposit(100000L);
        System.out.println("예금 통장 잔액 조회: " + depositAccount.getBalance());
    }
}
