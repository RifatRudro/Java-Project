/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkgnew.project1;

import java.util.Scanner;



public class SavingsCalculation {
    
        Scanner obj=new Scanner(System.in);
        int choice;
        boolean check=true;
        double amount;
        String phone;
      
        SavingsCalculation()
        {
            while(check==true)
            {
            System.out.println("1.Deposite \n2.WIthdraw\n3.Fund Transfer \n4.Mobile Recharge\n5.Show Balance \n6.Exit ");
            choice=obj.nextInt();
            if(choice==1)
            {
                deposite();
            }
            if(choice==2)
            {
                withdraw();
            }
            if(choice==3)
            {
                Fund_Transfer();
            }
            if(choice==4)
            {
               Mobile_Recharge();
            }
            if(choice==5)
            {
                Show_Balance();
            }
            if(choice==6)
            {
                check=false;
            }
            }
            
            
        }
        
        
        void deposite()
        {
            System.out.println("Current Balance : "+amount);
            System.out.println("Enter amount to deposite : ");
            amount=obj.nextDouble();
            System.out.println(amount+" Taka deposited Successfully  : ");
        }
        
        void withdraw()
        {
            System.out.println("Current balance : "+amount);
            System.out.println("Enter amount to withdraw : ");
            double amount1=obj.nextDouble();
            if(amount1<=amount)
            {
            System.out.println(amount1+" Taka withdrawn Successfully  : ");
            amount-=amount1;
            }
            else
                System.out.println("Insufficient balance ");
        }
        
        void Fund_Transfer()
        {
            System.out.println("Enter phone number : ");
            obj.nextLine();
            phone=obj.nextLine();
            System.out.println("Enter amount to transfer: ");
            double amount2=obj.nextDouble();
            if(amount2<=amount)
            {
            System.out.println(amount2+" Taka transfered Successfully  : ");
            amount-=amount2;
            }
            else
                System.out.println("Insufficient balance ");
        }
        
        void Mobile_Recharge()
        {
            System.out.println("Enter Mobile Number : ");
            obj.nextLine();
            String phn=obj.nextLine();
            System.out.println("Enter amount to mobile recharge : ");
            double amount3=obj.nextDouble();
            if(amount3<=amount)
            {
            System.out.println(amount3+" Taka recharged Successfully  : ");
            amount-=amount3;
            }
            else
                System.out.println("Insufficient balance ");
            
        }
        void Show_Balance()
        {
            System.out.println("Current balance is "+amount+" Taka");
        }
        
}
