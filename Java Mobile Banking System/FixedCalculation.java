
//package pkgnew.project1;

import java.util.Scanner;


public class FixedCalculation {
    Scanner obj=new Scanner(System.in);
    double year;
    double rate,totalAmount,amount;
    int choice;
    
    FixedCalculation()
    {
        System.out.println("\nEnter A Amount to Fixed :");
        amount=obj.nextDouble();
        System.out.println("Year to fixed your amount");
        System.out.println("1.for 6 month with interest rate 5.6%\n2.for 2 years with interest rate 6%"
                + "\n3.for 5 years with interest rate 6.2%\n4.for 10 years with interest rate 7.5%");
        choice=obj.nextInt();
        if(choice==1)
        {
            year=.5;
            rate=5.6;
        }
        if(choice==2)
        {
            year=2;
            rate=6;
        }
        if(choice==3)
        {
            year=5;
            rate=6.2;
        }
        if(choice==4)
        {
            year=10;
            rate=7.5;
        }
        
        totalAmount=amount+((rate/100)*amount);
        System.out.println("You will get "+totalAmount+" after "+year+" years");
    }
}
