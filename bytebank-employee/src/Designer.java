public class Designer extends BankEmployee {

    public double getBonus(){
        return (super.getSalary()*0.1)+200;
    }
}
