package AddressBookPackage.ApplicationPackage;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuddyInfoTest {
    private BuddyInfo buddyInfo;
    @Test
    void getName() {
        assertEquals(buddyInfo.getName(), "Lynn");
    }

    @Test
    void setName() {
        buddyInfo.setName("Lynn");
        assertEquals(buddyInfo.getName(), "Lynn");
    }

    @Test
    void getPhoneNumber() {
        assertEquals(buddyInfo.getPhoneNumber(), "5143462268");
    }

    @Test
    void setPhoneNumber() {
        buddyInfo.setPhoneNumber("5143462268");
        assertEquals(buddyInfo.getPhoneNumber(), "5143462268");
    }
    @Before("buddyInfo")
    public void setUp() throws Exception {
        this.buddyInfo = new BuddyInfo("Lynn", "5143462268");
    }
}