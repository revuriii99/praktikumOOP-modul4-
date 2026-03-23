public class Main {
    public static void main(String[] args){
        Pelanggan p1 = new Pelanggan("Vincent","3812345678",500000,180898,2);
        Pelanggan p2 = new Pelanggan("Ceyline", "5612345678",1200000,280898,1);
        Pelanggan p3 = new Pelanggan("Goldie","7412345678",1500000,380898,0);

        System.out.println(p1.getNama());
        System.out.println(p1.cekJenisPelanggan());
        p1.topUp(180898,500000);
        p1.cekPin(239023);
        p1.beli(180898,400000);

        System.out.println(p2.getNama());
        System.out.println(p2.cekJenisPelanggan());
        p2.topUp(280898,1200000);
        p2.beli(280898,1000000);

        System.out.println(p3.getNama());
        System.out.println(p3.cekJenisPelanggan());
        p3.topUp(380898,1500000);
        p3.beli(380898,1200000);
    }
}
