package my.autotests.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

   @Test
   public void testContactDeletion() {
      app.getContactHelper().returnToHomePage();
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteSelectedContacts();
      app.getContactHelper().confirmSelectedContactDeletiion();
      app.getContactHelper().returnToHomePage();
   }

}
