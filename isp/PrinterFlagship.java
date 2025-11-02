package isp;

public class PrinterFlagship implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Printing high quality document");
    }
    
    @Override
    public void scan() {
        System.out.println("Scanning document with OCR");
    }
    
    @Override
    public void sendFax() {
        System.out.println("Sending fax digitally");
    }
}