package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public  HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
		
	}
	

	@FindBy(id ="firstName") 
	@CacheLookup
	WebElement firstName;

	@FindBy(id ="lastName") 
	@CacheLookup
	WebElement lastName;

	@FindBy(id ="email") 
	@CacheLookup
	WebElement Email;
	
	@FindBy(id ="password") 
	@CacheLookup
	WebElement Password;
	
	@FindBy(id ="passwordConfirm") 
	@CacheLookup
	WebElement Passconfirm;
	
	
	@FindBy(id ="age") 
	@CacheLookup
	WebElement Age;
	
	@FindBy(id ="phone") 
	@CacheLookup
	WebElement Phone;
	
	@FindBy(id ="ssn") 
	@CacheLookup
	WebElement Ssn;
	
	@FindBy(xpath ="//span[@class = 'error']")
	@CacheLookup
	WebElement Error;
	
	public void fName() {
		firstName.sendKeys("Latika");
	}
		public void lName() {
			lastName.sendKeys("Sharma");
	
}
		public void email() {
			Email.sendKeys("Sharmalatika772@gmail.com");
			
	
}
		public void Password() {
			Password.sendKeys("latika89");
			
	
}
		public void confirm() {
			Passconfirm.sendKeys("latika89");
		}
		
		public void agen() {
			Age.sendKeys("40");
			
	
}
		public void phone() {
			Phone.sendKeys("5072108822");
			
	
}public void ssn() {
	Ssn.sendKeys("807884446");
	
	
}
public void clear() {
	Password.clear();
}

//Invalid Password 

public void Password1() {
	Password.sendKeys("latika");
	  System.out.println("Password must be greater than or equal to 8 characters");
	 Password.clear();
	 Password.sendKeys("latika89");
}

//Invalid Age

public void age() {
	Age.clear();
	Age.sendKeys("12");
	 System.out.println("You must be older than 12 to open an account");
}
//Enter Invalid Name but not getting error
public void name() {
	firstName.clear();
	lastName.clear();
	firstName.sendKeys("abcdefghijklmnopqrstuvwxyzqwertyuiop");
	lastName.sendKeys("hrtjhrtjuytuytiyuiyuiyuiyuidfsdgdfgfd");
	System.out.println("not getting error");
}

}