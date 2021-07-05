public class TestManager {

    public static void main(String[] args) {

        Manager g1 = new Manager();

        g1.setName("Bill");
        g1.setCpf("333.333.333-33");
        g1.setSalary(8000);

        System.out.println(g1.getName());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalary());

        g1.setPassword(3333);
        boolean g1Authenticate = g1.authenticatePassword(3233);
        System.out.println(g1Authenticate);


        System.out.println(g1.getBonus());
    }
}
