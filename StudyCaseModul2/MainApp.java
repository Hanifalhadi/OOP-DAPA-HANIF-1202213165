public class MainApp {
    public static void main(String[] args) {

        System.out.println("\n============================TIDAK DIKETAHUI============================");

        TransportasiAir undefined = new TransportasiAir(4, 20000);
        undefined.informasi();
        undefined.berlayar();
        undefined.berlabuh();

        System.out.println("\n============================KAPAL============================");

        Kapal kapal = new Kapal(50, 100000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();

        System.out.println("\n============================SAMPAN============================");

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

    }
}