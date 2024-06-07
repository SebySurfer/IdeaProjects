package CA_Basics;

public class MySavings {
    public int balance;

    public MySavings(int initialBalance){
        balance = initialBalance;
    }


    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit){
        balance += amountToDeposit;
        System.out.println("You just deposited "+ amountToDeposit);

    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);

        return amountToWithdraw;

    }

    public String toString(){
        return "Your account has a balance of " + balance + ".";
    }


}
