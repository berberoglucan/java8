package _29.list.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test1ListResourceBundle {

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("_29.list.resource.bundle.Message", new Locale("tr"));

		System.out.println(rb.getString("key1"));
		System.out.println(rb.getString("key2"));

		ResourceBundle rb2 = ResourceBundle.getBundle("_29.list.resource.bundle.Message", new Locale("en"));

		System.out.println(rb2.getString("key1"));
		System.out.println(rb2.getString("key2"));

	}

}
