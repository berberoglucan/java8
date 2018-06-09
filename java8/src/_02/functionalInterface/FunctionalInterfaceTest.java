package _02.functionalInterface;

public class FunctionalInterfaceTest {

}

@FunctionalInterface
interface Animal {
	void eat(String food);
}

@FunctionalInterface
interface Dog extends Animal {

	@Override
	void eat(String food);

}

// Compile error
// Functional interface olamaz
// Bir tane abstract metot bulunmalý
// abstract metot Animal interface de

/*@FunctionalInterface
interface Bird extends Animal {
	void fly();
}*/
