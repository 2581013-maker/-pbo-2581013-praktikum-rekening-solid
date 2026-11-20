public class Tabungan extends Rekening implements BerBunga {
    public Tabungan(String noRek, String pemilik, int saldo) {
        super(noRek, pemilik, saldo);
    }
    @Override public int biayaAdminBulanan() { return 5000; }
    @Override public int hitungBunga()       { return saldo * 25 / 1000; } // 2.5%
    @Override public void tambahBunga()      { saldo += hitungBunga(); }
    @Override public String keterangan()     { return "Tabungan, bunga 2.5% per bulan"; }
}
