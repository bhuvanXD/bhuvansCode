import java.util.Scanner;

class ar1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,s1=0,s2=0;
	    int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(i=0;i<3;i++)
			{	
				s1=0;
				s2=0;		
				for(j=0;j<3;j++)
				{
				s1=s1+ar[i][j];
				s1=s1+ar[j][i];
				}				
				System.out.println("Sum of rows"+s1);
				System.out.println("Sum of columns"+s2);
			}		
	}
}
			