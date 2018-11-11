public class OverLoading 
{
void Method1(int x) {
	System.out.println("This is an integer value");
}
void Method1(int x, String y) {
	System.out.println("This is an int and String");
}
void Method1(int x,double z) {
	System.out.println("This is an int and double");
}
public static void main(String args[])
{
	OverLoading d1 = new OverLoading();
	d1.Method1(2);
	d1.Method1(3, 4.3);
	d1.Method1(7, "Metoo");
}
}
