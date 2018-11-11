
public class Final {
final void run()
{
	System.out.println("Final Called");
}
}
class FinalClass extends Final
{
	public static void main(String args[])
	{
		Final F1 = new Final();
		F1.run();
				
	}
}
