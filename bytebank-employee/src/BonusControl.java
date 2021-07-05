public class BonusControl {
    private double sum;

    public void register(BankEmployee f){
        double bonus = f.getBonus();
        this.sum += bonus;
    }

    public double getSum() {
        return sum;
    }
}
