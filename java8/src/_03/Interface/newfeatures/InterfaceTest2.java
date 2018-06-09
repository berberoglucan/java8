package _03.Interface.newfeatures;

interface Fly {
	int getWingSpan(); // abstract method

	int MAX_SPEED = 100; // public static final

	default void land() {
		System.out.println("Animal is landing");
	}

	static double calculateSpeed(float distance, double time) {
		return distance / time;
	}
}

class Eagle implements Fly {

	@Override
	public int getWingSpan() {
		return 150;
	}

	@Override
	public void land() {
		// Fly.super.land();
		System.out.println("Eagle is landing");
	}

}

public class InterfaceTest2 {
	public static void main(String[] args) {

		Fly flyEagle = new Eagle();

		System.out.println(flyEagle.getWingSpan());

		flyEagle.land();

		System.out.println(Fly.MAX_SPEED);

		// flyEagle.calculateSpeed(10,5); // compile error

		// interface te tanimli static metotlari
		// interfaceName.staticMethodName seklinde cagirabiliriz.
		System.out.println(Fly.calculateSpeed(10, 5));

	}

}
