public class CheckingAccount extends BankAccount{

    public CheckingAccount(int agency, int account){
        super(agency, account);
    }

    @Override
    public boolean withdraw(double value) {
        double valueWithdraw = value+0.2;
        return super.withdraw(valueWithdraw);
    }
}
