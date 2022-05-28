package calendar;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class ExamDateSheet {
	public static void main(String[] args) {
		
	
	System.out.println("Exam DateSheet Of GoldenTouch");
	System.out.println("Batch Name Please");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	System.out.println("Hello "  +  name  +  "  Have A Good Luck");
	 		
	LocalDateTime localDateTime1 =
			LocalDateTime.of(2022, Month.MAY, 25, 07, 30);
	 
	System.out.println(localDateTime1);
	
	System.out.println("FOR WRITTEN EXAM");
	LocalDateTime localDateTime2 =
			LocalDateTime.of(2022, Month.MAY, 26, 15, 30);

		LocalDateTime localDateTime3 =
			LocalDateTime.of(2022, Month.MAY, 25, 07, 30);
	 
	System.out.println(localDateTime3);
	
	System.out.println("FOR WRITTEN EXAM");
	LocalDateTime localDateTime4 =
			LocalDateTime.of(2022, Month.MAY, 26, 15, 30);
	 
	System.out.println(localDateTime4);

}}	



	

	
	
	
	


