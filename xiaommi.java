public class xiaommi implements Phone {
    private int volume;
    private boolean ispowerOn;

    public xiaommi(){
        // set volume awal
        this.volume = 30;
    }

    @Override
    public void powerOn() {
        ispowerOn = true;
        System.out.println("Handphone menyala........");
        System.out.println("Selamat datang di XIAOMI");
        System.out.println("Android version 30");
    }
    @Override
    public void powerOff() {
        ispowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    @Override
    public void volumeUp() {
        if (ispowerOn) {
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume full");
                System.out.println("sudah " + this.getVolume() + "%");
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        }else{
            this.volume += 10;
            System.out.println("Volume sekarang: " + this.getVolume());
        }
    } {
        System.out.println("menyalakan dulu HP-nya!!!!");
    }



@Override
public void volumeDown(){
    if (ispowerOn) {
        if (this.volume == MIN_VOLUME) {
            System.out.println("Volume = 0%");
        } else {
            this.volume -= 10;
            System.out.println("Volume sekarang: " + this.getVolume());
        }
    } else {
        System.out.println("Nyalakan dulu HP-nya!!!!!!!");
    }
}

public int getVolume(){
    return this.volume;
}
}