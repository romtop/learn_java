package my.autotests.addressbook.tests;

import my.autotests.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test1", "Test1test1", "Test1"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
