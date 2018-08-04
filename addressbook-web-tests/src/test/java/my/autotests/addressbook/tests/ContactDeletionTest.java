package my.autotests.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

   @Test
   public void testContactDeletion() {
      app.returnToHomePage();
      app.selectContact();
      app.deleteSelectedContacts();
      app.confirmSelectedContactDeletiion();
      app.returnToHomePage();
   }

}
