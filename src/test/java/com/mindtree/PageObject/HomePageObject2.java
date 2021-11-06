package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.HomePageElements;

public class HomePageObject2 {
	
WebDriver driver;
	
	public HomePageObject2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement searchbar() {
		return driver.findElement(HomePageElements.searchbar);
	}
	
	public WebElement searchbtn() {
		return driver.findElement(HomePageElements.searchbtn);
	}
	
	public WebElement title() {
		return driver.findElement(HomePageElements.title);
	}
	
	


}
