public class Sampan extends TransportasiAir {
    protected Integer layar;

    public Sampan(Integer jumlahKursi, Integer biaya, Integer layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " +jumlahKursi +" ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan " +layar +" layar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai menggunakan " +jangkar +" jangkar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai tanpa jangkar");
    }
}
