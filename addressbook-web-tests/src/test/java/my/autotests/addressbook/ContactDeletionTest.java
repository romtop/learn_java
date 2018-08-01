package my.autotests.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBaseContact{

   @Test
   public void testContactDeletion() {
      returnToHomePage();
      selectContact();
      deleteSelectedContact();
      closeConfirmDeletionDialogWindow();
      returnToHomePage();
   }

}
