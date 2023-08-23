import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Bookmyshow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/");
		Thread.sleep(2000);
		
		WebElement Cityinput =driver.findElement(By.xpath("//input[@type='text']"));
		Cityinput.sendKeys("Bengaluru");
		Thread.sleep(200);
		
		WebElement SelectCity= driver.findElement(By.xpath("//body[@style='width: 100%; height: 100%; position: fixed;']/div[@id='modal-root']/div[@class='bwc__sc-1ihur1g-4 jxHGrI in-animation']/div[@class='bwc__sc-1ihur1g-5 gznHHe in-animation']/div[@class='bwc__sc-m1rlyj-3 bwc__sc-ttnkwg-27 kwGtup']/div[@class='bwc__sc-ttnkwg-4 Ettpg']/ul[@class='bwc__sc-ttnkwg-15 gZrltM']/li[3]/div[1]/div[1]/img[1]"));
		SelectCity.click();
		Thread.sleep(200);
		
		WebElement signInButton = driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']"));
		signInButton.click();
		Thread.sleep(200);
	
		WebElement continueWithEmailButton = driver.findElement(By.xpath("//div[contains(text(),'Continue with Email')]"));
        continueWithEmailButton.click();
        Thread.sleep(200);
        
        driver.get("http://www.yopmail.com/en/");
        
        WebElement yopmailInput = driver.findElement(By.id("login"));
        yopmailInput.sendKeys("selauto@yopmail.com");
        
        WebElement checkInboxButton = driver.findElement(By.xpath("//input[@id='login']"));
        checkInboxButton.click();
        
        driver.get("https://in.bookmyshow.com/explore/home/");
        
        signInButton = driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']"));
        signInButton.click();
        
        WebElement Email = driver.findElement(By.xpath("//div[contains(text(),'Continue with Email')]"));
        Email.click();
        
        WebElement inputemail = driver.findElement(By.id("emailId"));
        inputemail.sendKeys("selauto@yopmail.com");
        
        
        WebElement Click = driver.findElement(By.xpath("//input[@id='emailId']"));
        Click.click();
        
        WebElement otpInput = driver.findElement(By.xpath("//body[@style='width: 100%; height: 100%; position: fixed;']/div[@id='modal-root']/div[@class='bwc__sc-1ihur1g-4 jxHGrI in-animation']/div[@class='bwc__sc-1ihur1g-5 otNAQ in-animation']/div/div[@class='bwc__sc-dh558f-0 jIYGuk']/div[@class='bwc__sc-dh558f-6 jjUsWP']/form[@class='bwc__sc-dh558f-38 hmgVIc']/div[@class='bwc__sc-m1rlyj-6 bwc__sc-dh558f-19 dCikYM']/div[@class='bwc__sc-m1rlyj-3 bwc__sc-rwpctr-0 eYLSMR']/input[1]"));
        otpInput.sendKeys(500876);
        
        WebElement verifyButton = driver.findElement(By.xpath("//div[@class='bwc__sc-dh558f-1 kQRABK']"));
        verifyButton.click();
        
        System.out.println("User successfully signed in");
        System.out.println("Hi Guest");
        

		driver.close();
		driver.quit();
		
		
		
		

	}

}
