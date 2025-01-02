package InvoiceHardware;

public class InvoiceTest {
    public static void main(String[] args) {
        // Create an instance(object)
        Invoice Invoice = new Invoice("1.3", "Capacitor", 5, 100.00);
        // Display amount
        Invoice.getInvoiceAmount(5, 200.00);
    }
}
