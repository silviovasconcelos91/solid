package srp;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Alice Dupont", 100.0);

        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.printPDF(invoice);
    }
}
