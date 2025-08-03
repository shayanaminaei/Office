package Human;

import java.util.Scanner;

public class Human {
    protected String name;
    protected String lastName;
    protected String nationalId;
    protected String address;

    protected Scanner scan = new Scanner(System.in);

    public Human(String name, String lastName, String nationalId, String address) {
        this.name = name;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.address = address;
    }

    public Human() {}

    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }
    public void setAddress(String address) { this.address = address; }

    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public String getNationalId() { return nationalId; }
    public String getAddress() { return address; }

    public void save() {
        System.out.print("Enter first name: ");
        setName(scan.nextLine());

        System.out.print("Enter last name: ");
        setLastName(scan.nextLine());

        System.out.print("Enter national ID: ");
        setNationalId(scan.nextLine());

        System.out.print("Enter address: ");
        setAddress(scan.nextLine());
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("National ID: " + nationalId);
        System.out.println("Address: " + address);
    }
}
