package my.autotests.addressbook.tests;

import my.autotests.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

   @Test
   public void testContactModification () {

      app.getContactHelper().returnToHomePage();
      app.getContactHelper().selectContact();
      app.getContactHelper().initContactModification();
      app.getContactHelper().fillContactForm(new ContactData("John", "Silver", "Tortuga, Pirate str., 10", "4578990346", "john.silver@test.com"));
      app.getContactHelper().submitContactModification();
      app.getContactHelper().returnToHomePage();
   }
}
