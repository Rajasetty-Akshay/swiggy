package feature;


 
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

	
public class swiggy_runner {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@After
	public void teardown() {
		
	}

    @Given("^user has opened swiggy website on chrome browser$")
    public void user_has_opened_swiggy_website_on_chrome_browser() throws Throwable {
    	driver.get("https://www.swiggy.com");
    	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
  
}

@When("^user eneters correct \"([^\"]*)\"$")
public void user_eneters_correct_something(String phonenumber) throws Throwable {
   WebElement lgin=driver.findElement(By.xpath("//*[text()='Login']"));
   lgin.click();
   
   WebElement ph=driver.findElement(By.id("mobile"));
   ph.sendKeys(phonenumber);
   
       WebElement lg=driver.findElement(By.className("a-ayg"));
       lg.click();
    }

    @Then("^user should be able to login successfuly$")
    public void user_should_be_able_to_login_successfuly() throws Throwable {
    	
    }

}
