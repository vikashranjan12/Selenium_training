package coreJava;

import java.util.Scanner;

public class ProducesLastSampleEx6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Last sample value=");
		int N=sc.nextInt();
		System.out.print("Enter the decrease value from N="); //here no ln because we want write
		                                                      //the input in same line
		int M=sc.nextInt();
		int A=N-M;
		for(int i=N-1;i>=A;i--)
		{
			System.out.println("Last "+M+" "+"sample values are "+i);
		}
		
	}
}
