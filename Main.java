package exceptions;
import java.util.Scanner;

public class Main
{
	
	static String validate(int n,int p) throws NegativeNumber
	{
		if(n<0||p<0)
			throw new NegativeNumber("p or n can not be negative"); 
		else
		{
			
			try {
				zero(n,p);
				
				}
			catch(NotEqualToZero r)
			{
				System.out.println(r.getMessage());
			}
			return "valid positive number";
			
		}
	}
	static String zero(int n,int p) throws NotEqualToZero
	{
		if(n==0||p==0)
			throw new NotEqualToZero("can not be zero");
		else
		{
			
			
			MyCalculator m=new MyCalculator();
			long j=m.power(n, p);
			System.out.println(j);
			return "valid positive number";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		int n=sc.nextInt();
		int p=sc.nextInt();
		try
		{
			validate(n,p);
		}
		catch(NegativeNumber e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}