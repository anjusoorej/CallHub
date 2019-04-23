package callHub;

public class testPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Go4Games\\Downloads\\selenium\\chromedriver\\chromedriver.exe");
		Methods method = new Methods();
		method.authentication();
		method.PhoneBook();
		method.CreatePhoneBook();
		
			
			

	}

}
