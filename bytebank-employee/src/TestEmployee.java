public class TestEmployee {

    public static void main(String[] args) {

        BankEmployee Fernanda = new BankEmployee();

        Fernanda.setName("Fernanda Batalha de Mello");
        Fernanda.setCpf("222.222.222-22");
        Fernanda.setSalary(3000);

        System.out.println(Fernanda.getName());
        System.out.println(Fernanda.getBonus());
    }
}
