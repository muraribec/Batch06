package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login");
		driver.manage().window().maximize();		
	}
	
	@When("^title of login page is Facebook$")
	public void title_of_login_page_is_Facebook(){
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Log in to Facebook", title);
	}
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username,String pwd) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(pwd);
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.id("loginbutton")).click();	
	}
	
	
	@Then("^user get header of the login page$")
	public void user_get_header_of_the_login_page(){
		System.out.println("I am in loginpage header");
	}
	
	@Then("^user validate header of the login page$")
	public void user_validate_header_of_the_login_page() {
	    System.out.println("I vaidated header of the login page");
	}
	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page(){
//		String title = driver.getTitle();
//		System.out.println("Home page title is"+title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//	@Then("^user move to new Conatct page$")
//	public void user_move_to_new_Conatct_page() {
//		//WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(@title,'New Contact')]")).click();
//		}
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enter_and_and_Manager(String firstname, String lastname,String position) throws Exception{
//		Thread.sleep(5000);
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	  	}	
//	
//	@Then("^user Close the browser$")
//	public void user_Close_the_browser(){
//		driver.quit();
//	}
//	
	
	
	
	
	
	
	
	
}
