package Person.Employee;

public class FinanceAndCashier extends Finance {
    private String cashRegisterId;

    public FinanceAndCashier(String name, String lastName, String nationalId, String address, String accountNumber, String cashRegisterId) {
        super(name, lastName, nationalId, address, accountNumber);
        this.cashRegisterId = cashRegisterId;
    }

    public FinanceAndCashier() {
        super();
    }

    public void setCashRegisterId(String cashRegisterId) { this.cashRegisterId = cashRegisterId; }
    public String getCashRegisterId() { return cashRegisterId; }

    @Override
    public void save() {
        super.save();
        System.out.print("Enter cash register ID: ");
        setCashRegisterId(scan.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cash Register ID: " + cashRegisterId);
    }
}
