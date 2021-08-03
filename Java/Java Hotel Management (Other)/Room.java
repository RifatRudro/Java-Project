package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class Room implements RoomManagement
{
	private int roomNumber ;
	private int roomQuantity ;
	
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber = roomNumber ;
	}
	
    public void setRoomQuantity(int roomQuantity)
	{
		this.roomQuantity = roomQuantity ; 
	}
    public int getRoomNumber( )
	{
		return roomNumber ;
	}
	
    public int getRoomQuantity( )
	{
		return roomQuantity ;
	}
    public void showInfo( )
	{
		System.out.println(" Total Number of Rooms : " + getRoomNumber() ) ;
	    System.out.println(" Totat Number Of Bedrooms : " + getRoomQuantity() ) ;
	}
	
	//RoomManagement
	
	File file ; 
	private FileWriter writer ;
	
	public void writeInFile(String s)
	{
		
		try
		{
			file = new File("RoomDetails.txt") ; 
			
			file.createNewFile() ;
			
			writer = new FileWriter(file, true) ; 
							
			writer.write(s+"\r\n") ; 
			writer.flush() ;
			writer.close() ;		
		
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;

		}
	}
	
	public void renting(int quantity,String Nid) 
	{
		if(quantity > 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			roomQuantity = roomQuantity + quantity ;
			System.out.println("Number Of rooms rented: " +roomQuantity) ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			Room r = new Room();
			r.writeInFile("Customer with ID:"+Nid+" Rented " +quantity+" rooms.") ;
		}
		else
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("Invalid Amount Of Rooms") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	}
	
	public void leaving(int quantity, String Nid) 
	{
		if(quantity > 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			roomQuantity = quantity ;
			System.out.println("Number Of rooms left: " +roomQuantity) ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			Room r = new Room();
			r.writeInFile("Customer with ID:"+Nid+" left " +quantity+" rooms.") ;
			
		}
		else
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("Invalid Amount Of rooms") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	}
}