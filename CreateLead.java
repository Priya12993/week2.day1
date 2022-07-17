package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		// maximize the browser
		driver.manage().window().maximize();

		//
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sysarc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sara");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("marypriya12993@gmail.com");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test");
		WebElement sourceid = driver.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement sourceid1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select s = new Select(sourceid);
		Select i = new Select(sourceid1);
		s.selectByVisibleText("Cold Call");
		i.selectByVisibleText("New Jersey");

		driver.findElement(By.className("smallSubmit")).click();
		String leadTitle = driver.getTitle();
		System.out.println(leadTitle);
		

	}



	

}
