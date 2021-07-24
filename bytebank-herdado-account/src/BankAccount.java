public abstract class BankAccount {
    //Atributos
    private double balance;
    private int agency;
    private int account;
    private Client holder;
    private double limit;

    private static int accounttotal;

    //MÉTODOS

    //Método Static
    public BankAccount(int account, int agency){
        this.account = account;
        this.agency = agency;
        accounttotal++;
        System.out.println("A conta " + this.account + " foi criada com sucesso.");
    }

    //Métodos do Saldo
    public void deposit(double value){
        this.balance+=value;
    }

    //SACAR COM TRATAMENTO DE ERRO
    public void withdraw(double value) throws InsufficientFundsException{
        if (this.balance < value){
            throw new InsufficientFundsException("Saldo: R$"+this.balance+", Valor: R$"+value);
        }
        this.balance-=value;
    }

    public void transfer(double value, BankAccount destinationAccount) throws InsufficientFundsException{
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public double getBalance() {
        return balance;
    }

    //Métodos do Limite
    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }


    //Métodos da Agencia
    public int getAgency() {
        return agency;
    }


    //Métodos da BankAccount
    public int getAccount() {
        return account;
    }


    //Métodos do Titular
    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    //Método do Total de Contas
    public static int getAccounttotal() {
        return accounttotal;
    }
}
