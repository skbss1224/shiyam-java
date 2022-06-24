package shiyam;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		relational operators
		Scanner shiyam=new Scanner(System.in);
		System.out.println("enter the a value:");
		int a=shiyam.nextInt();
		System.out.println("enter the b value:");
		int b=shiyam.nextInt();
		//<,>,==,<=,>=,!=
		System.out.println("greater than");
		System.out.println(a<b);
		System.out.println("less than");
		System.out.println(a>b);
		System.out.println("greater than equal");
		System.out.println(a<=b);
		System.out.println("less than equal");
		System.out.println(a>=b);
		System.out.println("equal operator");
		System.out.println(a==b);
		System.out.println("not equal");
		System.out.println(a!=b);
		//bus ticket reservation
		Scanner sasi=new Scanner(System.in);
		System.out.println("enter the place:");
		String place=sasi.nextLine();
		System.out.println("enter the bus type:");
		String type=sasi.nextLine();
		System.out.println("enter the amount:");
		int amount=sasi.nextInt();
		
		if(place.equals("chennai")) {
			System.out.println("you selected in chennai place");
			if(type.equals("ordinary")) {
				System.out.println("you selected ordinary bus.");
				if(amount>=150) {
					System.out.println("travel in ordinary bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
					
			}
			else if(type.equals("delux")) {
				System.out.println("you selected delux bus.");
				if(amount>=250) {
					System.out.println("travel in delux bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("superdelux")) {
				System.out.println("you selected superdelux bus.");
				if(amount>=350) {
					System.out.println("travel in superdelux bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("sleeper")) {
				System.out.println("you selected sleeper bus.");
				if(amount>=450) {
					System.out.println("travel in sleeper bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else {
				System.out.println("AC bus service not available");
			}
			
		}
		else if(place.equals("coimbatore")) {
			System.out.println("you selected in coimbatore place");
			if(type.equals("ordinary")) {
				System.out.println("you selected ordinary bus.");
				if(amount>=100) {
					System.out.println("travel in ordinary bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
					
			}
			else if(type.equals("delux")) {
				System.out.println("you selected delux bus.");
				if(amount>=200) {
					System.out.println("travel in delux bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("superdelux")) {
				System.out.println("you selected superdelux bus.");
				if(amount>=300) {
					System.out.println("travel in superdelux bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("sleeper")) {
				System.out.println("you selected sleeper bus.");
				if(amount>=400) {
					System.out.println("travel in sleeper bus in"+" "+place);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else {
				System.out.println("AC bus service not available");
			}
			
		}
		else {
			System.out.println("two place services available chennai and coimbatore");
		}
		
	}

}
