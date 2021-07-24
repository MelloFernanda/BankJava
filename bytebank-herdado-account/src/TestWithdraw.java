public class TestWithdraw {

    public static void main(String[] args) {
        BankAccount conta = new CheckingAccount(123, 321);

        conta.deposit(200.0);

        try {
            conta.withdraw(210.0);
        } catch(InsufficientFundsException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(conta.getBalance());
    }
}
