package org.step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefition2 {
	
	WebDriver driver;
	
	@Given("user is an Login page")
	public void user_is_an_Login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("user given a valid {string} and valid {string}")
	public void user_given_a_valid_and_valid(String string, String string2) {
		WebElement txtName = driver.findElement(By.id("username"));
		txtName.sendKeys(string);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(string2);
	   
	}

	@When("user click on button")
	public void user_click_on_button() {

		WebElement btncreat = driver.findElement(By.id("login"));
		btncreat.click();
	   
	   
	}

	@Then("you are succesfully login")
	public void you_are_succesfully_login() {
		 WebElement welcome = driver.findElement(By.id("username_show")); 
		   System.out.println( welcome.getAttribute("value"));
//		   driver.quit();
	   
	}

	@When("user as Select Location")
	public void user_as_Select_Location() {
	   
	}
     
	@When("user as Select Hotel")
	public void user_as_Select_Hotel() {
	  
	   
	}

	@Then("user as Select the Room Type")
	public void user_as_Select_the_Room_Type() {
	  
	   
	}

	@Then("user as Number of Rooms")
	public void user_as_Number_of_Rooms() {
	  
	   
	}

	@Then("user as Select Check In Date")
	public void user_as_Select_Check_In_Date() {
	  
	   
	}

	@Then("user as Select Check Out Date")
	public void user_as_Select_Check_Out_Date() {
	  
	   
	}

	@Then("user as Select Adults per Room")
	public void user_as_Select_Adults_per_Room() {
	  
	   
	}

	@Then("user as Select Children per Room")
	public void user_as_Select_Children_per_Room() {
	  
	   
	}

	@Then("user as Click the radio button and click the continue")
	public void user_as_Click_the_radio_button_and_click_the_continue() {
	  
	   
	}

	@Then("user as give the First Name")
	public void user_as_give_the_First_Name() {
	  
	   
	}

	@Then("user as give the Last Name")
	public void user_as_give_the_Last_Name() {
	  
	   
	}

	@Then("user given the Billing Address")
	public void user_given_the_Billing_Address() {
	  
	   
	}

	@Then("user as give a Credit Card No")
	public void user_as_give_a_Credit_Card_No() {
	  
	   
	}

	@Then("user as Select the Credit Card Type")
	public void user_as_Select_the_Credit_Card_Type() {
	  
	   
	}

	@Then("user as Select the Expiry Date")
	public void user_as_Select_the_Expiry_Date() {
	  
	   
	}

	@Then("user give a CVV Number")
	public void user_give_a_CVV_Number() {
	  
	   
	}

	@Then("user Click the BookNow button")
	public void user_Click_the_BookNow_button() {
	  
	   
	}

	@Then("user get the OrderNo")
	public void user_get_the_OrderNo() {
	  
	   
	}

	@Then("user Click the MyItinerary")
	public void user_Click_the_MyItinerary() {
	  
	   
	}

	@Then("User Click the Logout button")
	public void user_Click_the_Logout_button() {
	  
	   
	}

	@Then("User get the successfully logged out message")
	public void user_get_the_successfully_logged_out_message() {
	  
	   
	}

	




}
