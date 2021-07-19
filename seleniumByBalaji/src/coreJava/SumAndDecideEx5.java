package coreJava;

import java.util.Scanner;

public class SumAndDecideEx5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the desired Range=");
		int Range=sc.nextInt();
		int sum=0;
		for(int i=1;i<=Range;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of all odd number till Range="+sum);
	}

}
