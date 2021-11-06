package com.mindtree.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.HomePageObject2;

import io.cucumber.java.en.*;

public class StepDefinition2 extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@Given("^User on Wikipedia Home Page url$")
    public void user_on_wikipedia_home_page() throws Throwable {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully entered correct url");
        
    }

    @When("^User enter (.+) to be searched$")
    public void user_enter_to_be_searched(String item) throws Throwable {
    	HomePageObject2 hp2 = new HomePageObject2(driver);
    	hp2.searchbar().sendKeys(item);
        
    }

    @Then("^User press search button in wikipedia$")
    public void user_press_search_button() throws Throwable {
    	HomePageObject2 hp2 = new HomePageObject2(driver);
    	hp2.searchbtn().click();
        
    }

    @And("^Validate the title of page and close browser$")
    public void validate_the_title_of_page_and_close_browser() throws Throwable {
    	HomePageObject2 hp2 = new HomePageObject2(driver);
    	Thread.sleep(5000);
    	System.out.println(hp2.title().getText());
    	log.info("Printed title successfully");
    	driver.close();
    	
        
    }

}
