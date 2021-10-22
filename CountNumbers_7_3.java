package project3;

import java.util.Scanner;

public class CountNumbers_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] count=new int[101];
		for(int i=0;i<101;i++) {
			count[i]=0;
		}
		System.out.print("Enter the integers between 1 and 100:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		while(num>0) {
			count[num]++;
			num=input.nextInt();
		}
		for(int i=0;i<101;i++) {
			if(count[i]==1) {
				System.out.println(i+" occurs "+count[i]+" time");
			}else if(count[i]>1) {
				System.out.println(i+" occurs "+count[i]+" times");
			}
		}
	}

}
