package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.HomePageObjects;

import io.cucumber.java.en.*;



public class StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Given("User on Wikipedia Home Page")
	public void user_on_wikipedia_home_page() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully entered correct url");
	}

	@When("User enter subject to be searched in homepage")
	public void user_enter_subject_to_be_searched() {
		HomePageObjects hp = new HomePageObjects(driver);
	    hp.searchbar();
	}

	@Then("User press search button")
	public void user_press_search_button() {
		HomePageObjects hp = new HomePageObjects(driver);
	    hp.searchbtn();
	    
	}

	@And("Result is displayed")
	public void result_is_displayed() {
		log.info("Successfully searched");
		driver.close();
	    
	}
}
