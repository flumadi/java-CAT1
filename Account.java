public class Account {
     int id;
     TheCustomer customer;
     double balance = 0.0;

    public Account(int id, TheCustomer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, TheCustomer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public TheCustomer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void setDeposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + 
        ", customer=" + customer + 
        ", balance=" + balance + "]";
    }
}