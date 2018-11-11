
public class OverRidding {
	void method1(String x) {
		System.out.println("Parent class out put");
	}

}
class OverRidding1 extends OverRidding
{
	void method1(String y)
	{
		System.out.println("Child Class out put");
	}
}
class MainClass 
{
	public static void main(String args[])
	{
		OverRidding R1 = new OverRidding();
		R1.method1("Parent Class");
		OverRidding1 R2 = new OverRidding1();
		R2.method1("Child Class");
				
	}
}