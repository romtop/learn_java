package my.autotests.addressbook.appmanager;

import my.autotests.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
   FirefoxDriver wd;

   public ContactHelper(FirefoxDriver wd) {
      this.wd = wd;
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
}
