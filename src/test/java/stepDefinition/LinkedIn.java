package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

    WebDriver driver;
    @Given("^A chrome browser$")
    public void a_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\poorn\\IdeaProjects\\AutomationPractise3\\src\\test\\java\\chromedriver.exe");
      driver = new ChromeDriver();

    }

    @When("^I try to access LinkedIn website$")
    public void i_try_to_access_LinkedIn_website() {
        driver.get("https://www.linkedin.com");
    }
    @Then("^I see Welcome to your professional community$")
    public void i_see_Welcome_to_your_professional_community() {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(true,driver.getTitle().contains("LinkedIn"));

        driver.quit();

    }

}