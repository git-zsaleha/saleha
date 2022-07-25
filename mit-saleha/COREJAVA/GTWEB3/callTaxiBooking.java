package GTWEB3;

import java.util.Scanner;

public class callTaxiBooking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Taxi[] taxi=new Taxi[10];
		int taxiId=4,bookingId=0;
		BookingDetails[] booking=new BookingDetails[20];
	   // Taxi[]=new taxi[0];
	    //Taxi[]=new taxi[1];
		int choice,availability;
		while(true) 
		{
			System.out.println("    Call Taxi Booking       ");
			System.out.println("1.Booking");
			System.out.println("2.Booking Details");
			System.out.println("3.Taxi Details");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				availability=addBooking(booking,bookingId,taxi,taxiId);
				if(availability!=-1)
				{
					System.out.println("Your booking is successfull with taxi no:"+(availability));
					booking[bookingId].dropTime();
					calcEarning(booking,bookingId,taxi,availability,booking[bookingId].to,booking[bookingId].from);
					bookingId++;
				}
				else
				{
					System.out.println("No taxi is free on your pickup time!!");
					System.out.println("you may try other time for your booking");
				}
				break;
			case 2:
				System.out.println("BookingId    CustomerId    TaxiNo    PickupPoint    DropPoint    PickupTime    DropTime      Earnings  ");
				for(int bookingid=0;bookingId<bookingid;bookingid++)
				{
					System.out.format("%-13d%-15d%-13s%-13s%-13d%-13d%-13d",bookingid,booking[bookingid].customerid,booking[bookingid].taxiNo,booking[bookingId].to,booking[bookingId].from,booking[bookingid].pickupTime,booking[bookingid].dropTime,booking[bookingid].earning);
					System.out.println("");
				}
				break;
			case 3:
				for(int taxiid=0;taxiid<taxiId;taxiid++)
				{
					int temp=0;
					System.out.println("---------------");
					System.out.format("%-10s%-10d%-10s%-10s","taxiNo:",taxiid,"currentLocation:",taxi[taxiid].currentLocation);
					System.out.println("");
					System.out.println("                ");
					for(int bookingid=0;bookingid<bookingId;bookingid++)
					{
						if(booking[bookingid].taxiNo==taxiid)
						{
							if(temp==0)
								System.out.println("BookingId    CustomerId    TaxiNo    PickupPoint    DropPoint    PickupTime    DropTime      Earnings");
							    System.out.format("%-13d%-15d%-13s%-13s%-13d%-13d%-13d",bookingid,booking[bookingid].customerid,booking[bookingid].taxiNo,booking[bookingId].to,booking[bookingId].from,booking[bookingid].pickupTime,booking[bookingid].dropTime,booking[bookingid].earning);
							    System.out.println("");
							    temp=1;
						}
					}
					System.out.format("%-10s%-10d","TotalEarning:",taxi[taxiid].earning);
					System.out.println("");				}
			}
			 
			/*case 4:
				System.out.println("jhvhjjjj");
				default:
					System.out.println("Please enter valid option!!!!");*/
		    
		  }
		}
     
	public static int addBooking(BookingDetails[]booking,int bookingId,Taxi[] taxi,int taxiId)
	  {
		int availability,customerId,pickupTime;
		char to,from;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter customer id:");
			customerId=sc.nextInt();
			System.out.println("Enter pickup point(a-f)");
			sc.nextLine();
		    to=sc.nextLine().charAt(0);
		    System.out.println("Enter drop point(a-f)");
		    from=sc.nextLine().charAt(0);
		    System.out.println("Enter pickup time");
		    pickupTime=sc.nextInt();
		   // booking[bookingId]=new BookingDetails(customerId,to,from,pickupTime);
		    availability=booking[bookingId].checkAvailability(taxi, taxiId);
		    return availability;
	  }	
	 public static void calcEarning(BookingDetails[] booking,int bookingId,Taxi[] taxi,int taxiId,int to,int from)
	  {
		  int earning;
		  earning=(((Math.abs(to-from)*15)-5)*10)+100;
		  booking[bookingId].earning=earning;
		  taxi[taxiId].earning=earning;
	      }
	 }
	 class Taxi{
		   int relaxationTime;
		   int earning;
		   char currentLocation;
		   public Taxi() {
			   currentLocation ='a';
		   }
		   public boolean isTaxiFree(int pickupTime) {
			   if(relaxationTime<pickupTime)
				   return false;
			   return true;
		   } 
		   public void relaxationTime(char to,char from,int pickupTime) {
			   relaxationTime=pickupTime+Math.abs(to-from);
		   }
	   }
	   class BookingDetails{
		   int bookingId, customerid;
		   char from;
		   char to;
		   int pickupTime,earning,taxiNo;
		   int dropTime;
		   int amount;
		   public BookingDetails(int customerid,char to,char from,int pickupTime) {
			  
		}
		   public void dropTime() {
			   this.dropTime=pickupTime+Math.abs(to-from);
		   }
		  public int checkAvailability(Taxi[] taxi,int taxiCount) {
		   int taxiId,taxiid=0,shortestDistance=6;
		   for(taxiId=0;taxiId<taxiCount;taxiId++) {
			   if(taxi[taxiId].isTaxiFree(pickupTime)) 
			   {
				   if (Math.abs(taxi[taxiid].currentLocation-to)<shortestDistance)
				   {
					  taxiid=taxiId; 
				   }
				   if(Math.abs(taxi[taxiId].currentLocation-to)==shortestDistance)
				   {
					   if(taxi[taxiId].earning<taxi[taxiid].earning)
						   taxiId=taxiId;
				   }
				}
				   shortestDistance=Math.abs(taxi[taxiid].currentLocation-to);
				   
			   }
			   if(shortestDistance!=6);
			   {
				   taxi[taxiid].relaxationTime(to, from, pickupTime);
				   taxi[taxiid].currentLocation=from;
				   taxiNo=taxiid;
				   return taxiNo;
			   }
		     } 
		  }



      