package lesson4.client;

public class Client {

    private String firstName;
    private String secondName;
    private String personalCode;
    private ContactInformation contactInformation;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String toString() {
        return "First Name: " + firstName + "\n"
                + "Second Name: " + secondName + "\n"
                + "Personal Code: " + personalCode + "\n"
                + "Contact Information: " + contactInformation + "\n";
    }
}
