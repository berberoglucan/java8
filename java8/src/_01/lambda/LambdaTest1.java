package _01.lambda;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		// anonymous class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable#anonymous");
			}
		};
		
		runnable.run();
		
		// lambda exp
		// Başta yer alan parantez/() fonksiyonel interface'deki metodun
		// parametre listesidir.
		// run() metodu parametre almıyor, bu durumda yine de () gereklidir.
		Runnable runnableLambda = () -> System.out.println("Lambda");
		runnableLambda.run();
		
		Runnable runnableLambda2 = () -> {
			System.out.println("line1");
			System.out.println("line2");
		};
		
		runnableLambda2.run();
		
		
	}

}
