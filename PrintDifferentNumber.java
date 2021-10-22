package project3;

import java.util.Scanner;

public class PrintDifferentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[10];
		int isSame=0;
		int distinctNum=0;
		int listNum=0;
		System.out.print("Enter ten numbers:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		nums[listNum]=num;
		listNum++;
		for(int i=0;i<9;i++) {
			int n=num;
			isSame=0;
			for(int j=0;j<10;j++) {
				if(nums[j]==num) {
					isSame=1;
					distinctNum++;
					break;
				}
			}
			num=input.nextInt();
			if(isSame==1) continue;
			nums[listNum]=n;
			listNum++;
		}
		System.out.println("The number of distinct numbers is: "+(10-distinctNum));
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<listNum;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
