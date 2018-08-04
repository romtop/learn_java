package my.autotests.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

   @Test
   public void testContactDeletion() {
      returnToHomePage();
      selectContact();
      deleteSelectedContacts();
      confirmSelectedContactDeletiion();
      returnToHomePage();
   }

}
