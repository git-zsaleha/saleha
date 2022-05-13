package condition;

import java.util.Scanner;

public class CondDemo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
		int num=scan.nextInt();
		int val=num%2;
		boolean boo=(val==0);
		String result=boo ? "Even number..":"Odd number...";
		System.out.println(result);
		System.out.println((num%2==0)?"Even number..":"Odd number...");
	}

}
