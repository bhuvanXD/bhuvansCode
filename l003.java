import java.util.Scanner;

class l003
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[3];
		int i,temp;
		System.out.println("Enter 3 elements");
		for(i=0;i<ar.length;i++)
		ar[i]=sc.nextInt();
		for(i=0;i<ar.length;i++)
		temp=ar[i];
		ar[i]=ar[ar.length-1-i];
		ar[ar.length-1-i]=temp;
		{
			System.out.println(" "+ar[i]);
		}
	}
}
	
	

	