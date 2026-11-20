public class BankSolid {
    public static void main(String[] args) {
        Tabungan ani   = new Tabungan("101", "Ani", 2000000);
        Giro budi      = new Giro("201", "Budi", 3000000);
        Tabungan citra = new Tabungan("102", "Citra", 1500000);

        Rekening[] semua    = { ani, budi, citra };
        BerBunga[] berbunga = { ani, citra };

        LaporanBank.cetakDaftar("Sebelum akhir bulan", semua);
        System.out.println();
        ProsesAkhirBulan.potongBiayaAdmin(semua);
        ProsesAkhirBulan.tambahBunga(berbunga);
        System.out.println();
        LaporanBank.cetakDaftar("Setelah akhir bulan", semua);
        LaporanBank.cetakTotal(semua);
    }
}
