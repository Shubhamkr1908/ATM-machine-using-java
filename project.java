import java.util.Scanner;
import java.io.*;
import javax.lang.model.util.ElementScanner6;
class sample
{
    public static void main(String args[])
    {
        int ch,p=0,op,q,choice=0;
        int arr[] = new int[5];
        float bal = 500000;
        Scanner sc = new Scanner(System.in);
        try{
        FileWriter f1= new FileWriter("Transaction.txt");
        f1.write("STM A/C : xxxxxxxxxxx9876 \n 20220816 \t UPIAR/2228851\t D\t 8500.00 \n 20220820\t UPIAB/2232818\t C\t 900.00 \n 20220821\t UPIAR/2233240 \t D\t 2000.00");
        f1.flush();
        f1.close();
        }
        catch(Exception e)
        {
            System.out.println("Device error");
        }
        System.out.println("Welcome to ATM Machine");
do        
{
        System.out.println("Choose from the option below to perform the action...");
        System.out.print("1. Domestic");
        System.out.print(" \t\t\t 2. INTERNATIONAL \n");
        ch = sc.nextInt();
        if(ch==1 || ch==2)
        { 
            Console c = System.console();
            System.out.println("ENTER YOUR  4 digit PIN :");
            char ch1[] = c.readPassword();
            String s1 = new String(ch1);            
    
            int len = s1.length();
            if(len!=4 )
            {
                System.out.println("YOU HAVE EXCEEDED THE LIMIT");
                break;
            }
            
            
            

        }
        else 
        {
            System.out.println("INVALID INPUT");
            break;
            
        }
        
        System.out.println("CHOOSE THE NEXT");
        System.out.print("1. WITHDRAW CASH");
        System.out.print(" \t\t\t 2. CHECK YOUR  BALANCE\n");
        System.out.print("3. CHANGE YOUR ATM PIN ");
        System.out.print("\t\t\t 4. GET A MINI STATEMENT\n");
        System.out.println("5. EXIT ");

        op= sc.nextInt();

        switch(op)
        {
            case 1:
                float a; int var;
                System.out.println("CHOOSE YOUR ACCOUNT TYPE.");
                System.out.println("1. SAVINGS ");
                System.out.println("2. CURRENT ");
                System.out.println("3. CREDIT");
                var=sc.nextInt();

                System.out.println("Enter the withdrawal amount:");
                a=sc.nextInt();
                if(a%500!=0)
                {
                    System.out.println("INVALID AMOUNT");
                    break;
                }
                else 
                {
                    System.out.println("The amount is \t" + (bal-a));
                    break;
                }

                
            case 2:
                System.out.println("YOUR BALANCE IS\t" + bal);
                break;
            case 3:
                System.out.println("ENTER YOUR CURRENT PIN");
                int pin;
                pin=sc.nextInt();
                if(pin==p)
                {
                    System.out.println("ENTER THE NEW ATM PIN :");
                
                q=sc.nextInt();
                p=q;
                System.out.println("Your pin has been changed successfully.");
                    
                }
                else 
                {
                    System.out.println("INCORRECT PIN ");
                
                    
                }
                break;
               
                
            case 4:
                 System.out.println(" THE TRANSACTION HISTORY IS SHOWN HERE:");
                 try{
                 
                 FileReader fr = new FileReader("Transaction.txt");
                 int v;
                 while((v=fr.read())!=-1)
                 {
                    System.out.print((char)v);

                 }
                 fr.close();
                }
                catch(Exception e)
                {
                    System.out.println("Device error");
                }

                 break;
            case 5:
                System.out.println("THANK YOU FOR COMING. ");
                System.out.println("YOU HAVE BEEN SUCCESSFULLY EXITED .");
                break;
            default:
                System.out.println("YOU HAVE ENTERED THE WRONG CHOICE:");
                break;
        }
        System.out.println("\n Want to continue??");
        System.out.println("1. YES ");
        System.out.println("2. NO");
        
        choice=sc.nextInt();
       
    } while(choice==1);
        if(choice==1)
        {
            System.out.println(""); 
        }
        else
        {
            System.out.println(" THANK YOU. VISIT AGAIN!!!!!!!");
        }

        

                


    



    }
}