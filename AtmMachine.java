import java.util.*;

class ATM{
  
  float Balance;
  int pin = 1234;

  public void checkpin(){
    Scanner sc = new Scanner(System.in);
    int enterpin;
    do {
      System.out.println("Enter your pin: ");
      enterpin = sc.nextInt();
      if(enterpin != pin){
        System.out.println("Invalid pin. Please try again.");
      }
    } while(enterpin != pin);
    
    menu();
  }

  public void menu(){
    System.out.println("Enter your choice: ");
    System.out.println("1. Check your Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if(opt == 1){
      checkBalance();
    }
    else if(opt == 2){
      withdrawMoney();
    }
    else if(opt == 3){
      depositMoney();
    } else if(opt == 4){
      return;
    }
    else{
      System.out.println("Enter a valid choice");
      menu();  // Ensure that the menu is displayed again if an invalid option is chosen.
    }
  }

  public void checkBalance(){
    System.out.println("Balance: " + Balance);
    menu();
  }

  public void withdrawMoney(){
    System.out.println("Enter Amount to withdraw: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount > Balance){
      System.out.println("Insufficient Balance");
    }
    else{
      Balance = Balance - amount;
      System.out.println("Money withdrawal successful");
    }
    menu();
  }

  public void depositMoney(){
    System.out.println("Enter the amount: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance + amount;
    System.out.println("Money Deposited Successfully");
    menu();
  }
}

public class AtmMachine{
  public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkpin();
  }
}
