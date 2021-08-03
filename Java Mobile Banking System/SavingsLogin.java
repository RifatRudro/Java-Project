/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkgnew.project1;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SavingsLogin implements Interface
{
	Scanner obj=new Scanner(System.in);
	String phn="",pass="";
	File f=new File("E:\\Project 0.1");
	int ln,i;
        double prevBalance;
        boolean check=true;
	SavingsLogin()
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
	
	
	
	 public void creatFolder(){
         if(!f.exists()){
             f.mkdirs();
         }
         
         }
		 
        @Override
		  public void readFile()
    {
        try {
            FileReader fr=new FileReader(f+"\\SavingsInfo.txt");
            System.out.println("file exists !");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter(f+"\\SavingsInfo.txt");
                System.out.println("File Created ");
            } catch (IOException ex1) {
               Logger.getLogger(SavingsLogin.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
         
    }
	
        @Override
 public void countLines()
{
        try {
            ln=0;
            RandomAccessFile raf=new RandomAccessFile(f+"\\SavingsInfo.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of lines :"+ln);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(SavingsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SavingsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
}



     void CheckData (String phone,String pswd){
        
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\SavingsInfo.txt","rw");
            for(i=0;i<ln;i+=7){
                //System.out.println("count"+i);
                
                                String acc=  raf.readLine().substring(15);
				String name=raf.readLine().substring(20);
                                String forPhone=raf.readLine().substring(7);
				raf.readLine();
				raf.readLine();
                                String forPswd=raf.readLine().substring(10);
                               
                                System.out.println("Line "+i);
                               // System.out.println(forPswd);
                if(phone.equals(forPhone) && pswd.equals(forPswd)){
                check=false;
		System.out.println("Login Successfull !!");
                System.out.println("Accounts Information : ");
                System.out.println("Account Holder Name :"+name);
                System.out.println("Account Number :"+acc);
                SavingsCalculation log=new SavingsCalculation();
                    
                    break;
                }
//                if(ln-8>=i)
//                {
                     raf.readLine(); 
              //  }
               
            }
            if(check==true)
            {
                 System.out.println("Wrong Username/Password!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SavingsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SavingsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
}