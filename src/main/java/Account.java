public class Account {

    private long balance = 0;

    private String id;
    private long getBalance(){
        return balance;
    }
    public void setBalance(long balance){
        this.balance = balance;
    }
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public boolean deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(long amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
