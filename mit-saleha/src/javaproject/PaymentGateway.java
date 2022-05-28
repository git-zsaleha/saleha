package javaproject;

import java.util.Scanner;

public class PaymentGateway {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		char choice;
		do {
			System.out.println("NOTE: Plaese pay by only one payment mode ");
			System.out.println(" Choose your payment mode");
			System.out.println("   1. Credit Card");
			System.out.println("   2. Debit Card");
			System.out.println("   3. NetBanking");
			System.out.println("   4. Cash");
			System.out.println("   5. Exit");
			System.out.print("Choose any option from above     ");
			choice = scan.next().charAt(0);
		}while(choice< '1' || choice > '6');
		System.out.println("\n");
		switch(choice)
		{
		case '1':
			System.out.println("Credit Card");
			System.out.println("Enter Your Card No.\n Expiry Date\n\n CVV Code\n");
			break;
		case '2':
			System.out.println("Debit Card");
			System.out.println("Enter Your Card No");
			System.out.println("Expiry date");
			System.out.println("CVV Code");
			break;
		case '3':
			System.out.println("NetBanking");
						char select;
					do {
					System.out.println("Select Bank");
				    System.out.println("  1.State Bank Of India");
					System.out.println("  2. ICICI Bank");
					System.out.println("  3. HDFC Bank");
					System.out.println("  4. Axis Bank");
					System.out.println("  5. All Other Banks");
					System.out.println("  6. Exit from here\n");
				    System.out.print("Select One Of the above options  ");
					select = scan.next().charAt(0);
					}while(choice< '1' || choice > '6');
					System.out.println("\n");
					switch(select)
					{
					case '1':
					System.out.println("State Bank Of India\n");
					break;
					case '2':
					System.out.println("ICICI Bank\n");
					break;
					case '3':
					System.out.println("HDFC Bank\n");
					break;
					case '4':
					System.out.println("Axis Bank\n");
					break;
					case '5':
					System.out.println("All other banks\n");
					System.out.println("You can select other bank \n");
					break;
					case '6':
						System.out.println("Are you sure to cancel this transaction ");
						System.out.println("This would cancel your payment transaction (Y/N)");
					}
	
			break;
		case '4':
			System.out.println("  Cash");
			System.out.println("  Please pay by cash");
			//System.out.println("Not available for cash\n");
			//System.out.println("if you want to pay with cash then you will pay after your product was delivered \n");
			break;
			
		case '5':
			//String answer;
			//boolean YN;
			System.out.println("  Are you sure to exit from here  (Y/N)");
			System.out.println(" \n  ----- THANK YOU -----  ");	
		}
		}
}
			/*while(true) {
				
				if(answer.equals("Y")) {
					//Scanner in;
					answer=answer.nextLine().trim().toUpperCase();
					YN = true;
					break;
				}else if (answer.equals("N")) {
					
					YN = false;
					break;
				}else {
					System.out.println("Please answer Y/N");
				}
			}
			}
			
			else { System.out.println("Choose your payment mode");
		}
		}*/
		
	