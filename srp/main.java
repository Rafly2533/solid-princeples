package srp;
public class main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(10);
        perhitunganPersegi perhitungan = new perhitunganPersegi();
        int luas = perhitungan.hitungLuas(persegi);
        System.out.println("Luas Persegi: " + luas);
    }
}
