package _26.trywith.resources;


public class Test3TryWithResources {

	public static void main(String[] args) {
		
		try(Computer computer = new Computer()) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Computer implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

