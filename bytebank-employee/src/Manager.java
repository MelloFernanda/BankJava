public class Manager extends BankEmployee implements Autenticavel{
    private int password;


    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticatePassword(int password) {
        if(this.password==password){
            return true;
        }else{
            System.out.println("Passwords are different. Please try again");
            this.password = 0;
            return false;
        }
    }

    public double getBonus(){
        return super.getSalary() + (super.getSalary()*0.1);
    }

}
