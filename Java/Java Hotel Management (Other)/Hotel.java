package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class Hotel implements EmployeeOperation,CustomerOperation
{
	private Customer customer[] = new Customer [100] ;
    private Employee employees[] = new Employee [100]  ;
	
	//EmployeeOperation
	
	public void setEmployee(Employee e)
	{
		
	}
	
	int count1 = 0 ;
	public void insertEmployee(Employee e)
	{
		
		
		for (int i = 0 ; i < employees.length ; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e ;
				count1++ ;
				break ;
			}			
		}
		
		if(count1 == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Failed To Insert Employee info") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Employee info Inserted Successfully") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	}
	
	public void removeEmployee(Employee e)
	{
		int i ;
        for (i = 0 ; i < count1 ; i++)
		{
			if (employees[i].getEId() == e.getEId())	 
		    break;

		}
	   
	    if (i == count1)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("No match!!!") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	
		else 
		{
			for (int j = i; j < count1 ; j++) 
			{
				employees[j] = employees[j + 1] ;
			}
			count1-- ; 
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("Employee details have been removed !") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	
		 
        }
	
	}
	
	
	public Employee getEmployee (String eId)
	{
		int i = 0 ;
		
		Employee em = null;
		
		if(count1 == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("No Employee info Available") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		
		else
		{
			for (i = 0 ; i < count1 ; i++)
			{
				if(employees[i] != null)
				{
					if(employees[i].getEId().equals(eId))
					{
						em = employees[i] ;
					    break ;
					}
				}
			}
		}	
	    return em ;
	}
	
	
	public void showAllEmployee()
	{
		if(count1 == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    System.out.println("No Data!") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;

		}
		else
		{
			for(int i = 0 ; i < count1 ; i++)
			{
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			    System.out.println("Details of Employee "+(i+1)+":") ;
				System.out.println("Employee Name:"+employees[i].getName()) ;
		        System.out.println("Employee ID :"+employees[i].getEId()) ;
		        System.out.println("Salary:"+employees[i].getSalary()) ;
			    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    }
			
		}
	}
	
	
	
	
	
	
	//CustomerOperation
	
	public void setCustomer (Customer c)
	{
		
	}
	
	
	
	int count2 = 0 ;
	public void insertCustomer(Customer c)
	{
		for (int i = 0 ; i < customer.length ; i++)
		{
			if(customer[i] == null)
			{
				customer[i] = c ;
				count2++ ;
				break ;
			}			
		}
		
		if(count2 == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Failed To Insert Customer info") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Customer info Inserted Successfully") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	}
	
	public void removeCustomer(Customer c)
	{
		int i ;
        for (i = 0 ; i < count2 ; i++)
		{
			if (customer[i].getCid() == c.getCid())	 
		    break;

		}
	   
	    if (i == count2)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("No match!!!") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	
		else 
		{
			for (int j = i; j < count2 ; j++) 
			{
				customer[j] = customer[j + 1] ;
			}
			count2-- ; 
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("Customer details have been removed !") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	
		 
        }
	
	}
	
	
	
	public Customer getCustomer (String cid)
	{
		int i = 0 ;
		
		Customer c = null ;
		
		if(count2 == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("No Customer Data Available") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			for (i = 0 ; i < count2 ; i++)
			{
				if(customer[i] != null)
				{
					if(customer[i].getCid().equals(cid))
					{
						c = customer[i] ;
						break ;
					}
				}
			}
		 
		}
		return c ;
	}
	
	public void showAllCustomers()
	{
		if(count2 == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    System.out.println("No Data!") ;
		    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;

		}
		else
		{
			for(int i = 0 ; i < count2 ; i++)
			{
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			    System.out.println("Details of Customer "+(i+1)+":") ;
				System.out.println("Customer Name:"+customer[i].getName()) ;
		        System.out.println("Customer ID :"+customer[i].getCid()) ;
				customer[i].showAllRoom() ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    }
			
		}
	}
}