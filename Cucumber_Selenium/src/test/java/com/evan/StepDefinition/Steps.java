package com.evan.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("^Open Firefox and access the Guru99 practice application")
	public void we_are_on_the_login_page() throws Throwable {
		// System.setProperty("webdriver.firefox.marionette",
		// "Drivers/geckodriver.exe");
		// driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		// driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/v4");
		// driver.get("https://www.google.com");
	}

	@When("^Enter username and password")
	public void enter_my_information() throws Throwable {
		WebElement username = driver.findElement(By.name("uid"));
		WebElement password = driver.findElement(By.name("password"));

		username.sendKeys("NotActuallyAPassword");
		password.sendKeys("NotActuallyAUsername");
	}

	@Then("^Reset the input fields")
	public void i_should_be_at_the_find_flights_page() throws Throwable {
		WebElement resetButton = driver.findElement(By.name("btnReset"));
		resetButton.click();
	}
}
