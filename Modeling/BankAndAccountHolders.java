import java.util.*;

// Bank class
class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();
    private int accountNumberCounter = 1000;

    public Bank(String name) {
        this.name = name;
    }

    public Account openAccount(Customer customer, double initialBalance) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        Account account = new Account(accountNumberCounter++, initialBalance, this);
        customer.addAccount(account);
        return account;
    }

    public String getName() {
        return name;
    }
}

// Customer class
class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + " at " + account.getBank().getName() + ": " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

// Account class
class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

// Main class
public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer customer1 = new Customer("Aditya");
        Customer customer2 = new Customer("Yash");

        bank.openAccount(customer1, 500);
        bank.openAccount(customer1, 1500);
        bank.openAccount(customer2, 1000);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
