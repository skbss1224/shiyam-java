package shiyam;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float loanamt,tax,percent=5,pay,var;
		System.out.println("Enter your desired loan amount : ");
		loanamt = sc.nextFloat();
		//Monthly
		tax = loanamt*percent/100;
		pay = loanamt+tax;
		System.out.println("Your tax amount after one month will be : "+ tax);
		System.out.println("If you wish to pay whole amount in one month, the amount would be : "+pay);
		//Quarterly
		var=3*loanamt;
		tax = var*percent/100;
		pay = loanamt+tax;
		System.out.println("Your tax amount after one quarter will be : "+ tax);
		System.out.println("If you wish to pay whole amount in one quarter, the amount would be : "+pay);
        //half-year
		var=6*loanamt;
		tax = var*percent/100;
		pay = loanamt+tax;
		System.out.println("Your tax amount after half-year will be : "+ tax);
		System.out.println("If you wish to pay whole amount in half-year, the amount would be : "+pay);
		//yearly
		var=12*loanamt;
		tax = var*percent/100;
		pay = loanamt+tax;
		System.out.println("Your tax amount after a year will be : "+ tax);
		System.out.println("If you wish to pay whole amount in year, the amount would be : "+pay);
	}

}
