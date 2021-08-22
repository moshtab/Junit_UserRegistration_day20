package basic.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

	}

	public String firstName(String name) {
		String firstName = name;
		if (firstName.charAt(0) == firstName.toUpperCase().charAt(0) && firstName.length() > 2) {
			return (firstName);
		} else {
			System.out.println("You have entered in incorrect way");
			return null;

		}

	}

	public Object lastName(String string) {
		String lastName = string;
		if (lastName.charAt(0) == lastName.toUpperCase().charAt(0) && lastName.length() > 2) {
			return (lastName);
		} else {
			System.out.println("You have entered in incorrect way");
			return null;

		}
}

	public boolean validateEmailId(String string) {
		String emailId = string;
		String regex = "^([a-zA-Z0-90_.+-]+)@([a-z0-9]+).([a-z]{2,4})(.[a-z]{2,4})?$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		return m.matches();
	}

	public boolean validateMobileNumberId(String string) {
		String mobileNumber = string;
		String regex = "^(91 )[897][0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}

	public boolean validatePasswordId(String string) {
		String password = string;
		String regex = "[a-zA-Z0-9]{7,}#"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return m.matches();
	}
	

}
