package Loops;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		int i=10,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt(); 
		
		//for loop
		for(i=10;i>=n;i--) {
			System.out.println(i);
		}
		
		//do while loop
		do {
			System.out.println(i);
			i--;
		}while(i>=n);
		
	}
}
