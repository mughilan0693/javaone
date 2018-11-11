class constructor{
int value1;
int value2;
constructor()
{
	value1=10;
value2=20;
System.out.println("Inside construstor");


	}
public void constructor()
{
	System.out.println("Value1=="+value1);
	System.out.println("Value1=="+value2);
	
}
public static void main(String args[])
{
	constructor d1 = new constructor();
	d1.constructor();
}
}

