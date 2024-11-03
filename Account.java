public class Account{
    String id;
    String name;
    int balance;
    public Account(String x, String y){
        id = x;
        name = y;
    }
    public Account(String x, String y, int z){
        id = x;
        name = y;
        balance = z;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void credit(int amount){
        balance += amount;
    }
    public void debit(int amount){
     if(balance >= amount){
        balance -= amount;
     }else {
        System.out.println("Insufficient balance");
     }
    }
    public void transferTo(Account another, int amount){
        if(balance >=amount){
            balance -= amount;
        }else {
            System.out.println("Insufficient balance to transfer");
        }
    }
    public void setId(String newid){
        this.id = newid;
    }
    public void setName(String newname){
        this.name = newname;
    } 
    public void setBalance(int newbalance){
        this.balance = newbalance;
    }
    @Override
    public String toString(){
        return "The ID = " + id + "\n" + 
        "The name = "+ name + "\n" + 
        "The balance + " + balance + "\n";
    }
}
