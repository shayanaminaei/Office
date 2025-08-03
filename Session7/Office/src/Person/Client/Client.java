package Person.Client;

import Person.person;

public class Client extends person {
    private String phoneNumber;

    public Client(String name, String lastName, String nationalId, String address, String phoneNumber) {
        super(name, lastName, nationalId, address);
        this.phoneNumber = phoneNumber;
    }

    public Client() {
        super();
    }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public void save() {
        super.save();
        System.out.print("Enter phone number: ");
        setPhoneNumber(scan.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Phone Number: " + phoneNumber);
    }
}

