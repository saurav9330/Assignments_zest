package com.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.QA.base.Testbase;


public class Iphone extends Testbase {
	

	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbox_amazon;
	@FindBy(xpath="//input[@value='Go']")
	WebElement Amazon_submit;
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/I/51-RH0sNhTL._AC_UY218_ML3_.jpg']")
	WebElement iphonelink_amazon;
	@FindBy(id="priceblock_ourprice")
	WebElement price_amazon;
	@FindBy(xpath="//input[@type='text']")
	WebElement Searchbox_flipkart;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Flipkart_submit;
	@FindBy(css="._3wU53n")
	WebElement iphonelink_flipkart;
	@FindBy(css="._2i1QSc")
	WebElement price_flipkart;
	
	
	public Iphone() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void amazon_searchbox(String object) {
		Searchbox_amazon.sendKeys(object);
	}
	public void submit_amazon() {
		Amazon_submit.click();
	}
	public void Amazon_iphonelink() {
		iphonelink_amazon.click();
	}
	public String Amazon_price() {
		return price_amazon.getText();
	}
	public void Flipkart_search(String object1) {
		Searchbox_flipkart.sendKeys(object1);
	}
	public void submit_flipkart() {
		Flipkart_submit.click();
	}
	public void flipkart_iphonelink() {
		iphonelink_flipkart.click();
	}
	public String flipkart_price() {
		return price_flipkart.getText();
	}
	
	public void Iterator() {
		Set<String> a=driver.getWindowHandles();
		Iterator<String> b= a.iterator();
		b.next();
		String childid=b.next();
		driver.switchTo().window(childid);
	}
	public void Iterator(String abc) {
		Set<String> a2=driver.getWindowHandles();
		Iterator<String> b2= a2.iterator();
		b2.next();
		String childid1=b2.next();
		String childid2=b2.next();
		driver.switchTo().window(childid2);
	}
	public void escape() {
		Actions a1=new Actions(driver);
		a1.sendKeys(Keys.ESCAPE).build().perform();
	}
}

