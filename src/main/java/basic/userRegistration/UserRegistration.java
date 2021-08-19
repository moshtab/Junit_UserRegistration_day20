package basic.userRegistration;

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

}
