public class Deposito extends Rekening implements BerBunga {
    public Deposito(String noRek, String pemilik, int saldo) {
        super(noRek, pemilik, saldo);
    }

    @Override
    public boolean tarik(int jumlah) {
        throw new UnsupportedOperationException("Deposito tidak bisa ditarik");
    }

    @Override public int biayaAdminBulanan() { return 0; }
    @Override public int hitungBunga()       { return saldo * 40 / 1000; } // 4.0%
    @Override public void tambahBunga()      { saldo += hitungBunga(); }
    @Override public String keterangan()     { return "Deposito, bunga 4.0% per bulan, tidak bisa ditarik"; }
}
