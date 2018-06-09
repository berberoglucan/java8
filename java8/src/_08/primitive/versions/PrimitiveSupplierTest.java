package _08.primitive.versions;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

import java.util.Random;

public class PrimitiveSupplierTest {
	
	// IntSupplier, DoubleSupplier, LongSupplier
	
	// int getAsInt();
	// double getAsDouble();
	// long getAsLong();
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		IntSupplier is = () -> random.nextInt();
		
		IntSupplier is2  = random::nextInt;
		
		System.out.println(is.getAsInt());
		
		System.out.println(is.getAsInt());
		
		
		DoubleSupplier ds = () -> getMyNumber();
		
		DoubleSupplier ds2 = PrimitiveSupplierTest::getMyNumber;
		
		System.out.println(ds.getAsDouble());
		
		System.out.println(ds2.getAsDouble());
		
	}
	
	public static double getMyNumber() {
		return 100.5;
	}
	
}
