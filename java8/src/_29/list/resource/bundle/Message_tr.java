package _29.list.resource.bundle;

import java.util.ListResourceBundle;

public class Message_tr extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { 
			{ "key1", "Merhaba Hosgeldiniz" }, 
			{ "key2", "Hoscakal" } 
		};
	}

	// public abstract class ListResourceBundle extends ResourceBundle
	// abstract protected Object[][] getContents();

}
