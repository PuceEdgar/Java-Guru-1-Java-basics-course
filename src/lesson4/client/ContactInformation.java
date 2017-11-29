package lesson4.client;

public class ContactInformation {

    private String country;
    private String city;
    private String address;
    private String phoneNumber;
    private String email;

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Country: "  + country + "\n"
                + "City: " + city + "\n"
                + "Address: " + address + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Email: " + email + "\n";
    }
}
