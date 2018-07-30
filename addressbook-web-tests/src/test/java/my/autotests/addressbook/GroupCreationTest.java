package my.autotests.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test1", "Test1test1", "Test1"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
