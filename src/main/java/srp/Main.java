package srp;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Alice Dupont", 100.0);
        invoice.saveToDatabase();
        invoice.print();
    }
}
