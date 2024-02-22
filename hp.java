import java.util.Scanner;
public class hp {
    public static void main(String[] args) {
        // membuat objek hp
        Phone redmi13 = new xiaommi();

        // membuat objek user
        PhoneUser saka = new PhoneUser(redmi13);

        // kita nyalakan  hp-nya
        saka.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("===APLIKASI INTERFACE===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] keluar");
            System.out.println("---------------------------");
            System.out.println("pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                saka.turnOnThePhone();
            }else if (aksi.equalsIgnoreCase("2")) {
                saka.turnOffThePhone();
            }else if (aksi.equalsIgnoreCase("3")) {
                saka.makePhoneLouder();
            }else if (aksi.equalsIgnoreCase("4")) {
                saka.makePhoneSilent();
            }else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            }else {
                System.out.println("Kamu memilih aksi yang salah!!!!");
            }
        }
    }
}
