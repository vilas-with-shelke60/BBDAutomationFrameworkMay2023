package stepdefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	WebDriver driver;

	 @Given("^user is on login page$")
	    public void user_is_on_login_page(){
	       System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");	
	      driver= new ChromeDriver();
	       driver.get("https://classic.crmpro.com/login.cfm");
	       }
	 
	 
	    @And("^user enter username in textbok$")
	    public void user_enter_username_in_textbok(){
	        driver.findElement(By.name("username")).sendKeys("Speedwaytech2023");
	    }

	    @And("^user enter password in textbox$")
	    public void user_enter_password_in_textbox() {
	        driver.findElement(By.name("password")).sendKeys("Speedwaytech@2023");
	    }

 
	    @When("^user click on login button$")
	    public void user_click_on_login_button() {
	        driver.findElement(By.xpath("//input[@value='Login']")).click();
	    }

	    //@Then("^user should be redirected to HomePage$")
	    //public void user_should_be_redirected_to_homepage(){
	        
	   // }

	   

}
