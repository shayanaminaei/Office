package Person.Employee;

public class Office extends Employee {
    private String department;

    public Office(String name, String lastName, String nationalId, String address, String department) {
        super(name, lastName, nationalId, address);
        this.department = department;
    }

    public Office() {
        super();
    }

    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return department; }

    @Override
    public void save() {
        super.save();
        System.out.print("Enter department: ");
        setDepartment(scan.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Department: " + department);
    }
}

