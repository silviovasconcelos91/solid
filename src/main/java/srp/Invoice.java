package srp;

public class Invoice {
    private final String customer;

    private final double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public double calculateTotal() {
        double tax = amount * 0.2; // TVA à 20%
        return amount + tax;
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database...");
    }

    // Génère un PDF de la facture
    public void generatePDF() {
        System.out.println("Generating PDF for invoice:");
        System.out.println("Customer: " + getCustomer());
        System.out.println("Amount: " + getAmount());
        System.out.println("Total (with tax): " + calculateTotal());
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

}