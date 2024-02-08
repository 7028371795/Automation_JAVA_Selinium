package org.winding;

public class Ex_2_ExplicitWinding {

	public static void main(String[] args) {
		float f=10.3f;
		int a=(int)f;
		System.err.println(a);
		
		double d=100.10;
		a=(int )d;
		System.out.println(a);
		
		byte z=(byte)d;
		System.out.println(z);
		
		z=(byte)a;
		System.out.println(z);
		
	}

}
