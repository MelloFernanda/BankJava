public class TestCheckingSaving {

    public static void main(String[] args) {
        CheckingAccount cc = new CheckingAccount(111,111);
        cc.deposit(100);

        SavingsAccount cp = new SavingsAccount(222,222);
        cp.deposit(100);

        cc.transfer(10, cp);

        System.out.println("CC: " + cc.getBalance());
        System.out.println("CP: " + cp.getBalance());
    }
}
