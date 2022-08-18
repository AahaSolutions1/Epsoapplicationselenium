package webpage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Epsotask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://europa.eu/epso/application/passport/login.cfm?comp_id=");
		driver.findElement(By.xpath("//a[@class='wt-link cck-actions-button ea_ignore']")).click();
		driver.findElement(By.cssSelector("a[href='#close']")).click();
		driver.findElement(By.xpath("//a[@class='login_link'][3]")).click();
		driver.findElement(By.cssSelector("a[id='f_register'] span[class='text']")).click();
		driver.findElement(By.xpath("//input[@name='f_login']")).sendKeys("Abijith");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("jana12345@$");
		driver.findElement(By.xpath("//input[@id='f_pass_b']")).sendKeys("jana12345@$");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@id='field_cname']")).sendKeys("Sivanandham");
		driver.findElement(By.cssSelector("input[id='field_lname']")).sendKeys("Perfect");
		driver.findElement(By.xpath("//input[@name='field_fname']")).sendKeys("Jana");
		driver.findElement(By.cssSelector("input[value='M']")).click();
		driver.findElement(By.xpath("//button[@class='duet-date__toggle']")).click();
		WebElement op1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[11]/div[1]/div[1]/duet-date-picker[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]"));
		Select drop2 = new Select(op1);
		drop2.selectByIndex(46);
		WebElement op2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[11]/div[1]/div[1]/duet-date-picker[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select drop1 = new Select(op2);
		drop1.selectByIndex(9);
		
		driver.findElement(By.xpath("//span[text()='20']")).click();
		
		WebElement option = driver.findElement(By.cssSelector("select[id='field_lang_id']"));
		Select dropdown = new Select(option);
		dropdown.selectByVisibleText("French");
		WebElement option1 = driver.findElement(By.cssSelector("select[id='field_citizenship']"));
		Select dropdown1 = new Select(option1);
		dropdown1.selectByVisibleText("Dutch");
		WebElement option2 = driver.findElement(By.cssSelector("select[id='field_citizenship_2']"));
		Select dropdown2 = new Select(option2);
		dropdown2.selectByVisibleText("Italian");
		driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("No.1,6th cross,Tagore Nagar,Lawspet");
		driver.findElement(By.cssSelector("input[name='field_locality']")).sendKeys("Puducherry");
		driver.findElement(By.cssSelector("input[id='field_postcode']")).sendKeys("605008");
		WebElement option3 = driver.findElement(By.cssSelector("select[name='field_rpa_id']"));
		Select dropdown3 = new Select(option3);
		dropdown3.selectByVisibleText("France");
		driver.findElement(By.cssSelector("input[name='field_email']")).sendKeys("janathanan996@gmail.com");
		driver.findElement(By.cssSelector("input[id='field_email_validate']")).sendKeys("janathanan996@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Telephone']")).sendKeys("0442255382");
		driver.findElement(By.cssSelector("input[name='field_gsm']")).sendKeys("9003943754");
		driver.findElement(By.cssSelector("input[id='field_fax']")).sendKeys("04132224874");
		driver.findElement(By.cssSelector("button[id='saveButton']")).click();
	}

	

}
