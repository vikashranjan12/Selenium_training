package coreJava;

import java.util.Scanner;

public class BinaryRightTriangleEx8 {

	public static void main(String[] args) {
		int rowno,colno;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number of rows=");
		int TotalRow=obj.nextInt();
		for(rowno=1;rowno<=TotalRow;rowno++)
		{
			for(colno=1;colno<=rowno;colno++)
			{
			/*Concept row+col i.e (row 1+col 1)= 2%2 similarly (row2 +Col 1)=3%2...we
			want 1 in row 1 col 1 i.e (1+1)%2=0*/
				if((rowno+colno)%2==0)
				{
					System.out.print("1");    /*here not provide ln because after giving
					                            each output it will chage the line*/
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();    /*just after completing operation in row 1 before going to
			                         next row print the output in next line so to form triangle.*/
		}

	}

}
