package AddressBookPackage.ApplicationPackage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue
    private Long Id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = BuddyInfo.class)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public List<BuddyInfo> getBuddies(){
        return buddies;
    }
    public void addBuddy(BuddyInfo buddyInfo) {
        this.buddies.add(buddyInfo);
        buddyInfo.setAddressBook(this);
    }

    public BuddyInfo getBuddy(int i) {
        return this.buddies.get(i);
    }

    public void removeBuddy(int i) {
        BuddyInfo b = this.buddies.remove(i);
        b.setAddressBook(null);
    }

    @Override
    public String toString() {
        return "buddies=" + buddies ;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
