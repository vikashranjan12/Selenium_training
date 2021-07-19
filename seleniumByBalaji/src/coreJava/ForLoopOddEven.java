package coreJava;

public class ForLoopOddEven {

	public static void main(String[] args) {
		int i=1;
		for(i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.println("The number "+i +"is Even");
			}
			if(i%2!=0)
			{
				System.out.println("The number "+i +"is Odd");
			}
		}
	}

}
