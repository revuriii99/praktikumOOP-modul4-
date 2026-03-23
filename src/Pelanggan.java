public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private double saldo;
    private int pin;
    private int jumlahSalahPin;
    private boolean isBlokir;

    Pelanggan(String nama, String nomorPelanggan, double saldo, int pin, int jumlahSalahPin) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.saldo = saldo;
        this.pin = pin;
        this.jumlahSalahPin = jumlahSalahPin;
        this.isBlokir = false;
    }

    public String getNama(){return nama;}
    public String getNomorPelanggan(){return nomorPelanggan;}
    public double getSaldo(){return saldo;}
    public int getPin(){return pin;}
    public int getJumlahSalahPin(){return jumlahSalahPin;}
    public boolean isBlokir(){return isBlokir;}

    public void setNama(String nama){this.nama = nama;}
    public void setPin(int pin){this.pin = pin;}

    public String cekJenisPelanggan(){
        if(nomorPelanggan.substring(0,2).equals("38")){
            return "Silver";
    } else if (nomorPelanggan.substring(0,2).equals("56")){
            return "Gold";
        } else if (nomorPelanggan.substring(0,2).equals("74")) {
            return "Platinum";
        } else {
            return "Tidak dikenal";
        }
    }
    public boolean cekPin(int inputPin){
        if (isBlokir){
            System.out.println("Akun diblokir");
            return false;
        } else if (inputPin == pin) {
            System.out.println("Pin Berhasil!");
            jumlahSalahPin = 0;
            return true;
        } else {
            System.out.println("Pin Salah!");
            jumlahSalahPin = jumlahSalahPin + 1;
            if(jumlahSalahPin == 3){
                isBlokir = true;
                return false;
            }
        }
        return false;
    }

    public void topUp(int inputPin, double jumlah){
        if (cekPin(inputPin)){
            saldo = saldo + jumlah;
            System.out.println("Top up berhasil! Saldo sekarang: " + saldo);
        } else{
            System.out.println("Top up gagal!");
        }
    }

    public void beli(int inputPin, double harga) {
        double cashback = 0;
        if(cekPin(inputPin)){
            if(saldo - harga < 10000) {
                System.out.println("Saldo tidak cukup!");
            } else {
                saldo = saldo - harga;
                if(nomorPelanggan.substring(0,2).equals("38")){
                    if(harga > 1000000){
                        cashback = harga * 0.05;
                        saldo = saldo + cashback;
                    }
                } else if (nomorPelanggan.substring(0,2).equals("56")){
                    if(harga > 1000000){
                        cashback =  harga * 0.07;
                        saldo = saldo + cashback;
                    } else {
                        cashback = harga * 0.02;
                        saldo = saldo + cashback;
                    }
                } else if (nomorPelanggan.substring(0,2).equals("74")){
                    if (harga > 1000000){
                        cashback =  harga * 0.1;
                        saldo = saldo + cashback;
                    } else {
                        cashback = harga * 0.05;
                        saldo = saldo + cashback;
                    }
                }
                System.out.println("Pembelian berhasil!");
                System.out.println("Harga       : " + harga);
                System.out.println("Cashback    : " + cashback);
                System.out.println("Saldo akhir : " + saldo);
            }
        } else {
            System.out.println("Pin Salah, transaksi gagal!");
        }
    }
}
