package isp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRINTER FLAGSHIP ===");
        PrinterFlagship flagship = new PrinterFlagship();
        flagship.print();
        flagship.scan();
        flagship.sendFax();
        
        System.out.println("\n=== PRINTER ENTRY LEVEL ===");
        PrinterEntryLevel entry = new PrinterEntryLevel();
        entry.print();

    }
}