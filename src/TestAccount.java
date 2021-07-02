public class TestAccount {
    public static void main(String[] args) {

        // BankAccount Creation
        BankAccount firstAccount = new BankAccount(274531, 2705);
        BankAccount secondAccount = new BankAccount(4532,765);

        //About Limit
        firstAccount.setLimit(2000);

        //About holder
        firstAccount.setHolder(new Client());
        firstAccount.getHolder().setName("Hans Landa");
        firstAccount.getHolder().setCpf("222.222.222-22");
        firstAccount.getHolder().setJob("Coronel");


        //About Balance
        firstAccount.deposit(500);
        firstAccount.withdraw(50);
        firstAccount.transfer(200, secondAccount);
        secondAccount.withdraw(100);
        secondAccount.deposit(20);


        //account assignments
        System.out.println(" ");
        System.out.println("-------DADOS DE CONTA - BYTEBANK-------");
        System.out.println("Conta : " + firstAccount.getAccount()
                + " Agencia: " + firstAccount.getAgency());
        System.out.println(" ");
        System.out.println("Titular: " + firstAccount.getHolder().getName());
        System.out.println("CPF do portador: " + firstAccount.getHolder().getCpf());
        System.out.println("Saldo atual: " + firstAccount.getBalance());
        System.out.println("Limite disponível de crédito: " + firstAccount.getLimit());

        //Quantidade de contas ativas
        System.out.println(" ");
        System.out.println("O número de contas criadas é de: "+ BankAccount.getAccounttotal());
    }
}
