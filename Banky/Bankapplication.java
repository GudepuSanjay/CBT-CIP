package Banky;

import java.util.Scanner;

class creating{
        public void createaccount(String name)
        { 
       System.out.println("\nYOUR ACCOUNT WITH NAME "+name+" SUCCESFULLY CREATED"); 
       System.out.println("\n HAPPY BANKING...!!");
    }
}

class DepositMoney{
    public void deposit(double depoamt){
        Bankapplication.totalamt=Bankapplication.totalamt+depoamt;
        System.out.println("\nAMOUNT "+depoamt+" SUCCESFULLY DEPOSITED");
        System.out.println("\nYOUR BANK BALANCE IS "+Bankapplication.totalamt);
    }
}

class WithdrawMoney{
public void withdraw(double withamt){
    Bankapplication.totalamt=Bankapplication.totalamt-withamt;
    System.out.println("\nSUCCESFULLY WITHDRAWN "+withamt);
    System.out.println("\nTHANK YOU VISIT AGAIN...");
    System.out.println("\nYOUR BANK BALNACE IS "+Bankapplication.totalamt);
}
}
class TransferMoney{
    public void transfer(double transferamount){
        Bankapplication.totalamt=Bankapplication.totalamt-transferamount;
        System.out.println("\n AMOUNT SUCCESFULLY TRANSFERED...");
        System.out.println("\nYOUR BALANCE AMOUNT IS--> "+Bankapplication.totalamt);
    }
}

public class Bankapplication {
    public static double totalamt=0.0;
    public static void main(String[] args) {
        Scanner reads=new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("WELCOME TO XYZ BANK");
        System.out.println("OUR SERVICES...");
        boolean condition =true;
        while(condition)
        {
            System.out.println("---------------------------------------------------");
            System.out.println("1.CREATE A BANK ACCOUNT-->");
            System.out.println("2.DEPOSIT MONEY-->");
            System.out.println("3.WITHDRAW MONEY-->");
            System.out.println("4.TRANSFER MONEY-->");
            System.out.println("5.EXIT-->");
            System.out.println("ENTER YOUR CHOICE-->");
            int choice=reads.nextInt();
            reads.nextLine();
            switch (choice) {
                case 1: System.out.println("ENTER YOUR NAME-->");
                String name=reads.nextLine();
                System.out.println("ENTER YOUR AGE-->");
                int age=reads.nextInt();
                if(age>18){
                    creating obj=new creating();
                    obj.createaccount(name);
                }
                else{
                    System.out.println("ABOVE 18 CAN CREATE AN ACCOUNT ..");
                }
                    break;

                case 2:System.out.println("ENTER AMOUNT TO DEPOSIT:");
                double depositamt=reads.nextLong();
                reads.nextLine();
                DepositMoney obj1 =new DepositMoney();
                obj1.deposit(depositamt);
                break;
                case 3:WithdrawMoney obj2=new WithdrawMoney();
                System.out.println("ENTER THE AMOUNT TO WITH DRAW-->");
                double withdrawamt=reads.nextLong();
                reads.nextLine();
                obj2.withdraw(withdrawamt);
                break;
                case 4:System.out.println("ENTER AMOUNT TO TRANSFER-->");
                double transferamt=reads.nextLong();
                reads.nextLine();
                TransferMoney obj3=new TransferMoney();
                obj3.transfer(transferamt);
                break;
                case 5:
                       System.out.println("EXITING BYE...");
                       condition=false;
                    break;
                default:
                    System.out.println("INVALID CHOICE ,CHOOSE THE ABOVE CHOICES..!!");
                    break;
            }
            System.out.println("---------------------------------------------------");
        }
    }
}