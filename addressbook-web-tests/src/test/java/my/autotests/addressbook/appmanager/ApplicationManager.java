package my.autotests.addressbook.appmanager;

import my.autotests.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
   FirefoxDriver wd;

   private SessionHelper sessionHelper;
   private NavigationHelper navigationHelper;
   private GroupHelper groupHelper;

   public static boolean isAlertPresent(FirefoxDriver wd) {
       try {
           wd.switchTo().alert();
           return true;
       } catch (NoAlertPresentException e) {
           return false;
       }
   }

   public void init() {
      wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("http://localhost/addressbook/");
      groupHelper = new GroupHelper(wd);
      navigationHelper = new NavigationHelper(wd);
      sessionHelper = new SessionHelper(wd);
      sessionHelper.login("admin", "secret");
   }

   public void stop() {
      wd.quit();
   }

   public void returnToHomePage() {
       wd.findElement(By.linkText("home")).click();
   }

   public void submitContactCreation() {
       wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
   }

   public void fillContactForm(ContactData contactData) {
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
       wd.findElement(By.name("home")).sendKeys(contactData.getPhoneHome());
       wd.findElement(By.name("email")).click();
       wd.findElement(By.name("email")).clear();
       wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
   }

   public void initContactCreation() {
       wd.findElement(By.linkText("add new")).click();
   }

   public void confirmSelectedContactDeletiion() {
      wd.switchTo().alert().accept();
   }

   public void deleteSelectedContacts() {
      wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
   }

   public void selectContact() {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
         wd.findElement(By.name("selected[]")).click();
      }
   }

   public GroupHelper getGroupHelper() {
      return groupHelper;
   }

   public NavigationHelper getNavigationHelper() {
      return navigationHelper;
   }
}