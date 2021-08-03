//package pkgnew.project1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FixedAccount
{
	private String Name, Phone_Number,Date_of_Birth,Password;
	private int NID;
	int ln,acc=1028647;
	double Balance;
	File file=new File("E:\\Project 0.1");
	FixedAccount(String name,String phone,int nid,String DOB,String password,double balance)
	{
		Name=name;
		Phone_Number=phone;
		Date_of_Birth=DOB;
		NID=nid;
		Password=password;
		Balance=balance;
		creatFolder();
		readFile();
		countLines();
		addData(Name,phone,DOB,NID,password);
		System.out.println("Account Successfully created !! ");
	
	}
	
	 void creatFolder()
     {
         if(!file.exists()){
             file.mkdirs();
         }
         
         }
     
     
     
     void readFile()
    {
        try {
            FileReader fr=new FileReader(file+"\\FixedInfo.txt");
            System.out.println("file exists !");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter(file+"\\FixedInfo.txt");
                System.out.println("File Created ");
            } catch (IOException ex1) {
               Logger.getLogger(FixedAccount.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
         
    }
	
	 void countLines()
{
        try {
            ln=1;
            RandomAccessFile raf=new RandomAccessFile(file+"\\FixedInfo.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of lines :"+ln);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FixedAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FixedAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     
 void addData(String Name,String phone,String DOB,int NID,String password )
    {
		int x=1028647;
        try {
            RandomAccessFile raf=new RandomAccessFile(file+"\\FixedInfo.txt","rw");
            for(int i=0;i<ln;i++)
            {
                if(ln==8  && i==0)
                {
                   String number=raf.readLine().substring(15);
                   x=Integer.parseInt(number);
                    x++;
                     acc=x;
                }
                else if(i==ln-8)
            {
                 //System.out.println(raf.readLine());
              String number=raf.readLine().substring(15);
                System.out.println("Read numbre : "+number);
               x=Integer.parseInt(number);
               x++;
               acc=x;
            }
				
                raf.readLine();
            }
            //raf.writeBytes("\r\n");
           // raf.writeBytes("\r\n");
	    raf.writeBytes("Account Number:"+acc+ "\r\n");
            raf.writeBytes("Account Holder Name:"+Name+ "\r\n");
            raf.writeBytes("Phone :"+phone+ "\r\n");
            raf.writeBytes("Date of Birth :"+DOB+"\r\n");
	    raf.writeBytes("NID Number :"+NID+"\r\n");
            //raf.writeBytes("Balance :"+Balance+"\r\n");
	    raf.writeBytes("Password :"+password+"\r\n");
            raf.writeBytes("\r\n");
        } catch (FileNotFoundException ex) {
           Logger.getLogger(Savings_Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           Logger.getLogger(Savings_Account.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
     
     

}
