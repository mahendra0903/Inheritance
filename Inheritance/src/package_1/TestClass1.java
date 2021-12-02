package package_1;

public class TestClass1 {
	
	public static int a=10;
	       static int b=20;
	private static int c=30;
	protected static int d=40;
	
	public static void demo()
	{
		System.out.println("static method");
	}
	
	public void nondemo()
	{
		System.out.println("non static");
	}
	
	public static void main(String[] args) {
		
		System.out.println(TestClass1.a);
		System.out.println(TestClass2.b);
	
		System.out.println(TestClass2.d);
		demo();
        TestClass2 r =new TestClass2();
        r.nondemo();
	  
		TestClass2.demo();
	}

}
