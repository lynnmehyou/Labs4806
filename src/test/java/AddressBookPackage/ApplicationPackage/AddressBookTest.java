package AddressBookPackage.ApplicationPackage;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {
    private AddressBook addressBook;
    @Test
    public void addBuddy() throws Exception{
        addressBook.addBuddy(new BuddyInfo("Lynn", "5143462268"));
        BuddyInfo buddyInfo = addressBook.getBuddy(0);
        assertEquals(buddyInfo.getName(), "Lynn");
        assertEquals(buddyInfo.getPhoneNumber(), "5143462268");
        addressBook.removeBuddy(0);
    }

    @Before("addressBook")
    public void setUp() throws Exception {
        this.addressBook = new AddressBook();
    }
}