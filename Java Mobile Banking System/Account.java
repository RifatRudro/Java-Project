//package pkgnew.project1;

import java.util.Scanner;
public class Account
{
	int x,choose;
	private String Name, Phone_Number,Date_of_Birth,Password,Confirm_Password;
	private int NID;
	double balance;
	Scanner obj=new Scanner(System.in);
        boolean check=true;
    public void choose_Option()
	{
            while(check==true)
            {
		System.out.println("                      Welcome to ABC Banking System");
		System.out.println("To create account follow the following steps \n");
                
		System.out.println("1.Savings Account\n2.Fixed Account\n3.Exit");
		x=obj.nextInt();
		
	if(x==1)
	{
		System.out.println("1.Login\n2.Create Account ");
		choose=obj.nextInt();
		
		if(choose==1)
		{
			SavingsLogin sl=new SavingsLogin();
		}
		
		else if(choose==2)
		{
			System.out.println("Enter your Name : ");
		obj.nextLine();
		Name=obj.nextLine();
		System.out.println("Enter Phone number : ");
		Phone_Number=obj.nextLine();
		System.out.println("Enter NID number ");
		NID=obj.nextInt();
		System.out.println("Enter Date of Birth: ");
		obj.nextLine();
		Date_of_Birth=obj.nextLine();
//		System.out.println("Enter a minimum amount to create account: ");
//		balance=obj.nextDouble();
		System.out.println("Enter Your Password: ");
		//obj.nextLine();
		Password=obj.nextLine();
		System.out.println("Enter Confirm Password:");
		Confirm_Password=obj.nextLine();
		
		if(Password.equals(Confirm_Password))
		{
			Savings_Account sa=new Savings_Account(Name,Phone_Number,NID,Date_of_Birth,Password,balance);
		}
		else 
			 System.out.println("Password Doesn't match");
		}			
		
		
		
	}
	else if(x==2)
	{
             System.out.println("1.Login\n2.Create Account  ");
		choose=obj.nextInt();
                
                if(choose==1)
                {
                    FixedLogin fl=new FixedLogin();
                }
                else if(choose==2)
                {
                    System.out.println("Enter your Name : ");
		obj.nextLine();
		Name=obj.nextLine();
		System.out.println("Enter Phone number : ");
		Phone_Number=obj.nextLine();
		System.out.println("Enter NID number ");
		NID=obj.nextInt();
		System.out.println("Enter Date of Birth: ");
		obj.nextLine();
                Date_of_Birth=obj.nextLine();
//                System.out.println("Enter a minimum amount to create account: ");
//		balance=obj.nextDouble();
		System.out.println("Enter Your Password: ");
               // obj.nextLine();
		Password=obj.nextLine();
		System.out.println("Enter Confirm Password:");
		Confirm_Password=obj.nextLine();
		if(Password.equals(Confirm_Password))
		{
			FixedAccount fa=new FixedAccount(Name,Phone_Number,NID,Date_of_Birth,Password,balance);
		}
		else 
			 System.out.println("Password Doesn't match");
                }
            
		
	}
        else if (x==3)
        {
            System.out.println("Thanks for using our service ");
            check=false;
        }
	
	
	
	
	}
	

	

	
        }
}