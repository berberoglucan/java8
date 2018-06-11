package _28.resource.bundle;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Test1ResourceBundle {

	// public class PropertyResourceBundle extends ResourceBundle
	// public abstract class ResourceBundle
	
	public static void main(String[] args) {
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("_28.resource.bundle.config", new Locale("tr"));
		
		String message = resourceBundle.getString("message");
		
		System.out.println(message);
		
		PropertyResourceBundle propertyResourceBundle = (PropertyResourceBundle) ResourceBundle.getBundle("_28.resource.bundle.config", new Locale("en"));
		
		String message2 = propertyResourceBundle.getString("message");
		
		System.out.println(message2);
		
	}

}
