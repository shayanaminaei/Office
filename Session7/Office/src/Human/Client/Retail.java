package Human.Client;

public class Retail extends Client {
    private String loyaltyCardId;

    public Retail(String name, String lastName, String nationalId, String address, String phoneNumber, String loyaltyCardId) {
        super(name, lastName, nationalId, address, phoneNumber);
        this.loyaltyCardId = loyaltyCardId;
    }

    public Retail() {
        super();
    }

    public void setLoyaltyCardId(String loyaltyCardId) { this.loyaltyCardId = loyaltyCardId; }
    public String getLoyaltyCardId() { return loyaltyCardId; }

    @Override
    public void save() {
        super.save();
        System.out.print("Enter loyalty card ID: ");
        setLoyaltyCardId(scan.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Loyalty Card ID: " + loyaltyCardId);
    }
}
