package _03.Interface.newfeatures;

// interfaceler i�in java8 �ncesinde sadece abstract metotlar tan�mlanabilirdi.

// java8 ile birlikte default ve static metotlar tan�mlanabilir.

interface MyInterface {
	void testMethod1(); // abstract method

	// default methodlar override edilmesi zorunlu de�ildir!!
	default void defaultMethod() { // public default void
		System.out.println("default method");
	}

	// static metotlar override edilemez.
	static void staticMethod() {
		System.out.println("static method");
	}
}

class MyClass implements MyInterface {

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void defaultMethod() { MyInterface.super.defaultMethod(); }
	 */

}

public class InterfaceTest1 {

}
