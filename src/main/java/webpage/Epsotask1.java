package webpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Epsotask1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://europa.eu/epso/application/passport/login.cfm?comp_id=");
    driver.findElement(By.xpath("//a[text()='Accept only essential cookies']")).click();
    driver.findElement(By.cssSelector("a[href='#close']")).click();
	String name = "janarthanan";
	String pass = "jana12345@$";
	driver.findElement(By.xpath("//input[@name='login']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@class='box-submit']")).click();
	driver.findElement(By.linkText("Personal data")).click();
	driver.findElement(By.xpath("//a[text()='Upload CV']")).click();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,300)");
	Thread.sleep(3000);
	WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
	browse.sendKeys("C:\\Users\\abbij\\Downloads\\0710-basic-computer-maintenance.pdf");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Upload']")).click();
	System.out.println(driver.findElement(By.xpath("//font[text()='File is uploaded']")).getText());
	driver.findElement(By.xpath("//a[text()='Upload supporting documents']")).click();
	WebElement value = driver.findElement(By.cssSelector("select[name='fileType']"));
	Select dropdowns = new Select(value);
	dropdowns.selectByIndex(2);
	String dispName = "janarthanan";
	driver.findElement(By.cssSelector("input[name='displayName']")).sendKeys(dispName);
	WebElement fileUpload = driver.findElement(By.cssSelector("input[id='uploadFile']"));
	fileUpload.sendKeys("C:\\Users\\abbij\\Downloads\\basics-computer-maintenance.pdf");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText());
	driver.findElement(By.xpath("//a[text()='Additional Information']")).click();
	WebElement values = driver.findElement(By.cssSelector("select[id='field_selection']"));
	Select down = new Select(values);
	down.selectByIndex(4);
	WebElement option = driver.findElement(By.cssSelector("select[name='security_clearance_validity_day']"));
	Select dropdown = new Select(option);
	dropdown.selectByIndex(30);
	WebElement option1 = driver.findElement(By.cssSelector("select[name='security_clearance_validity_month']"));
	Select dropdown1 = new Select(option1);
	dropdown1.selectByIndex(9);
	WebElement option2 = driver.findElement(By.cssSelector("select[name='security_clearance_validity_year']"));
	Select dropdown2 = new Select(option2);
	dropdown2.selectByIndex(22);
	driver.findElement(By.xpath("//span[text()='Save']")).click();
	System.out.println(driver.findElement(By.cssSelector("p[class='alert alert-success']")).getText());
	driver.findElement(By.cssSelector("a[title='My Skills']")).click();
    driver.findElement(By.cssSelector("input[id='skill-255']")).click();
	driver.findElement(By.cssSelector("input[id='skill-382']")).click();
	driver.findElement(By.cssSelector("input[id='skill-265']")).click();
	driver.findElement(By.xpath("//input[@id='skill-266']")).click();
	driver.findElement(By.xpath("//input[@id='skill-282']")).click();
	driver.findElement(By.xpath("//input[@id='skill-367']")).click();
	driver.findElement(By.xpath("//input[@id='skill-370']")).click();
	driver.findElement(By.xpath("//input[@id='skill-377']")).click();
	driver.findElement(By.xpath("//input[@id='skill-381']")).click();
	driver.findElement(By.xpath("//span[text()='Save']")).click();
	System.out.println(driver.findElement(By.cssSelector("p[class='alert alert-success']")).getText());
	driver.findElement(By.xpath("//a[text()='MS Office ® skills']")).click();
	driver.findElement(By.cssSelector("button[id='option-296-294']")).click();
	driver.findElement(By.cssSelector("button[id='option-297-294']")).click();
	driver.findElement(By.xpath("//button[@id='option-298-292']")).click();
	driver.findElement(By.xpath("//button[@id='option-299-293']")).click();
	driver.findElement(By.xpath("//button[@id='option-300-294']")).click();
	driver.findElement(By.cssSelector("button[id='option-301-293']")).click();
	driver.findElement(By.xpath("//span[text()='Save']")).click();
	System.out.println(driver.findElement(By.xpath("//p[text()='Your skills were saved']")).getText());
	driver.findElement(By.xpath("//a[text()='Personal Data Protection']")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,9900)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Change my Password']")).click();
//	String oldPassword = "jana12344@$";
//	String password = "jana12345@$";
//	String password1 = "jana12345@$";
//	driver.findElement(By.cssSelector("input[name='f_pass_old']")).sendKeys(oldPassword);
//	driver.findElement(By.cssSelector("input[name='f_pass_a']")).sendKeys(password);
//	driver.findElement(By.xpath("//input[@id='f_pass_b']")).sendKeys(password1);
//	driver.findElement(By.xpath("//a[@id='save_data']/span//span")).click();
	driver.findElement(By.xpath("//a[text()='Delete my EPSO Account']")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	}

}
