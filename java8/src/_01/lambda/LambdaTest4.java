package _01.lambda;

public class LambdaTest4 {

	public static void main(String[] args) {
		LambdaFunction lambda = (number) -> {
			if (number % 2 == 0)
				return "Even";
			else
				return "Odd";

		};

		System.out.println(lambda.getEvenOrOdd(3));

		System.out.println(lambda.getEvenOrOdd(6));
	}

}

@FunctionalInterface
interface LambdaFunction {

	String getEvenOrOdd(int number);

}
