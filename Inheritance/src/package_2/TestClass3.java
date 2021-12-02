package package_2;

import package_1.TestClass2;

public class TestClass3 extends TestClass2 {
	public  int s=89;
	
	public static void main(String[] args) {
		
		TestClass3 v = new TestClass3();
		v.nondemo();
		v.nonTest();
		System.out.println(v.s);
	}

}
