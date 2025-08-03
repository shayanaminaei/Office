package Person.Employee;


public class Finance extends Employee {
    private String accountNumber;

    public Finance(String name, String lastName, String nationalId, String address, String accountNumber) {
        super(name, lastName, nationalId, address);
        this.accountNumber = accountNumber;
    }

    public Finance() {
        super();
    }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountNumber() { return accountNumber; }

    @Override
    public void save() {
        super.save();
        System.out.print("Enter account number: ");
        setAccountNumber(scan.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Number: " + accountNumber);
    }
}
