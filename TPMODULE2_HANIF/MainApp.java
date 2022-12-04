public class MainApp {
    //main class
    public static void main(String[]args ) {
        Perangkat Perangkat = new Perangkat(null,0,0);
        Handphone handphone = new Handphone("Sandisk",6,2,true);
        handphone.drive="Sandisk";
        handphone.ram = 6;
        handphone.processor = 2;
        handphone.fingerprint = true;

        Laptop Leptopp = new Laptop("IPHONG",16,9,false);
        Leptopp.drive="IPHONG";
        Leptopp.ram = 16;
        Leptopp.processor = 9;
        Leptopp.webcam = false;

        Perangkat.informasi();
        System.out.println();

        handphone.informasi();
        handphone.telfon(39344344);
        handphone.kirimSMS(21112002);
        handphone.kirimSMS(123456,112108);

        Leptopp.informasi();
        Leptopp.bukaGame("Mobel Lejend");
        Leptopp.kirimEmail("hanifalhadi@gmail.com");
        Leptopp.kirimEmail("hanifalhadi11@gmail.com", "hanifalhadi21@gmail.com");
        

    }
    
}