package org.rasmus;

class BankAccount {
    private double balance = 500;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Otillräckligt saldo för att göra uttaget.");
        }
        balance -= amount;
        System.out.println("Uttag lyckades. Nuvarande saldo: " + balance);
    }
}
