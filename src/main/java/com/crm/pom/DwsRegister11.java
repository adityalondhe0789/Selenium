package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegister11 {

	public DwsRegister11(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
	}
	    private  @FindBy(xpath = "//a[text()='Register']")
		
		WebElement register ;
		
	     private	 @FindBy(id = "gender-male")
		WebElement male;
		
		
		private  @FindBy(id = "FirstName")
		
		WebElement firstNameTextFild ;
		
		private @FindBy(id="LastName")
		
		WebElement lastName_text;
		
		private  @FindBy(id="Email")
		WebElement emailTextFild;
		
		private @FindBy(xpath = "//input[@name='Password']")
		WebElement password;
		
		private  @FindBy(xpath = "//input[@name='ConfirmPassword']")
		WebElement confirmPassword;
		
		public @FindBy(xpath = "//input[@id='register-button']")
		 WebElement register_button;
		
		
		public void registerClick() {
			register.click();
		}
		
		public void maleClick() {
			male.click();
		}
		public void firstNameTextFildClick() {
			firstNameTextFild.click();;
		}
		public void  firstNameTextFild(String firstName) {
			firstNameTextFild.sendKeys(firstName);
			
		}
		
		public void clickLastName() {
			lastName_text.click();
		}
		
		public void lastName(String lName) {
			lastName_text.sendKeys(lName);
		}
		public void clickEmail() {
			
			emailTextFild.click();
		}
		
		public void  email (String email) {
			
			emailTextFild.sendKeys(email);
		}
		
		public void clickPassword() {
			password.click();
		}
		
		public void  password(String passwordSeand) {
			
			password.sendKeys(passwordSeand);	
		}
		
		public void clickConfirmPass() {
			confirmPassword.click();
		}
		
		public void confirmPasswor(String con_pass) {
			
			confirmPassword.sendKeys(con_pass);
		}
		
		
}
