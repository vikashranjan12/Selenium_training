package coreJava;

public class MulOf5AndDecideEx4 {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=30;i++)
		{
			int table=num*i;
			System.out.print("3*"+i+"="+table);
			if(table%2==0)
			{
				System.out.print(" and this is even number");
			}
			if(table%2!=0)
			{
				System.out.print(" and this is odd number");
			}
			System.out.println();
		}
		

	}

}
