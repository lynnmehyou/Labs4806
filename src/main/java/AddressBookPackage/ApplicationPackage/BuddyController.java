package AddressBookPackage.ApplicationPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BuddyController {
    private final BuddyInfoRepository buddyInfoRepository;
    private final AddressBookRepository addressBookRepository;

    @Autowired
    public BuddyController(BuddyInfoRepository buddyInfoRepository, AddressBookRepository addressBookRepository) {
        this.buddyInfoRepository = buddyInfoRepository;
        this.addressBookRepository = addressBookRepository;
    }

    @RequestMapping(value = "/buddy", method = RequestMethod.GET)
    public BuddyInfo getBuddy(@RequestParam("bookId") Long id, @RequestParam("buddyId") Integer buddyId){
        AddressBook addressBook = new AddressBook();
        return addressBook.getBuddy(buddyId-1);
    }

    @RequestMapping(value = "/buddy", method = RequestMethod.POST)
    public BuddyInfo addBuddy(@RequestBody BuddyInfo buddyInfo, @RequestParam("bookId") Long id){
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        buddyInfoRepository.save(buddyInfo);
        addressBookRepository.save(addressBook);
        return buddyInfo;
    }

    @RequestMapping(value = "/buddy", method = RequestMethod.DELETE)
    public BuddyInfo removeBuddy(@RequestParam("bookId") Long id, @RequestParam("buddyId") Integer buddyId){
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddyInfo = addressBook.getBuddy(buddyId - 1);
        addressBook.removeBuddy(buddyId - 1);
        addressBookRepository.save(addressBook);
        buddyInfoRepository.delete(buddyInfo);
        return buddyInfo;
    }
}
