package LOOPS;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		
	    Scanner cd=new Scanner(System.in);
		System.out.println("enter the number");
		int number= cd.nextInt();
		
		
	 for(int i=0; i<=number; i++) {
		 System.out.println(i);
	 }
	}

}
