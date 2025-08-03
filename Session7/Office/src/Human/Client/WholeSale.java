package Human.Client;

public class Wholesale extends Client {
    private String companyName;

    public Wholesale(String name, String lastName, String nationalId, String address, String phoneNumber, String companyName) {
        super(name, lastName, nationalId, address, phoneNumber);
        this.companyName = companyName;
    }

    public Wholesale() {
        super();
    }

    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCompanyName() { return companyName; }

    @Override
    public void save() {
        super.save();
        System.out.print("Enter company name: ");
        setCompanyName(scan.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Company Name: " + companyName);
    }
}
