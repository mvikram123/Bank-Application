import java.util.UUID;

public class HDFCAccount implements BankInterface {
    private String name;
    private int balance;
    private String accountNo;
    private  String password;
    private double rateOfInterest;

    public HDFCAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountNo= String.valueOf(UUID.randomUUID());
        this.rateOfInterest=6.6;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCalculateInterest() {
        return rateOfInterest;
    }

    public void setCalculateInterest(String calculateInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return "amount is credited="+amount;
    }

    @Override
    public String withdraw(int amount,String enteredPassword) {
        if (enteredPassword.equals(this.password)) {
            if (balance < amount)
            {

                return "insufficient balance";
        } else {
            balance -= amount;
            return "amount is debited " + amount +" "+ " new balance +" + balance;
        }
    }
    else

    {
        return "password did not match";
    }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100;
    }
}
