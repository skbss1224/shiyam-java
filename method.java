package shiyam;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic operator
//		int shiyam=20;
//		int sasi=46;
//		int total;
//		total=shiyam+sasi;
//		System.out.println("total is:"+""+total);
//		total=shiyam-sasi;
//		System.out.println("total is:"+total);
//		total=shiyam*sasi;
//		System.out.println("total is:"+total);
//		total=shiyam/sasi;
//		System.out.println("total is:"+total);
//		total=shiyam%sasi;
//		System.out.println("total is:"+total);
		Scanner shiyam=new Scanner(System.in);
		System.out.println("enter the int value");
		int black=shiyam.nextInt();
		System.out.println("enter_the int value");
		int white=shiyam.nextInt();
		System.out.println("plus operator"+black+white);
		System.out.println("minusoperator"+(black-white));
		System.out.println("mul operator"+black*white);
		System.out.println("mod operator"+black%white);
		System.out.println("div operator"+black/white);
		
	}

}
