public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop (String drive, int ram, float processor, boolean webcam){
        super (drive, ram, processor);

    }

    @Override
    public void informasi(){
        System.out.println("Infomation Laptop has been Completed !!!");
    }

    public void bukaGame(String nama_game){
        System.out.println("Games has been Activated !!!");
    }

    public void kirimEmail(String email){
        System.out.println("Sending EMAIL has been Completed !!!");
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Sending EMAIL 2 has been Completed");
    }
    
    
}
