package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class Customer implements RoomOperation
{
	private String name ;
    private String cid ;
    private Room rooms[] = new Room [100] ;
	
    public void setName(String name)
	{
		this.name = name ;
	}

    public void setCid(String cid)
	{
		this.cid = cid ;
	}
    public String getName( )
	{
		return name ;
	}
    public String getCid( )
	{
		return cid ;
	}
	
	//RoomOperation
	
	int count = 0 ;
	public void insertRoom(Room r)
	{
		for (int i = 0 ; i < rooms.length ; i++)
		{
			if(rooms[i] == null)
			{
				rooms[i] = r ;
				count++ ;
				break ;
			}			
		}
		
		if(count == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Failed To Insert Room info") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Room info Inserted Successfully") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	}
	
	public void removeRoom(Room r) 
	{
		int i ;
        for (i = 0 ; i < count ; i++)
		{
			if (rooms[i].getRoomNumber() == r.getRoomNumber())	 
		    break;

		}
	   
	    if (i == count)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("No match!!!") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	
		else 
		{
			for (int j = i; j < count ; j++) 
			{
				rooms[j] = rooms[j + 1] ;
			}
			count-- ; 
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("Room Has Been Left !") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	
		 
        }
	
    }
	
	public Room getRoom(int roomNumber)
	{
		int i = 0 ;
		
        Room r = null ;
		
		if(count == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("No Room info Available") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			for (i = 0 ; i < count ; i++)
			{
				if(rooms[i] != null)
				{
					if(rooms[i].getRoomNumber() == roomNumber)
					{
						r = rooms[i] ;
						break ;
					}
				}
			}
		 
		}
		return r ;
	}
public void showAllRoom()
	{
		
		if(count == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    System.out.println("No Data!") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;

		}
		else
		{
			for(int i = 0 ; i < count ; i++)
			{
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			    System.out.println("Details of Rooms: ") ;
				rooms[i].showInfo() ;
			    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    }
			
		}
	}

}