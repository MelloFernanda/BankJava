public class TestEmployee {

    public static void main(String[] args) {

        BankEmployee Beatrix = new BankEmployee();

        Beatrix.setName("Beatrix Kiddo");
        Beatrix.setCpf("222.222.222-22");
        Beatrix.setSalary(3000);

        System.out.println(Beatrix.getName());
        System.out.println(Beatrix.getBonus());
    }
}
