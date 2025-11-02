package ocp;

public class Main {
    public static void main(String[] args) {
        PembayaranCustomer pembayaran = new PembayaranCustomer();
        Cash cash = new Cash();
        Debit debit = new Debit();
        Kredit kredit = new Kredit();

        pembayaran.menerimaPembayaran(cash);
        pembayaran.menerimaPembayaran(debit);
        pembayaran.menerimaPembayaran(kredit);

    }
}
