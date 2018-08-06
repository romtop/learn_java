package my.autotests.addressbook.tests;

import my.autotests.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase{

   @Test
   public void testGroupModification () {

      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().initGroupModification();
      app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
      app.getGroupHelper().submitGroupModification();
      app.getGroupHelper().returnToGroupPage();
   }
}
