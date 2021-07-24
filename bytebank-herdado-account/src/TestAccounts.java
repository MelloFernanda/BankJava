public class TestAccounts {
    public static void main(String[] args) throws InsufficientFundsException{

        CheckingAccount cc = new CheckingAccount(111, 111);
        cc.deposit(100.0);

        SavingsAccount cp = new SavingsAccount(222, 222);
        cp.deposit(200.0);

        cc.transfer(110.0, cp);

        System.out.println("CC: " + cc.getBalance());
        System.out.println("CP: " + cp.getBalance());
    }
}
