package my.autotests.addressbook.appmanager;

import my.autotests.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

   public ContactHelper(FirefoxDriver wd) {
      super(wd);
   }

   public void returnToHomePage() {
      click(By.linkText("home"));
   }

   public void submitContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
   }

   public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"), contactData.getFirstName());
      type(By.name("lastname"), contactData.getLastName());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getPhoneHome());
      type(By.name("email"), contactData.getEmail());
   }

    public void initContactCreation() {
      click(By.linkText("add new"));
   }

   public void confirmSelectedContactDeletiion() {
      wd.switchTo().alert().accept();
   }

   public void deleteSelectedContacts() {
      click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
   }

   public void selectContact() {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
         click(By.name("selected[]"));
      }
   }

   public void initContactModification() {
      click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
   }

   public void submitContactModification() {
      click(By.name("update"));
   }
}
