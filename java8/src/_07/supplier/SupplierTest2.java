package _07.supplier;

import java.util.function.Supplier;

public class SupplierTest2 {
	public static void main(String[] args) {
		
		Supplier<String> s1 = () -> "can";
		
		Supplier<Integer> s2 = () -> 100;
		
		System.out.println(s1.get());
		
		System.out.println(s2.get());
		
		String name = "can";	
		Supplier<byte[]> s3 = name::getBytes;
		
		byte[] byteArray = s3.get();
		
		for (byte b : byteArray) {
			System.out.println(b);
		}
		
	}
}
