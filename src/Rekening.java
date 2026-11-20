public abstract class Rekening {
    protected String noRek;
    protected String pemilik;
    protected int saldo;

    public Rekening(String noRek, String pemilik, int saldo) {
        this.noRek = noRek;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNoRek()   { return noRek; }
    public String getPemilik() { return pemilik; }
    public int getSaldo()      { return saldo; }

    public void setor(int jumlah)        { saldo += jumlah; }
    public void kurangiSaldo(int jumlah) { saldo -= jumlah; }

    // tarik: true kalau berhasil, false kalau gagal; tidak pernah melempar exception
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    public abstract int biayaAdminBulanan();
    public abstract String keterangan();   // mis. "Tabungan, bunga 2.5% per bulan"
}