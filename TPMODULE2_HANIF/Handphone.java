public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super (drive, ram, processor);

    }

    @Override
    public void informasi(){
        System.out.println("Infomation Handphone has been Completed !!!");
    }

    public void telfon(int no_hp){
        System.out.println("Call has been Activated !!!");
    }

    public void kirimSMS(int no_hp){
        System.out.println("Sending SMS has been Completed !!!");
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Sending SMS 2 has been Completed");
    }
    
}
