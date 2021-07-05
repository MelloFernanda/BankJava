public class TestBonus {

    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setName("Bill");
        m1.setSalary(5000.0);

        VideoEditor ve = new VideoEditor();
        ve.setSalary(2500.0);

        Designer d = new Designer();
        d.setSalary(2000.0);


        //Get all wages
        System.out.println(m1.getSalary());
        System.out.println(ve.getSalary());
        System.out.println(d.getSalary());


        //Control Bonus
        //Creat Bonus Control
        BonusControl controle = new BonusControl();
        //Register employees in the created variable
        controle.register(m1);
        controle.register(ve);
        controle.register(d);

        // Get Total Bonus
        System.out.println("\nO valor total de bonificação distribuída é de: R$" + controle.getSum());


    }
}
