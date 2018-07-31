package my.autotests.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBaseContact{

    @Test
    public void testContactCreation() {
        gotoAddNewContactPage();
        fillGroupForm(new ContactData("John", "Silver", "Tortuga, Pirate str., 10", "4578990346", "john.silver@test.com"));
        submitGroupCreation();
        returnToHomePage();
    }

}
