import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name , password and intitial balance");
        String name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();
        System.out.println();

        HDFCAccount vikramAcc=new HDFCAccount(name , balance , password);
        System.out.println("your account is created with account n."+vikramAcc.getAccountNo());
        System.out.println("your initial balance is"+ vikramAcc.getBalance());
        System.out.println("your amount is credited with"+ vikramAcc.depositMoney(500));
       System.out.println("new balance :" + vikramAcc.getBalance());
        //withdraw
        System.out.println("enter your amount withdrawn");
        int amount=sc.nextInt();
    System.out.println("enter your password");
    String enteredPassword=sc.next();
    System.out.println(vikramAcc.withdraw(amount,enteredPassword));
    //interest
        System.out.println("calculate interest"+ vikramAcc.getBalance()+ vikramAcc.calculateInterest(4));
        }
}