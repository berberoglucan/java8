package _08.primitive.versions;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class PrimitiveConsumer {
	
	// IntConsumer, DoubleConsumer, LongConsumer
	
	// void accept(int t);
	// void accept (double t)
	// void accept(long t)
	public static void main(String[] args) {
		IntConsumer ic = System.out::println;
		
		ic.accept(5);
		
		DoubleConsumer dc = PrimitiveConsumer::printSumFive;
		
		DoubleConsumer dc2 = (double d) -> printSumFive(d);
		
		dc.accept(10.0);
		
		dc2.accept(20.0);
	}	
	
	
	public static void printSumFive(double d) {
		System.out.println(d + 5);
	}

}
