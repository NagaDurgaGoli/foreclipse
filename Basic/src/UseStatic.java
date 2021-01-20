
public class UseStatic {
	static int num1=3;
	static int num2;
	static {
		System.out.println("Number 2:"+num2);
		num2=num1*4;
	}
	static void myMethod(int num3)
	{
		System.out.println("Number3"+num3);
		num1=num2;
		System.out.println("Number1"+num1);
	}
	public static void main(String[] args) {
		myMethod(4);
	}

}
