package CA_Basics;

public class MyStore {
    String productType;
    double price;

    // constructor method
    public MyStore(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }
    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;

    }

    // get price with tax method
    public double getPriceWithTax(){
        double totalPrice = price + (price * 0.08);
        return totalPrice;
        //NOTE: The return type ALWAYS has to be the same as the type of function you declared it in
        //RETURN statements = Its what you want your function to give back after the function is solved
        /*
        Ex:
        public class Savings Account{
         (etc)
         ...
         public int deposit(int amountToDeposit){
          balance += amountToDeposit;
          System.out.println("You just deposited "+ amountToDeposit);

          return <<>> ? ;

          --> If we were going to return an argument from this function, should we return the amount we deposit
          or the current savings account ? I'll simplify it more:

         --> We create a variable to hold the result of our function:

          SavingsAccount savings = new SavingsAccount(2000);
          int myAcc = savings.deposit(500);

          --> Now, is it logical to return the amount we deposited or the current balance? Well of course the balance !
            It will then hold the variable my Acc = 2500

  }
         */
    }

    //Printing objects:
    public String toString(){
        return "My Store sells " + productType + " at " + price + "roopies mai fren";
    }
    /*
    If you print any object, Java compiler internally invokes the toString() method on the object. HOWEVER, it prints out
     hashcode values. Hash values are fingerprints for files, in other words, the program mathematically converts data into a
    value that is essentially a representation of the data.

    So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation.
    By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

     */



}
