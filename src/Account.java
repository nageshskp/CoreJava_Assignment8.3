
public class Account 
  {
 
     private double balance = 0;

     public Account(double balance)
       {
           this.balance = balance;
       }
     public synchronized void deposit(double amount) 
     {

       if (amount < 0) 
         {

           throw new IllegalArgumentException("Can�t deposit amount less than Zero");
         }

          this. balance += amount;

          System.out.println(" Deposit " + amount + " in thread  " + Thread.currentThread().getId() + ", balance is               "+balance);
     }

     public synchronized void withdraw(double amount) 
     {

       if (amount < 0 || amount > this.balance) 
         {

            throw new IllegalArgumentException("Can�t withdraw. Insufficiant Balance");
         }

           this.balance -= amount;

           System.out.println(" Withdraw  " + amount +" in thread " + Thread.currentThread().getId() + ", balance is                "+balance);
     }
  }