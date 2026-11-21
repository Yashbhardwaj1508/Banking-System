import java.util.Scanner;

class BankAccount{

    //constructor
    double balance;

    BankAccount( double  initializeBalance){
        balance =  initializeBalance;
    }

    //Deposit

    void deposit(double amount){

        if(amount > 0){
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    //withdraw
    

    void withdraw(double amount){
        
        if(amount <= 0){
            System.out.println("Invalid withdraw amount.");
        }

        else if(amount > balance){
            System.out.println("Insufficient funds.");
        }

        else {
            balance = balance - amount;
            System.out.println("Amount withdraw successfully.");
        }
    }

    //check balance

    void checkBalance(){
        System.out.println("Current Balance:" + balance);
    }




    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);

        int choice=0;

        while( choice != 4){

            System.out.println("\n------Banking System ----------");
            System.out.println("Press 1.   For Deposit");
            System.out.println("Press 2.   For Withdraw");
             System.out.println("Press 3.   For Check Balance");
              System.out.println("Press 4.   For Exit");

               System.out.println("Enter your choice: ");
               choice = sc.nextInt();

               switch(choice){

                case 1:
                    System.out.print("Enter the amount for deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;


                 case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmmount = sc.nextDouble();
                        account.withdraw( withdrawAmmount);
                        break;

                case 3:

                        account.checkBalance();
                        break;

                case 4:
                        System.out.println("Thank you for using  this System");
                        break;


                default:
                       System.out.println("Invalid Choice");
               }

        }

        
    }
}