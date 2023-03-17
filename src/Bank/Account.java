package Bank;

public class Account {
    String name;
    String balance;
    String number;
    String PINKOD;

    public Account(String name, String balance, String number, String PINKOD) {
        this.name = name;
        this.balance = balance;
        this.number = number;
        this.PINKOD = PINKOD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPINKOD() {
        return PINKOD;
    }

    public void setPINKOD(String PINKOD) {
        this.PINKOD = PINKOD;
    }
}
