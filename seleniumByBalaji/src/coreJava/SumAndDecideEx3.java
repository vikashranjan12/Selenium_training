package coreJava;

import java.util.Scanner;

public class SumAndDecideEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the desired Range=");
		int Range=sc.nextInt();
		int sum=0;
		for(int i=0;i<=Range;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		if(sum%2==0)
		{
		System.out.println("Sum of all even number till Range="+sum);
		System.out.println(sum+"is Even number");
		
		}
		if(sum%2!=0)
		{
		System.out.println("Sum of all even number till Range="+sum);
		System.out.println(sum+" is Even number");
		
		}
	}

}
