package isp;

public class PrinterEntryLevel implements Printer {
    @Override
    public void print() {
        System.out.println("Printing basic document");
    }
}