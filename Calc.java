
public class Calc implements Display {

	@Override
	public int add(int a ,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a ,int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a ,int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Addition add method:" + this.add(100, 200));
		System.out.println("Substation sub method:" + this.sub(200, 500));
		System.out.println("multipilcaion mul method:" + this.mul(300, 200));

	}
	
	public static void main(String arg[])
	{
		Calc Cal = new Calc();
		Cal.display();
		
	}

}
