package _25.multicatch;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Test1MultiCatch {

	public static void main(String[] args) {

		// old version
		try {
			testMethod();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// new version
		try {
			testMethod();
		} catch (FileNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// catch(Exception1 e | Exception2 e | Exception3 e) // DOES NOT COMPILE
		// catch(Exception1 e1 | Exception2 e2 | Exception3 e3) // DOES NOT COMPILE
		// catch(Exception1 | Exception2 | Exception3 e) // compile

		// try {
		// } catch (FileNotFoundException | IOException e) { } // DOES NOT COMPILE
		// FileNotFoundException IS-A IOException
	}

	public static void testMethod() throws FileNotFoundException, SQLException {

	}
}
