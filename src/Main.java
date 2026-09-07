public static void main(String[] args) {
    // Создание объекта BankAccount с начальным балансом 500.0
    BankAccount account = new BankAccount("Иванов Иван", 500.0);
    System.out.println("--- Начальное состояние ---");
    account.printInfo();

    // 1. Пополнение счета
    account.deposit(250.50);
    account.printInfo();

    // 2. Снятие корректной суммы
    account.withdraw(400.0);
    account.printInfo();

    // 3. Попытка снять больше, чем есть на счете
    account.withdraw(1000.0);
    account.printInfo();
}
