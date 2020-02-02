package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.base.Testbase;
import com.pages.Iphone;

public class Assignment1 extends Testbase {
	String price1, price2;
	float Amazon_price, Flipkart_price;
	
	
	public Assignment1() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
			}
	
	@Test
	public void Assignment1_() throws IOException, InterruptedException {
		driver.get("https://www.amazon.in/");
		Iphone ip=new Iphone();
		ip.amazon_searchbox("iPhone XR (64GB) - Yellow");
		ip.submit_amazon();
		Thread.sleep(1000);
		ip.Amazon_iphonelink();
		ip.Iterator();
		price1=ip.Amazon_price();
		price1=price1.replaceAll("[^0-9.]", "");
		Amazon_price=Float.parseFloat(price1);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		ip.escape();
		ip.Flipkart_search("iPhone XR (64GB) - Yellow");
		ip.submit_flipkart();
		Thread.sleep(2000);
		ip.flipkart_iphonelink();
		ip.Iterator("Flipkart");
		price2=ip.flipkart_price();
		price2=price2.replaceAll("[^0-9]", "");
		Flipkart_price=Integer.parseInt(price2);
		if(Amazon_price>Flipkart_price) {
			System.out.println("Flipkart has least price --> "+Flipkart_price);
		}
		else {
			
			System.out.println("Amazon has least price --> "+Amazon_price);
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
