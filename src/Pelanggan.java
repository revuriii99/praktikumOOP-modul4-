public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private double saldo;
    private int pin;
    private int jumlahSalahPin;

    Pelanggan(String nama, String nomorPelanggan, double saldo, int pin, int jumlahSalahPin) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.saldo = saldo;
        this.pin = pin;
        this.jumlahSalahPin = jumlahSalahPin;
    }

    public String getNama(){return nama;}
    public String getNomorPelanggan(){return nomorPelanggan;}
    public double getSaldo(){return saldo;}
    public int getPin(){return pin;}
    public int getJumlahSalahPin(){return jumlahSalahPin;}

    public void setNama(String nama){this.nama = nama;}
    public void setPin(int pin){this.pin = pin;}

}
