package coreJava;

public class ConditionalTest {

	public static void main(String[] args) {
		int marks=75;
		if(marks>=90)
		{
			System.out.println("A");
		}
		else if(marks<=89&&marks>=80)
		{
			System.out.println("b");
		}
		else if(marks<=79&&marks>=60)
		{
			System.out.println("c");
		}
		else if(marks<60)
		{
			System.out.println("f");
		}

	}

}
