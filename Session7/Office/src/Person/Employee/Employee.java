package Person.Employee;

import Person.person;

public class Employee extends person {
    public Employee(String name, String lastName, String nationalId, String address) {
        super(name, lastName, nationalId, address);
    }

    public Employee() {
        super();
    }

    @Override
    public void save() {
        System.out.println("--- Employee Info ---");
        super.save();
    }

    @Override
    public void showInfo() {
        System.out.println("--- Employee ---");
        super.showInfo();
    }
}
