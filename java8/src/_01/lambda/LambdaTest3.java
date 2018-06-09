package _01.lambda;

public class LambdaTest3 {

	public static void main(String[] args) {

		Message msg = (String str) -> System.out.println(str);

		msg.printMessage("hello world!");

		// compile error
		// Message msg2 = String str -> System.out.println(str);

		// Metot sadece bir tane parametre alýyorsa ve parametre tipini belirtmediysek
		// bu durumda parantez kullanmasak da olur.
		Message msg1 = str -> System.out.println(str);

		msg1.printMessage("hello java!");

	}

}

@FunctionalInterface
interface Message {
	void printMessage(String msg);
}