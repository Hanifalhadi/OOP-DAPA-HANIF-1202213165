public class TransportasiAir {
    protected Integer jumlahKursi;
    protected Integer biaya;

    public TransportasiAir(Integer jumlahKursi,Integer biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan jumlah kursi " +jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " +biaya );
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar.");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlabuh di pantai.");
    }
    
}
