package day5;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username");
	}

	public void enterPassword() {
		System.out.println("Password");
	}

	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUsername();
		ltd.enterPassword();

	}

}
