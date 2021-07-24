public class CheckingAccount extends BankAccount implements Taxable {

    public CheckingAccount(int agency, int account){
        super(agency, account);
    }

    @Override
    public double getTaxValue() {
        return 0;
    }

    @Override
    public void withdraw(double value) throws InsufficientFundsException{
        double valueWithdraw = value+0.2;
        super.withdraw(valueWithdraw);
    }
}
