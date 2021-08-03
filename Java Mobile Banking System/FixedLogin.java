
//package pkgnew.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FixedLogin extends Abstrct{
   File file=new File("E:\\Project 0.1");
   int ln;
   String phn,pass;
   Scanner obj=new Scanner(System.in);
   FixedLogin()
   {
                System.out.println("Enter your phone number");
		phn=obj.nextLine();
		System.out.println("Enter your password number");
		pass=obj.nextLine();
       creatFolder();
       readFile();
       countLines();
       CheckData (phn,pass);
   }
    public void creatFolder()
     {
         if(!file.exists()){
             file.mkdirs();
         }
         
         }
     
public void readFile()
    {
        try {
            FileReader fr=new FileReader(file+"\\FixedInfo.txt");
            System.out.println("file exists !");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter(file+"\\FixedInfo.txt");
                System.out.println("File Created ");
            } catch (IOException ex1) {
               Logger.getLogger(FixedLogin.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
         
    }
       
public void countLines()
{
        try {
            ln=0;
            RandomAccessFile raf=new RandomAccessFile(file+"\\FixedInfo.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of lines :"+ln);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FixedLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FixedLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
         
 void CheckData (String phone,String pswd){
        boolean check=false;
        try {
            RandomAccessFile raf=new RandomAccessFile(file+"\\FixedInfo.txt","rw");
            for(int i=0;i<ln;i+=7){
                //System.out.println("count"+i);
                
                              String acc=  raf.readLine().substring(15);
				String name=raf.readLine().substring(20);
                                   String forPhone=raf.readLine().substring(7);
                               
				//System.out.println(forPhone);
				raf.readLine();
				raf.readLine();
//				String amount=raf.readLine().substring(9);
                String forPswd=raf.readLine().substring(10);
				//System.out.println(forPswd);
           
                if(phone.equals(forPhone) && pswd.equals(forPswd)){
		System.out.println("Login Successfull !!");
                System.out.println("Accounts Information : ");
                System.out.println("Account Holder Name :"+name);
                System.out.println("Account Number :"+acc);
                FixedCalculation fix=new FixedCalculation();
               // System.out.println("Current Balance :"+amount);
                    check=true;
                    break;
                }
             raf.readLine();
            }
            if(check==false)
            {
                 System.out.println("Wrong phone/Password!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FixedLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FixedLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
