package _01.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {

		// 1
		Calculator lambdaCalculator = (int x, int y) -> x + y;
		// metodun dönüþ tipi int
		// x + y ----> return x + y; iþlemine karþýlýk gelir.
		System.out.println(lambdaCalculator.operation(3, 5));

		// 2
		Calculator lambdaCalculator2 = (m, n) -> m - n;
		// parametre tipi verilmek zorunda deðiliz
		// (int m, int n) yerine (m,n) kullanýlabilir.
		System.out.println(lambdaCalculator2.operation(5, 3));

		// 3
		// Calculator lambdaCalculator3 = (m,n) -> return m*n; // compile error
		Calculator lamdaCalculator3 = (m, n) -> {
			return m * n;
		};
		System.out.println(lamdaCalculator3.operation(5, 3));
	}

}

@FunctionalInterface
interface Calculator {
	// @FunctionalInterface ise 1 tane abstract metot olabilir.
	// birden fazla olamaz.
	int operation(int number1, int number2);
}
