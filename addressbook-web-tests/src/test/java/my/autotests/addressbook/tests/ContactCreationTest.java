package my.autotests.addressbook.tests;

import my.autotests.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("John", null, null, null, null));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}