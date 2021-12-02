package package_1;

import package_2.TestClass3;

public class TestClass2 extends TestClass1 {
	  int e=50;
	  static int g=70;
	 
	 public void nonTest()
	 {
		 System.out.println("mahendra");
	 }
	
	public static void main(String[] args) {
		System.out.println(TestClass3.a);
		System.out.println(TestClass3.d);
		
		TestClass2 f =new TestClass2();
		f.nondemo();
		f.nonTest();
		demo();
		System.out.println(f.e);
		System.out.println(f.g);
	}

}
//