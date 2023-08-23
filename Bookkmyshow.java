import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bookkmyshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

        // Open the BookMyShow website
        driver.get("https://in.bookmyshow.com/explore/home/");

        // Find the city input and enter "Bengaluru"
        WebElement cityInput = driver.findElement(By.id("inp_RegionSearch_top"));
        cityInput.sendKeys("Bengaluru");

        // Wait for the city dropdown to appear
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Bengaluru')]")));

        // Find and click on the "Sign In" button
        WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signInButton.click();

        // Find and click on "Continue with Email"
        WebElement continueWithEmailButton = driver.findElement(By.xpath("//button[contains(text(),'Continue with Email')]"));
        continueWithEmailButton.click();

        // Enter the email and click on "Continue"
        WebElement emailInput = driver.findElement(By.id("wlspispEmail"));
        emailInput.sendKeys("selauto@yopmail.com");
        
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();

        // Open yopmail.com
        driver.get("http://www.yopmail.com/en/");
        
        // Enter the email address in yopmail inbox and click "Check Inbox"
        WebElement yopmailInput = driver.findElement(By.id("login"));
        yopmailInput.sendKeys("selauto@yopmail.com");
        
        WebElement checkInboxButton = driver.findElement(By.cssSelector("input.sbut"));
        checkInboxButton.click();

        // Wait for the email to load and click on it
        WebElement emailFromBookMyShow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("BookMyShow")));
        emailFromBookMyShow.click();

        // Fetch OTP from the email
        WebElement otpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.h2")));
        String otp = otpElement.getText();

        // Go back to the BookMyShow Sign In page
        driver.get("https://in.bookmyshow.com/explore/home/");
        
        // Find and click on the "Sign In" button again
        signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signInButton.click();

        // Enter the fetched OTP
        WebElement otpInput = driver.findElement(By.id("otp")));
        otpInput.sendKeys(otp);
        
        // Click on "Verify & Proceed" button
        WebElement verifyButton = driver.findElement(By.xpath("//button[contains(text(),'Verify & Proceed')]"));
        verifyButton.click();

        // Wait for the "Hi, Guest" message to appear
        WebElement hiGuestMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Hi, Guest')]")));

        // Print success message
        System.out.println("User successfully signed in: " + hiGuestMessage.getText());

        // Close the browser
        driver.quit();
    }



	}


