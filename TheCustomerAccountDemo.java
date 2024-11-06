public class TheCustomerAccountDemo {
    public static void main(String[] args) {
        // Create a customer
        TheCustomer customer = new TheCustomer(101, "Kim Jung Sun", 'M');
        System.out.println("Customer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("ID: " + customer.getId());
        System.out.println("Gender: " + customer.getGender());

        // Create an account for the customer
        Account account = new Account(1001, customer, 500.0);
        System.out.println("\nAccount Details:");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Balance: " + account.getBalance());

        // Test deposit
        account.setDeposit(200);
        System.out.println("\nAfter depositing 200:");
        System.out.println("Balance: " + account.getBalance());

        // Test withdrawal
        account.withdraw(150);
        System.out.println("\nAfter withdrawing 150:");
        System.out.println("Balance: " + account.getBalance());

        // Test withdrawal exceeding balance
        account.withdraw(1000);
        System.out.println("\nAfter attempting to withdraw 1000:");
        System.out.println("Balance: " + account.getBalance());
    }
}