public class ProsesAkhirBulan {

    public static void potongBiayaAdmin(Rekening[] daftar) {
        for (Rekening r : daftar) {
            int biaya = r.biayaAdminBulanan();
            r.kurangiSaldo(biaya);
            System.out.println("Admin     " + r.getPemilik() + " : -" + biaya);
        }
    }

    public static void tambahBunga(BerBunga[] daftar) {
        for (BerBunga b : daftar) {
            int bunga = b.hitungBunga();
            b.tambahBunga();
            System.out.println("Bunga     " + b.getPemilik() + " : +" + bunga);
        }
    }
}
