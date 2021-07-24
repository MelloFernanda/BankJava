public class TaxCalculator {

    public double totalTax;

    public double taxCalculator(Taxable tx){
        double tax = tx.getTaxValue();
        this.totalTax += tax;
        return totalTax;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
