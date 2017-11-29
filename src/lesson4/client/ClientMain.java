package lesson4.client;

public class ClientMain {

    public static void main(String[] args) {

        Client firstClient = new Client();
        ContactInformation firstContactInformation = new ContactInformation();

        firstClient.setFirstName("Dominic");
        firstClient.setSecondName("Boss");
        firstClient.setPersonalCode("1234567");

        firstContactInformation.setCountry("Latvia");
        firstContactInformation.setCity("Riga");
        firstContactInformation.setAddress("123 Street");
        firstContactInformation.setPhoneNumber("987654321");
        firstContactInformation.setEmail("dominic.boss@mail.com");
        firstClient.setContactInformation(firstContactInformation);
        System.out.println(firstClient);
    }
}
