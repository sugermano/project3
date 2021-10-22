package project3;

import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter list:");
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		int dec=0;
		int ahead=input.nextInt();
		int behind=input.nextInt();
		for(int i=0;i<length-2;i++) {
			dec=ahead-behind;
			if(dec>0) {
				System.out.println("The list is not sorted");
				return;
			}
			ahead=behind;
			behind=input.nextInt();
		}
		System.out.println("The list is already sorted");
	}

}
