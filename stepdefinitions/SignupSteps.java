package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegisterPage;
import utils.BaseClass;

public class SignupSteps {
    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;

    @Given("User is on the Magento homepage")
    public void user_is_on_homepage() {
        BaseClass.initializeDriver();
        driver = BaseClass.getDriver();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @When("User navigates to create account page")
    public void user_navigates_to_create_account() {
        homePage = new HomePage(driver);
        homePage.clickCreateAccount();
    }

    @And("User fills out the registration form")
    public void user_fills_out_form() {
        registerPage = new RegisterPage(driver);
        registerPage.enterFirstName("John");
        registerPage.enterLastName("Doe");
        String email = "john" + System.currentTimeMillis() + "@example.com";
        registerPage.enterEmail(email);
        registerPage.enterPassword("Password@123");
        registerPage.confirmPassword("Password@123");
        registerPage.clickCreateAccount();
    }

    @Then("Account should be created successfully")
    public void account_created_successfully() {
        // Add optional verification step
    }

    @And("User should be able to login with the new credentials")
    public void user_can_login() {
        // Optional
    }
    @After
    public void tearDown() {
        BaseClass.quitDriver();
    }

}
