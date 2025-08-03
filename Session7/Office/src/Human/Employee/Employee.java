package Human.Employee;

import Human.Human;

public class Employee extends Human {
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
