public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
       if(amount > 0) {
           balance += amount;
           System.out.println("Ваш счёт пополнен на: " + amount);
       }
       else{
           System.out.println("Сумма для пополнения должна быть больше 0");
       }
    }

    public void withdraw(double amount){
        if(amount > balance) {
            System.out.println("Недостаточно средств");
        }
        else if(amount <= 0){
            System.out.println("Сумма для снятия должна быть больше 0");
        }
        else{
            System.out.println("Снято с счёта: " + amount);
        }
    }

    public void printInfo(){
        System.out.println("Владелец карты: " + owner + ", Баланс карты: " + balance);
        System.out.println("=======================================================");
    }
}
