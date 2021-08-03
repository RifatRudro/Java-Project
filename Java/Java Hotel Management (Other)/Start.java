import java.lang.* ;
import java.util.* ;
import java.io.* ;
import classes.* ;
import interfaces.* ;


public class Start
{
	private Hotel hot ;
	
	public Start()
	{
		hot = new Hotel () ;
	}
	
	public static void main(String args[])
	{
		Start s = new Start() ;
		
		System.out.println("") ;
		System.out.println("") ;

		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		System.out.println("            HOTEL MANAGEMENT SYSTEM") ;
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		
		
		
		s.main() ;
	}
	
	public void main()
	{
		Scanner input = new Scanner(System.in) ;
		int option = 0 ;
		
		
		System.out.println("") ;
		System.out.println("") ;
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		System.out.println("                 HOTEL LOBBY") ;
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		System.out.println("Choose An Option") ;
		System.out.println("1. Employee Management") ;
		System.out.println("2. Customer Managemnet") ;
		System.out.println("3. Room Managment") ;
		System.out.println("4. Exit") ;
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		
		System.out.println("") ;
	    System.out.println("") ;

		System.out.print("Option: ") ;
		
		System.out.println("") ;

		try
		{
		 option = input.nextInt() ;
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		
		if(option == 1)
		{
			
                int option1 = 0 ;		
				
				
				System.out.println("") ;
				System.out.println("") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				System.out.println("                  Employee Management options ") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				System.out.println("Choose An Option") ;
		        System.out.println("1. Insert New Employee") ;
		        System.out.println("2. Remove Existing Employee") ;
		        System.out.println("3. Show All Employee") ;
		        System.out.println("4. Back to LOBBY") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				
				
				System.out.println("") ;
				System.out.println("") ;

				System.out.print("Option: ") ;

				System.out.println("") ;
				

				
				try
				{
					option1 = input.nextInt() ;
				}
				catch(InputMismatchException i)
				{
					System.out.print(" ") ;
			        System.out.print("Invalid Input!") ;
				}
				
				if(option1 == 1)
				{
					Employee e1 = new Employee() ;
					
					System.out.println("") ;
		            System.out.println("") ;
					
					System.out.print("Enter Employee Name:  ") ;
					String name = input.next() ;
					e1.setName(name) ;
					
					System.out.print("Enter Employee ID:  ") ;
					String eid = input.next() ;
					e1.setEId(eid) ;
					
					System.out.print("Enter Employee Salary:  ") ;
					double salary = input.nextDouble() ;
					e1.setSalary(salary) ;
					
					hot.insertEmployee(e1) ;
					main() ;
				}
				
				else if(option1 == 2)
				{
					
					System.out.println("") ;
		            System.out.println("") ;
					
					System.out.print("Enter Employee ID You Want To Remove:  ") ;
					String eid2 = input.next() ;
					
					
					hot.removeEmployee(hot.getEmployee(eid2));
					main() ;
					
				}
				
				else if(option1 == 3)
				{
					System.out.println("") ;
		            System.out.println("") ;
					
					hot.showAllEmployee() ;
					main() ;
				}
				
				else if (option1 == 4)
				{
					main() ;
				}
				
				else
				{
					System.out.println("Invalid Option") ;
					main() ;
				}
		}
		
		else if(option == 2)
		{
			
			    System.out.println("") ;
				System.out.println("") ;

			    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				System.out.println("                Customer Management Menu") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				System.out.println("Choose An Option") ;
		        System.out.println("1. Insert New Customer") ;
		        System.out.println("2. Remove Existing Customer info") ;
		        System.out.println("3. Show All Customer") ;
		        System.out.println("4. Back to LOBBY") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				
				
				System.out.println("") ;
				System.out.println("") ;

				System.out.print("Option:  ") ;

				System.out.println("") ;
			

				
				int option2 = 0 ;
				
				try
				{
					option2 = input.nextInt() ;
				}
				catch(InputMismatchException i)
				{
					System.out.print(" ") ;
			        System.out.print("Invalid Input!") ;
				}
				
				if(option2 == 1)
				{
					Customer c1 = new Customer() ;
					
					System.out.println("") ;
	             	System.out.println("") ;
					
					System.out.print("Enter Customer Name:  ") ;
					String name = input.next() ;
					c1.setName(name) ;
					
					System.out.print("Enter Customer NID:  ") ;
					String cid = input.next() ;
					c1.setCid(cid) ;
					
					hot.insertCustomer(c1) ;
					
					Room r1 = new Room() ;
					
					System.out.println("Room Details:  ") ;
					
					System.out.print("Enter Room Number:  ") ;
					int rn = input.nextInt() ;
					r1.setRoomNumber(rn) ;
					
					System.out.print("Enter Total Room Quantity: ") ;
					int rq = input.nextInt() ;
					r1.setRoomQuantity(rq) ;
					
					hot.getCustomer(cid).insertRoom(r1) ;
					main() ;
				}
				
				else if(option2 == 2)
				{
					
		 			System.out.println("") ;
		            System.out.println("") ;
					
					System.out.print("Enter Customer ID You Want To Remove info for :  ") ;
					String cid2 = input.next() ;
					
					
					hot.removeCustomer(hot.getCustomer(cid2));
					main() ;
					
				}
				
				else if(option2 == 3)
				{
					System.out.println("") ;
		            System.out.println("") ;
					
					hot.showAllCustomers() ;
					main() ;
				}
				
				else if (option2 == 4)
				{
					main() ;
				}
				
				else
				{
					System.out.println("Invalid Option") ;
					main() ;
				}
		}
		
		else if(option == 3)
		{
			
			
                int option3 = 0 ;		
				
				
				System.out.println("") ;
				System.out.println("") ;

				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				System.out.println("              Room Management Options") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				System.out.println("Choose An Option") ;
		        System.out.println("1. Rent a Room") ;
		        System.out.println("2. Checkout of a Room") ;
		        System.out.println("3. Back To LOOBBY") ;
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				
				System.out.println("") ;
				System.out.println("") ;

				System.out.print("Option:  ") ;
		        
				System.out.println("") ;
				

				Customer c2 = new Customer() ;
				Room r1 = new Room() ;
				
				
				try
				{
					option3 = input.nextInt() ;
				}
				catch(InputMismatchException i)
				{
					System.out.print(" ") ;
			        System.out.print("Invalid Input!") ;
				}
				
				if(option3 == 1)
				{
					System.out.println("") ;
		            System.out.println("") ;
					
					System.out.print("Enter Customer ID:  ") ;
					String cid3 = input.next();
				
					
					
					System.out.print("Enter Quantity of Rooms: ") ;
					int rq = input.nextInt() ;
					
					
						r1.renting(rq,cid3) ;
				
					main() ;
				}
				
				else if(option3 == 2)
				{
					System.out.println("") ;
		            System.out.println("") ;
					
					System.out.print("Enter Customer ID:  ") ;
					String cid4 = input.next() ;
				
					
					
					System.out.print("Enter Quantity of rooms:  ") ;
					int rq1 = input.nextInt() ;
					

						r1.leaving(rq1,cid4) ;
						
					main() ;	
				
					
				}
				
				else if(option3 == 3)
				{
					
					main() ;
				}
				
				
				
				else
				{
					System.out.println("Invalid Option") ;
					main() ;
				}

		}
		
		else if(option == 4)
		{
			System.out.println("") ;
		    System.out.println("") ;
			
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("           Thank You For Using the Program") ;
			System.out.println("                 Program Terminated") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		
		else
		{
		    System.out.println("");
            System.out.println("");
			
		    System.out.println("Option Entered Is Not Valid.");
		    System.out.println("Choose Between 1 to 4!");
		    main();
		}
		
		
	}
	
}
