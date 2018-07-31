package my.autotests.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseContact {
   FirefoxDriver wd;

   public static boolean isAlertPresent(FirefoxDriver wd) {
       try {
           wd.switchTo().alert();
           return true;
       } catch (NoAlertPresentException e) {
           return false;
       }
   }

   @BeforeMethod
   public void setUp() throws Exception {
       wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
       wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       wd.get("http://localhost/addressbook/");
       login("secret", "admin");
   }

   private void login(String password, String username) {
       wd.findElement(By.name("pass")).click();
       wd.findElement(By.name("pass")).clear();
       wd.findElement(By.name("pass")).sendKeys(password);
       wd.findElement(By.name("user")).click();
       wd.findElement(By.name("user")).clear();
       wd.findElement(By.name("user")).sendKeys(username);
       wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
   }

   protected void returnToHomePage() {
       wd.findElement(By.linkText("home")).click();
   }

   protected void submitGroupCreation() {
       wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
   }

   protected void fillGroupForm(ContactData contactData) {
       wd.findElement(By.name("firstname")).click();
       wd.findElement(By.name("firstname")).clear();
       wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
       wd.findElement(By.name("lastname")).click();
       wd.findElement(By.name("lastname")).clear();
       wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
       wd.findElement(By.name("address")).click();
       wd.findElement(By.name("address")).clear();
       wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
       wd.findElement(By.name("home")).click();
       wd.findElement(By.name("home")).clear();
       wd.findElement(By.name("home")).sendKeys(contactData.getHomePhone());
       wd.findElement(By.name("email")).click();
       wd.findElement(By.name("email")).clear();
       wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
   }

   protected void gotoAddNewContactPage() {
       wd.findElement(By.linkText("add new")).click();
   }

   @AfterMethod
   public void tearDown() {
       wd.quit();
   }
}
