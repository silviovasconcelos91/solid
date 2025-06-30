package srp;

public class InvoicePrinter {
    public void printPDF(Invoice invoice) {
        System.out.println("Generating PDF for invoice:");
        System.out.println("Customer: " + invoice.getCustomer());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Total (with tax): " + invoice.calculateTotal());
    }
}