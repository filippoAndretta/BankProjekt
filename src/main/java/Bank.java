import java.util.ArrayList;
import java.util.Iterator;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void createAccount(String accountNumber) {
        Account account = new Account();
        account.setId(accountNumber);
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        for (int i=0; i<this.accounts.size();)
        {
            Account a = accounts.get(i);
            if (a.getId().equals(accountNumber))
            {
                return a;
            } else
            {
                return null;
            }
        }
        return null;
    }

    public Account getAccountIterator(String accountNumber) {
        Iterator<Account> it = accounts.iterator();
        while (it.hasNext())
        {
            Account a = (Account) it.next();
            if (a.getId().equals(accountNumber))
            {
                return a;
            }
        }
        return null;
    }

    public boolean deleteAccount(String accountNumber) {
        Iterator<Account> it = accounts.iterator();
        while (it.hasNext())
        {
            Account a = (Account) it.next();
            if (a.getId().equals(accountNumber))
            {
                deleteAccount(accountNumber);
            }
        }

        return false;
    }

    public boolean deposit(String kontoNummer, long amount) {
        return false;
    }

    public boolean withdraw(String kontoNummer, long amount) {
        return false;
    }

    private void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
