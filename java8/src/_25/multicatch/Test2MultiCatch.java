package _25.multicatch;

import java.sql.SQLException;

public class Test2MultiCatch {

	public static void main(String[] args) {

		try {

		} catch (Exception e) {

		}

		try {
			testMethod();
		} catch (SQLException e) {

		}

	}
	// Java will not allow you to declare a catch block for a checked
	// exception type that cannot potentially be thrown by the try clause
	// body. This is again to avoid unreachable code.

	public static void testMethod() throws SQLException {

	}
}
