import java.util.Scanner;

class b003
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		System.out.println("Enter the third number");
		c=sc.nextInt();
		if(a>b || b>a || a>c || b>c || c>a || c>b)
		{
			if(a>=b && a>=c)
			{
				System.out.println("A is the greatest");
			}
			else if(b>=a && b>=c)
			{
				System.out.println("B is the greatest");
			}
			else
			{
				System.out.println("C is the greatest");
			}
		}
		else
		{
			System.out.println("All numbers are equal");
		}
	}
}

				
			
		