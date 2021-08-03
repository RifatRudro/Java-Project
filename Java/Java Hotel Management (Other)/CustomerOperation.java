package interfaces;
import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;


public interface CustomerOperation
{
	

public Customer getCustomer(String Nid) ;
void insertCustomer(Customer c) ;
void removeCustomer(Customer c) ;
void showAllCustomers() ;

}	