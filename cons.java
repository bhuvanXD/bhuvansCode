class cons
{
	int x,y;
	cons(int b)
	{
		x=b;
	}
	cons(cons ref)
	{
		y=ref.x;
	}
	void display()
	{
		System.out.println("Value of x is:"+x);
		System.out.println("Value of y is:"+y);
	}
	public static void main(String args[])
	{
		cons obj=new cons(20);
		cons obj1=new cons(obj);
		obj.display();
	}
	
}
		
		