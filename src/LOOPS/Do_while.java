package LOOPS;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		
		
		
		
		int i=2;
		
		
		
		
		
		do {
			System.out.println(i);
			i+=4;
		} while(i<= number);
	}
}
