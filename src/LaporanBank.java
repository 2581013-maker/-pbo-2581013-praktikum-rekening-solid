public class LaporanBank {

    public static void cetakDaftar(String judul, Rekening[] daftar) {
        System.out.println("=== " + judul + " ===");
        for (Rekening r : daftar) {
            System.out.printf("%-6s %-6s Rp%,d  (%s)%n",
                    r.getNoRek(), r.getPemilik(), r.getSaldo(), r.keterangan());
        }
    }

    public static void cetakTotal(Rekening[] daftar) {
        int total = 0;
        for (Rekening r : daftar) total += r.getSaldo();
        System.out.printf("Total saldo semua rekening: Rp%,d%n", total);
    }
}
