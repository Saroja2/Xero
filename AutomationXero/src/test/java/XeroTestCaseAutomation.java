import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XeroTestCaseAutomation {

		public static String parentWindow;
	
		public void TC01A() throws InterruptedException 
		{
			 WebDriver driver;
			
			 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
			 driver = new ChromeDriver();
			 
			 driver.get("https://www.xero.com/us/");
			 Thread.sleep(2000);
			 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			 Actions act = new Actions(driver);
			 act.moveToElement(userLogin).build().perform();
			 userLogin.click();
			 
			 WebElement userName = driver.findElement(By.id("email"));
			 userName.sendKeys("saroja_potturi@yahoo.com");
			 
			 Thread.sleep(2000);
			
			 WebElement passWord= driver.findElement(By.id("password"));
			passWord.sendKeys("Jun!2019");
			 
			 WebElement Login= driver.findElement(By.id("submitButton"));
			 Login.click();
			
		}

		public void TC01B() throws InterruptedException 
		{
			 WebDriver driver;
			
			 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
			 driver = new ChromeDriver();
			 
			 driver.get("https://www.xero.com/us/");
			 Thread.sleep(2000);
			 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			 Actions act = new Actions(driver);
			 act.moveToElement(userLogin).build().perform();
			 userLogin.click();
			 
			 WebElement userName = driver.findElement(By.id("email"));
			 userName.sendKeys("saroja_potturi@yahoo.com");
			 
			 Thread.sleep(2000);
			
			 WebElement passWord= driver.findElement(By.id("password"));
			 passWord.sendKeys("Jun");
			 
			 WebElement Login= driver.findElement(By.id("submitButton"));
			 Login.click();
			
		}
		
		public void TC01C() throws InterruptedException 
		{
			 WebDriver driver;
			
			 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
			 driver = new ChromeDriver();
			 
			 driver.get("https://www.xero.com/us/");
			 Thread.sleep(2000);
			 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			 Actions act = new Actions(driver);
			 act.moveToElement(userLogin).build().perform();
			 userLogin.click();
			 
			 WebElement userName = driver.findElement(By.id("email"));
			 userName.sendKeys("saroja@gmail.com");
			 
			 Thread.sleep(2000);
			
			 WebElement passWord= driver.findElement(By.id("password"));
			passWord.sendKeys("Jun!2019");
			 
			 WebElement Login= driver.findElement(By.id("submitButton"));
			 Login.click();
			
		}

		public void TC01D() throws InterruptedException 

		{
			 WebDriver driver;
			
			 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
			 driver = new ChromeDriver();
			 
			 driver.get("https://www.xero.com/us/");
			 Thread.sleep(2000);
			 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
			 Actions act = new Actions(driver);
			 act.moveToElement(userLogin).build().perform();
			 userLogin.click();
			 
			 WebElement forgotPassword = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
			 forgotPassword.click();
			 
			 Thread.sleep(1000);
			 WebElement UserName = driver.findElement(By.id("UserName"));
			 UserName.sendKeys("saroja_potturi@yahoo.com");
			 
			 WebElement sendLink = driver.findElement(By.xpath("//span[@class='text']"));
			 sendLink.click();
			 Thread.sleep(2000);
			 driver.quit();
		}

		public void TC02A() throws InterruptedException 
		{
			 WebDriver driver;
				
			 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
			 driver = new ChromeDriver();
			 
			 driver.get("https://www.xero.com/us/");
			
			 Thread.sleep(2000);
			 
			 WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
			
			 Actions act = new Actions(driver);
			 act.moveToElement(freeTrial).build().perform();
			 freeTrial.click();
		
			 Thread.sleep(2000);
			 
			 driver.switchTo().defaultContent();
			 driver.switchTo().frame(0);
			 System.out.println("I am in a frame");
				 
			 Thread.sleep(2000);
			 driver.switchTo().defaultContent();
			 WebElement formFN = driver.findElement(By.xpath("//div[@class='signup-form-firstname form-group']"));
			 act.moveToElement(formFN).build().perform();
			 formFN.click();
			 Thread.sleep(2000);
			 driver.switchTo().defaultContent();
			 WebElement firstName = driver.findElement(By.xpath("//input[@name ='FirstName']"));
			 firstName.sendKeys("Saroja");
			 
			 WebElement formLN = driver.findElement(By.xpath("//div[@class='signup-form-lastname form-group']"));
			 act.moveToElement(formLN).build().perform();
			 formLN.click(); 
			 
			 WebElement lastName = driver.findElement(By.xpath("//input[@name='LastName']"));
			 lastName.sendKeys("Jun!2019");
			 
			 WebElement emailform = driver.findElement(By.xpath("//div[@class='signup-form-email form-group']"));
			 act.moveToElement(emailform).build().perform();
			 emailform.click(); 
			 
			 WebElement email = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
			 email.sendKeys("saroja_potturi@yahoo.com");
			 
			 WebElement phoneform = driver.findElement(By.xpath("//div[@class='signup-form-phone form-group']"));
			 act.moveToElement(phoneform).build().perform();
			 phoneform.click(); 
			 
			 WebElement phone = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
			 phone.sendKeys("1233488907");
			 
			 WebElement countryform = driver.findElement(By.xpath("//div[@class='signup-form-country form-group']"));	
			 act.moveToElement(countryform).build().perform();
			 countryform.click(); 
			 
			 WebElement Location = driver.findElement(By.xpath("//select[@name='LocationCode']"));
			 Location.click();
			// act.moveToElement(Location).build().perform();
			// Location.click();
			 Select dropdown = new Select(Location);
			 dropdown.selectByValue("AR");
			// Location.click();
			 Thread.sleep(10000);
			 WebElement Agree = driver.findElement(By.xpath(" //input[@name='TermsAccepted']"));
			 Agree.click();
			 
			 WebElement Start = driver.findElement(By.xpath(" //span[@class='g-recaptcha-submit']"));
			 Start.click();
			
		}
		
		 public void TC02B() throws InterruptedException 
			{
				 WebDriver driver;
					
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				
				 Thread.sleep(2000);
				 
				 WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
				
				 Actions act = new Actions(driver);
				 act.moveToElement(freeTrial).build().perform();
				 freeTrial.click();
			
				 Thread.sleep(2000); 
				 
				 WebElement Start = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
				 Start.click();
				 
				 WebElement emailform = driver.findElement(By.xpath("//div[@class='signup-form-email form-group form-error']"));
				 act.moveToElement(emailform).build().perform(); 
				 emailform.click(); 
				 Thread.sleep(10000); 
				 
				 WebElement email = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
				 email.sendKeys("123455"); 
			
				 
				 WebElement Start1 = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
				 Start1.click();
				
			}
		 
		 public void TC02C() throws InterruptedException 
			{
				 WebDriver driver;
					
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				
				 Thread.sleep(2000);
				 
				 WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
				
				 Actions act = new Actions(driver);
				 act.moveToElement(freeTrial).build().perform();
				 freeTrial.click();
				 
				 String primaryWindow1 = driver.getWindowHandle();	
				 WebElement termsOfUse = driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
				 termsOfUse.click();
				
				 
				 for(String handle1 : driver.getWindowHandles()) 
					{
						driver.switchTo().window(handle1);	}			
				Thread.sleep(5000);
			
	 
			     WebElement privacyPolicy = driver.findElement(By.xpath("//a[contains(@href,'/us/about/privacy/')]"));
			     act.moveToElement(privacyPolicy).build().perform();
			
				 WebDriverWait wait = new WebDriverWait(driver, 10);
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/us/about/privacy/')]")));
				 privacyPolicy.click();  
				 Thread.sleep(3000); 
				
				
				
				
}
		 
		 public void TC02D() throws InterruptedException 
			{
				 WebDriver driver;
					
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				
				 Thread.sleep(2000);
				 
				 WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
				 
				 Actions act = new Actions(driver);
				 act.moveToElement(freeTrial).build().perform();
				 freeTrial.click();
				 
				 WebElement offerDetails = driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
				 act.moveToElement(offerDetails).build().perform();
				 offerDetails.click();
				 
			}
		 
		 public void TC02E() throws InterruptedException 
			{
				 WebDriver driver;
					
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				
				 Thread.sleep(2000);
				 
				 WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
				 
				 Actions act = new Actions(driver);
				 act.moveToElement(freeTrial).build().perform();
				 freeTrial.click();
				
				 WebElement accountKeeper = driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
				 act.moveToElement(accountKeeper).build().perform();
				 accountKeeper.click();
				 
			}
		 
			public void TC03A() throws InterruptedException 
			{
				 WebDriver driver;
				
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				 Thread.sleep(2000);
				 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
				 Actions act = new Actions(driver);
				 act.moveToElement(userLogin).build().perform();
				 userLogin.click();
				 
				 WebElement userName = driver.findElement(By.id("email"));
				 userName.sendKeys("saroja_potturi@yahoo.com");
				 
				 Thread.sleep(2000);
				
				 WebElement passWord= driver.findElement(By.id("password"));
				passWord.sendKeys("Jun!2019");
				 
				 WebElement Login= driver.findElement(By.id("submitButton"));
				 Login.click();
				 
				 Thread.sleep(3000);
				 
				 WebElement dashBoard = driver.findElement(By.linkText("Dashboard"));
				 act.moveToElement(dashBoard).build().perform();
				 dashBoard.click();
				 Thread.sleep(3000);
				 
				 WebElement account = driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
				 act.moveToElement(account).build().perform();
				 account.click();
				 Thread.sleep(3000);
				 
				 WebElement reports = driver.findElement(By.xpath("//div[@class='xrh-dropdown--body']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Reports')]"));
				 act.moveToElement(reports).build().perform();
				 reports.click();
				 
				 Thread.sleep(3000);
				 WebElement contacts= driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
				 act.moveToElement(contacts).build().perform();
				 contacts.click();
				 Thread.sleep(3000);
				 
				 WebElement xyzindustries= driver.findElement(By.xpath("//span[contains(text(),'xyzindustries')]"));
				 act.moveToElement(xyzindustries).build().perform();
				 xyzindustries.click();
				 Thread.sleep(3000);
				 
				 WebElement settings= driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
				 act.moveToElement(settings).build().perform();
				 settings.click();
				 
				 WebElement xyz= driver.findElement(By.xpath("//button[@class='xrh-button xrh-appbutton']"));
				 act.moveToElement(xyz).build().perform(); 
			

				 WebElement plus = driver.findElement(By.xpath("//button[@class='xrh-button xrh-addon--iconbutton xrh-header--iconbutton xrh-focusable--parent']"));
				 act.moveToElement(plus).build().perform();
				 plus.click();
				 Thread.sleep(2000);
				
				 WebElement search = driver.findElement(By.xpath("//button[@class='xrh-button xrh-addon--iconbutton xrh-header--iconbutton xrh-focusable--parent']"));
				 act.moveToElement(search).build().perform();
				 search.click();
				 Thread.sleep(2000);
				
				 driver.switchTo().parentFrame();
				 System.out.println("I am out of frame"); 
				
				 WebElement notifications = driver.findElement(By.xpath("//button[@title='Notifications']"));
				 act.moveToElement(notifications).build().perform();
				 notifications.click(); 
				 
				 Thread.sleep(2000);
				 WebElement help = driver.findElement(By.xpath("//button[@title='Help']"));
				 act.moveToElement(help).build().perform();
				 help.click(); 
				 
			}
			
			
			public void TC04A() throws InterruptedException 
			{
				 WebDriver driver;
				
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				 Thread.sleep(2000);
				 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
				 Actions act = new Actions(driver);
				 act.moveToElement(userLogin).build().perform();
				 userLogin.click();
				 
				 WebElement userName = driver.findElement(By.id("email"));
				 userName.sendKeys("saroja_potturi@yahoo.com");
				 
				 Thread.sleep(2000);
				
				 WebElement passWord= driver.findElement(By.id("password"));
				passWord.sendKeys("Jun!2019");
				 
				 WebElement Login= driver.findElement(By.id("submitButton"));
				 Login.click();
				 
				 Thread.sleep(3000);
				 
				 Thread.sleep(2000);
				 WebElement sp = driver.findElement(By.xpath("//button[@title='saroja potturi']"));
				 act.moveToElement(sp).build().perform();
				 sp.click();
				 Thread.sleep(2000);
				 
				 WebElement logout = driver.findElement(By.xpath("//a[@href='/logout']"));
				 act.moveToElement(logout).build().perform();
				 logout.click();
				 
			}
			
			public void TC06A() throws InterruptedException 
			{
				 WebDriver driver;
				
				 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
				 driver = new ChromeDriver();
				 
				 driver.get("https://www.xero.com/us/");
				 Thread.sleep(2000);
				 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
				 Actions act = new Actions(driver);
				 act.moveToElement(userLogin).build().perform();
				 userLogin.click();
				 
				 WebElement userName = driver.findElement(By.id("email"));
				 userName.sendKeys("saroja_potturi@yahoo.com");
				 
				 Thread.sleep(2000);
				
				 WebElement passWord= driver.findElement(By.id("password"));
				passWord.sendKeys("Jun!2019");
				 
				 WebElement Login= driver.findElement(By.id("submitButton"));
				 Login.click();
				 Thread.sleep(2000);
			
				 
				
				 WebElement sp = driver.findElement(By.xpath("//button[@title='saroja potturi']"));
				 act.moveToElement(sp).build().perform();
				 sp.click();
				 Thread.sleep(2000);
				 
				 WebElement profile = driver.findElement(By.xpath("//a[@href='https://my.xero.com/Go/UserProfile']"));
				 act.moveToElement(profile).build().perform();
				 profile.click();
				 
				 WebElement photoUpload = driver.findElement(By.xpath("//span[@id='button-1041-btnInnerEl']"));
				 act.moveToElement(photoUpload).build().perform();
				 photoUpload.click();
				 
				 Thread.sleep(2000);
				 
				 WebElement uploadImage = driver.findElement(By.xpath("//div[@id='ext-comp-1167']"));
				 act.moveToElement(uploadImage).build().perform();
				 
				 
				 
				 WebElement browse = driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']"));
				 act.moveToElement(browse).build().perform();
				
				 browse.sendKeys("/Users/Saroja/Documents/FileUpload/balloon.jpg");
				 Thread.sleep(6000);
				 
				 
				 WebElement upLoad =driver.findElement(By.xpath("//span[@id='button-1178-btnInnerEl']"));
				 act.moveToElement(upLoad).build().perform();
				 upLoad.click();
				 
			}
				 public void TC08A() throws InterruptedException {
					 
					 WebDriver driver;
					 
					 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
					 driver = new ChromeDriver();
					 
					 driver.get("https://www.xero.com/us/");
					 
					 
					 Thread.sleep(2000);
					 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
					 Actions act = new Actions(driver);
					 act.moveToElement(userLogin).build().perform();
					 userLogin.click();
					 
					 WebElement userName = driver.findElement(By.id("email"));
					 userName.sendKeys("gopala.anumanchipalli@gmail.com");
					 
					 Thread.sleep(2000);
					
					 WebElement passWord= driver.findElement(By.id("password"));
					passWord.sendKeys("password12");
					 
					 WebElement Login= driver.findElement(By.id("submitButton"));
					 Login.click();
					 Thread.sleep(5000);
				
					 WebElement myXero = driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
					 act.moveToElement(myXero).build().perform();
					 myXero.click();
					 Thread.sleep(2000);
					
					 WebElement changeOrg = driver.findElement(By.xpath("//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
					 act.moveToElement(changeOrg).build().perform();
					 changeOrg.click();
					 Thread.sleep(2000);
					 
					 WebElement addOrg = driver.findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
					 act.moveToElement(addOrg).build().perform();
					 addOrg.click();
					 Thread.sleep(2000);
					 
					 WebElement orgLabel = driver.findElement(By.xpath("//label[contains(text(),'What is the name of your organization?')]"));
					 act.moveToElement(orgLabel).build().perform();
					 orgLabel.click();
				
					 Thread.sleep(2000);
					 
					 WebElement orgName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
					 
					 orgName.sendKeys("Self");
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 
					 WebElement countryLabel = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
					 act.moveToElement(countryLabel).build().perform();
					 countryLabel.click(); 
				
					 List<WebElement> countrydd=driver.findElements(By.xpath("//div[@class='xui-autocompleter--trigger-focus']//div//div//div[@class='xui-iconwrapper xui-iconwrapper-medium']"));
					 for(int i=0;i<countrydd.size();i++) 
					 {
						 WebElement element = countrydd.get(i);
						 String innerhtml = element.getAttribute("innerHTML");
						 if((innerhtml).contentEquals("United States"))
						 {
							element.click();
							break;
						 }
					 }
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 WebElement timeZone = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
					 act.moveToElement(timeZone).build().perform();
					 timeZone.click();
					 
					 List<WebElement> timeZonedd = driver.findElements(By.xpath("//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li/button"));
					 
					for (WebElement element : timeZonedd) 
					{
						String innerhtml = element.getAttribute("innerHTML");
					//	System.out.println("Time zone is : " + innerhtml + element.getText());
						if ((innerhtml).contains("(UTC-08:00) Pacific Time (US &amp; Canada)") )
						{
						//	System.out.println("Inside IF Time zone is : " + innerhtml + element.getText());
							element.click();
							break;
						}
					}
					
					
				
					WebElement organizationDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
					act.moveToElement(organizationDo).build().perform();
					organizationDo.sendKeys("Accountancy");
					
					
				    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
					List<WebElement> orgDd = driver.findElements(By.xpath("//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li//button//span//span/strong"));
					for (WebElement element : orgDd) 
					{
						String innerhtml = element.getAttribute("innerHTML");
					//	System.out.println("Time zone is : " + innerhtml + element.getText());
						if((innerhtml).contains("Accountancy")) 
							
						{
							element.click();
							Thread.sleep(3000);
							break;
						}
					}
					
				/*	WebElement prevAccSoftware = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
					act.moveToElement(prevAccSoftware).build().perform();
					prevAccSoftware.click();
					
							
					WebElement prevAccSoftwareXero = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]/span[1]"));
					act.moveToElement(prevAccSoftwareXero).build().perform();
					prevAccSoftwareXero.click();							
					*/
					
					Thread.sleep(6000); 
					
					
					
					WebElement startTrial = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[1]"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", startTrial);
				//	Thread.sleep(2000);
				//	act.moveToElement(startTrial).build().perform();
					startTrial.click(); 
				 
				 
				 }
				 
 public void TC08B() throws InterruptedException {
					 
					 WebDriver driver;
					 
					 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
					 driver = new ChromeDriver();
					 
					 driver.get("https://www.xero.com/us/");
					 
					 
					 Thread.sleep(2000);
					 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
					 Actions act = new Actions(driver);
					 act.moveToElement(userLogin).build().perform();
					 userLogin.click();
					 
					 WebElement userName = driver.findElement(By.id("email"));
					 userName.sendKeys("gopala.anumanchipalli@gmail.com");
					 
					 Thread.sleep(2000);
					
					 WebElement passWord= driver.findElement(By.id("password"));
					passWord.sendKeys("password12");
					 
					 WebElement Login= driver.findElement(By.id("submitButton"));
					 Login.click();
					 Thread.sleep(5000);
				
					 WebElement myXero = driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
					 act.moveToElement(myXero).build().perform();
					 myXero.click();
					 Thread.sleep(2000);
					
					 WebElement changeOrg = driver.findElement(By.xpath("//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
					 act.moveToElement(changeOrg).build().perform();
					 changeOrg.click();
					 Thread.sleep(2000);
					 
					 WebElement addOrg = driver.findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
					 act.moveToElement(addOrg).build().perform();
					 addOrg.click();
					 Thread.sleep(2000);
					 
					 WebElement orgLabel = driver.findElement(By.xpath("//label[contains(text(),'What is the name of your organization?')]"));
					 act.moveToElement(orgLabel).build().perform();
					 orgLabel.click();
				
					 Thread.sleep(2000);
					 
					 WebElement orgName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
					 
					 orgName.sendKeys("Self");
					 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 
					 WebElement countryLabel = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
					 act.moveToElement(countryLabel).build().perform();
					 countryLabel.click(); 
				
					 List<WebElement> countrydd=driver.findElements(By.xpath("//div[@class='xui-autocompleter--trigger-focus']//div//div//div[@class='xui-iconwrapper xui-iconwrapper-medium']"));
					 for(int i=0;i<countrydd.size();i++) 
					 {
						 WebElement element = countrydd.get(i);
						 String innerhtml = element.getAttribute("innerHTML");
						 if((innerhtml).contentEquals("United States"))
						 {
							element.click();
							break;
						 }
					 }
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 WebElement timeZone = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
					 act.moveToElement(timeZone).build().perform();
					 timeZone.click();
					 
					 List<WebElement> timeZonedd = driver.findElements(By.xpath("//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li/button"));
					 
					for (WebElement element : timeZonedd) 
					{
						String innerhtml = element.getAttribute("innerHTML");
					//	System.out.println("Time zone is : " + innerhtml + element.getText());
						if ((innerhtml).contains("(UTC-08:00) Pacific Time (US &amp; Canada)") )
						{
						//	System.out.println("Inside IF Time zone is : " + innerhtml + element.getText());
							element.click();
							break;
						}
					}
					
					WebElement organizationDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
					act.moveToElement(organizationDo).build().perform();
					organizationDo.sendKeys("Accountancy");
					
					
				    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
					List<WebElement> orgDd = driver.findElements(By.xpath("//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li//button//span//span/strong"));
					for (WebElement element : orgDd) 
					{
						String innerhtml = element.getAttribute("innerHTML");
					//	System.out.println("Time zone is : " + innerhtml + element.getText());
						if((innerhtml).contains("Accountancy")) 
							
						{
							element.click();
							Thread.sleep(3000);
							break;
						}
					}
			/*		WebElement orgDoForm = driver.findElement(By.xpath("//div[@class='xui-autocompleter--trigger-focus']"));
					act.moveToElement(orgDoForm).build().perform();
					orgDoForm.click(); */
					
			/*		 Thread.sleep(2000);
					WebElement organizationDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
					act.moveToElement(organizationDo).build().perform();
					organizationDo.sendKeys("Accounting Practice");
					*/
					 Thread.sleep(6000);
					 
					WebElement buyNow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[2]"));
					act.moveToElement(buyNow).build().perform();
					buyNow.click();
					
 }
 
 public void TC08C() throws InterruptedException {
	 
	 WebDriver driver;
	 
	 System.setProperty("webdriver.chrome.driver", "/Users/Saroja/Documents/Seleniumtraining/chromedriver");
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.xero.com/us/");
	 
	 
	 Thread.sleep(2000);
	 WebElement userLogin = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
	 Actions act = new Actions(driver);
	 act.moveToElement(userLogin).build().perform();
	 userLogin.click();
	 
	 WebElement userName = driver.findElement(By.id("email"));
	 userName.sendKeys("gopala.anumanchipalli@gmail.com");
	 
	 Thread.sleep(2000);
	
	 WebElement passWord= driver.findElement(By.id("password"));
	 passWord.sendKeys("password12");
	 
	 WebElement Login= driver.findElement(By.id("submitButton"));
	 Login.click();
	 Thread.sleep(5000);

	 WebElement myXero = driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
	 act.moveToElement(myXero).build().perform();
	 myXero.click();
	 Thread.sleep(2000);
	
	 WebElement changeOrg = driver.findElement(By.xpath("//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
	 act.moveToElement(changeOrg).build().perform();
	 changeOrg.click();
	 Thread.sleep(2000);
	 
	 WebElement addOrg = driver.findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
	 act.moveToElement(addOrg).build().perform();
	 addOrg.click();
	 Thread.sleep(2000);
	 
	 WebElement orgLabel = driver.findElement(By.xpath("//label[contains(text(),'What is the name of your organization?')]"));
	 act.moveToElement(orgLabel).build().perform();
	 orgLabel.click();

	 Thread.sleep(2000);
	 
	 WebElement orgName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
	 
	 orgName.sendKeys("Self");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 WebElement countryLabel = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
	 act.moveToElement(countryLabel).build().perform();
	 countryLabel.click(); 

	 List<WebElement> countrydd=driver.findElements(By.xpath("//div[@class='xui-autocompleter--trigger-focus']//div//div//div[@class='xui-iconwrapper xui-iconwrapper-medium']"));
	 for(int i=0;i<countrydd.size();i++) 
	 {
		 WebElement element = countrydd.get(i);
		 String innerhtml = element.getAttribute("innerHTML");
		 if((innerhtml).contentEquals("United States"))
		 {
			element.click();
			break;
		 }
	 }
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 WebElement timeZone = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
	 act.moveToElement(timeZone).build().perform();
	 timeZone.click();
	 
	 List<WebElement> timeZonedd = driver.findElements(By.xpath("//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li/button"));
	 
	for (WebElement element : timeZonedd) 
	{
		String innerhtml = element.getAttribute("innerHTML");
	//	System.out.println("Time zone is : " + innerhtml + element.getText());
		if ((innerhtml).contains("(UTC-08:00) Pacific Time (US &amp; Canada)") )
		{
		//	System.out.println("Inside IF Time zone is : " + innerhtml + element.getText());
			element.click();
			break;
		}
	}
	
	Thread.sleep(3000);
	WebElement organizationDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
	act.moveToElement(organizationDo).build().perform();
	organizationDo.sendKeys("Accountancy");
	
	
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	List<WebElement> orgDd = driver.findElements(By.xpath("//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li//button//span//span/strong"));
	for (WebElement element : orgDd) 
	{
		String innerhtml = element.getAttribute("innerHTML");
	//	System.out.println("Time zone is : " + innerhtml + element.getText());
		if((innerhtml).contains("Accountancy")) 
			
		{
			element.click();
			Thread.sleep(3000);
			break;
		}
	}
	 Thread.sleep(6000);
	 
	 
		WebElement buyNow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[2]"));
		act.moveToElement(buyNow).build().perform();
		buyNow.click();
		
		Thread.sleep(5000);
		for (String child : driver.getWindowHandles())
		{
			driver.switchTo().window(child);
			System.out.println("Window Handle is "+ child);
		}
		Thread.sleep(3000);
			
		WebElement earlyPlan = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[1]/label[1]/div[1]"));
		act.moveToElement(earlyPlan).build().perform();
		earlyPlan.click();
		
		WebElement  selectBillingAccount = driver.findElement(By.xpath("//span[contains(text(),'Continue to Select Billing Account')]"));
		act.moveToElement(selectBillingAccount).build().perform();
		selectBillingAccount.click();
		
	
		for (String child : driver.getWindowHandles())
		{
			driver.switchTo().window(child);
			System.out.println("Window Handle is "+ child);
		}
		
		WebElement streetAddress = driver.findElement(By.xpath("//input[@id='contactAddress']"));
		act.moveToElement(streetAddress).build().perform();
		streetAddress.sendKeys("3450 Granada ave");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='contactCity']"));
		act.moveToElement(city).build().perform();
	    city.sendKeys("Santa Clara");
		
	    WebElement state = driver.findElement(By.xpath("//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']"));
		act.moveToElement(state).build().perform();
	    state.click();
		
		List<WebElement> statedd = driver.findElements(By.xpath("//ul[@role='group']//li/button/span"));
		
		for(WebElement element1 : statedd)
		{
			String innerhtml1 = element1.getAttribute("innerHTML");
			
			if((innerhtml1).contains("California")) 
				
			{
				element1.click();
				Thread.sleep(3000);
				break;
			}
		}
		
		WebElement zipCode = driver.findElement(By.xpath("//input[@id='contactPostalCode']"));
		act.moveToElement(zipCode).build().perform();
	    zipCode.sendKeys("95051");
	    
	  
	    WebElement ContReviewPay = driver.findElement(By.xpath("//button[@class='xui-button xui-actions--primary xui-button-main']"));
	    act.moveToElement(ContReviewPay).build().perform();
	    ContReviewPay.click();
  
	
	for (String child : driver.getWindowHandles())
	{
		driver.switchTo().window(child);
		System.out.println("Window Handle is "+ child);
	}
	Thread.sleep(3000);
		
	
//	WebElement paymentDetails = driver.findElement(By.xpath("//span[contains(text(),'Payment Details')]"));
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", paymentDetails);
//	Thread.sleep(3000);
	
	
	WebElement creditCard = driver.findElement(By.xpath("//span[contains(text(),'Credit Card')]"));
	act.moveToElement(creditCard).build().perform();
	WebDriverWait wait = new WebDriverWait(driver, 7);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Credit Card')]")));
	creditCard.click();
	Thread.sleep(3000);
	
	WebElement cardNumber = driver.findElement(By.xpath("//span[contains(text(),'Card number')]"));
	act.moveToElement(cardNumber).build().perform();
	cardNumber.click();
	Thread.sleep(3000);
    
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Secure payment input frame']")));
	System.out.println("I am inside a frame");
	//wait = new WebDriverWait(driver, 7);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/iframe[1]")));
	
	//((JavascriptExecutor) driver).executeScript("document.getElementByClass('InputContainer').style.display='block';");
	WebElement creditCardNo = driver.findElement(By.id("stripe-card-number")); //   className("InputElement is-empty Input Input--empty"));
	
	creditCardNo.sendKeys("1238665890655456");
	
	

/*	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame8']")));
	WebElement expiryDate = driver.findElement(By.xpath("//input[contains(text(),Credit or debit card expiration date"));
	act.moveToElement(expiryDate).build().perform();
	expiryDate.sendKeys("07/19");
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame9']")));
	WebElement cvv = driver.findElement(By.xpath("//input[@contains(text,'Credit or debit card CVC/CVV)']"));
	act.moveToElement(cvv).build().perform();
	cvv.sendKeys("555");
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//input[@id='stripe-cardholder-name']")));
	WebElement cardHoldername = driver.findElement(By.xpath("//input[@contains(text,'Credit or debit card CVC/CVV)']"));
	act.moveToElement(cardHoldername).build().perform();
	cardHoldername.sendKeys("Gopala Anumanchipalli");
	driver.switchTo().defaultContent();
	
	WebElement confirmPurchase = driver.findElement(By.xpath("//span[contains(text(),'Confirm Purchase')]"));
	act.moveToElement(confirmPurchase ).build().perform();
	confirmPurchase.click();  */
 }	
 //span[contains(text(),'Confirm Purchase')] //iframe[@name='__privateStripeMetricsController0']
		public static void main(String[] args) throws InterruptedException{
		
		 XeroTestCaseAutomation xa = new XeroTestCaseAutomation();
			//	xa.TC01A();
			//	xa.TC01B();
			//	xa.TC01C(); 
			//	xa.TC01D()
		 	//	xa.TC02A();
		    //  xa.TC02B();
		 	// xa.TC02C();
		 	//	xa.TC02D();
		 	//	xa.TC02E();
		 	//  xa.TC03A();
		 	//	xa.TC04A();
		 	//	xa.TC06A();
		 	//  xa.TC08A();
      // xa.TC08B();
		 	xa.TC08C();
		}

}
