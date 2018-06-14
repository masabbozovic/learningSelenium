
import framework.Helper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class Main {


    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("http://bvtest.school.cubes.rs/login");
       
       //by name
       WebElement emailField = driver.findElement(By.name("email"));
       emailField.sendKeys("qa@cubes.rs");
       
       //by name
       WebElement passwordField = driver.findElement(By.name("password"));
       passwordField.sendKeys("cubesqa");
       
       //by class name
       WebElement loginButton = driver.findElement(By.className("btn-primary"));
       loginButton.click();
       
       System.out.println("Page title is: " + driver.getTitle());
       
     //SIGNATURES
       //Click on Signatures by link text
       WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
       signaturesLink.click();
       
       System.out.println("Page title is: " + driver.getTitle());
       
     //CATEGORIES  
       WebElement categoriesLink = driver.findElement(By.partialLinkText("Categ"));
       categoriesLink.click();
       
       System.out.println("Page title is: " + driver.getTitle());
       
       WebElement addCategoryButton = driver.findElement(By.className("btn"));
       addCategoryButton.click();
       
       WebElement titleField = driver.findElement(By.id("title"));
       titleField.sendKeys(Helper.getRandomText());
       
       WebElement saveButton = driver.findElement(By.id("save-category-button")); 
       saveButton.click();
       
//       driver.findElement(By.id("save")).click();
       
       WebElement navBar = driver.findElement(By.className("navbar-nav"));
       List<WebElement> liTags = navBar.findElements(By.tagName("li"));
       liTags.get(4).click();
       
       
       WebDriverWait wait = new WebDriverWait(driver, 10);
       
       WebElement addPortalButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
       addPortalButton.click();
       
       Thread.sleep(15000);
//       driver.quit();   
        
    }
    
}