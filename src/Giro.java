public class Giro extends Rekening {
    public Giro(String noRek, String pemilik, int saldo) {
        super(noRek, pemilik, saldo);
    }
    @Override public int biayaAdminBulanan() { return 10000; }
    @Override public String keterangan()     { return "Giro, biaya admin Rp10.000 per bulan"; }
}
