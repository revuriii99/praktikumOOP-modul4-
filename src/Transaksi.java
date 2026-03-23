public class Transaksi {
    String namaPelanggan;
    String jenisTransaksi;
    double jumlah;
    double cashback;
    double saldoSebelum;
    double saldoSesudah;

    Transaksi(String namaPelanggan, String jenisTransaksi, double jumlah, double cashback, double saldoSebelum, double saldoSesudah) {
        this.namaPelanggan  = namaPelanggan;
        this.jenisTransaksi = jenisTransaksi;
        this.jumlah         = jumlah;
        this.cashback       = cashback;
        this.saldoSebelum   = saldoSebelum;
        this.saldoSesudah   = saldoSesudah;
    }

    void tampilStruk() {
        System.out.println("===== STRUK TRANSAKSI =====");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Jenis          : " + jenisTransaksi);
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Cashback       : " + cashback);
        System.out.println("Saldo Sebelum  : " + saldoSebelum);
        System.out.println("Saldo Sesudah  : " + saldoSesudah);
        System.out.println("===========================");
    }
}