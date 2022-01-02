package TugasBesar;

import java.util.Random;
import java.util.Scanner;

public class KertasGuntingBatu {

    public void kertasGunting(){

        Scanner S = new Scanner (System.in);
        Random R = new Random();

        int scoreKomputer = 0;
        int scorePemain = 0;
        int awalMulai = 0;

        System.out.println ("Selamat datang di Aplikasi KERTAS GUNTING BATU");
        System.out.println("Tulis nama kamu untuk memulai permainan : ");
        String nama = S.nextLine();


        while(awalMulai == 0){
            int janKen;
            janKen = 0;
            String suit = null;

            int pilihanKomputer = 1 + R.nextInt(3);

            System.out.println("Hallo " + nama );
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| Silahkan Tekan Tombol :|");
            System.out.println("| A.KERTAS               |");
            System.out.println("| B.GUNTING              |");
            System.out.println("| C.GUNTING              |");
            System.out.println("| D.KELUAR               |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Masukkan pilihan anda = ");

            String pilihanPemain = S.nextLine();
            if (pilihanPemain.equalsIgnoreCase("A")){
                janKen = janKen + 1;
                suit = "Kertas";
            } else if (pilihanPemain.equalsIgnoreCase("B")){
                janKen = janKen + 2;
                suit = "Gunting";
            } else if (pilihanPemain.equalsIgnoreCase("C")){
                janKen = janKen + 3;
                suit = "Batu";
            } else {
                return;
            }

            if (janKen == pilihanKomputer) {
                System.out.println("Pemain seri");
            }

            else if (janKen == 1 ){
                if (pilihanKomputer == 2){
                    System.out.println("Anda Memilih "+suit);
                    System.out.println("Komputer memilih GUNTING");
                    System.out.println("Your Loser!!");
                    scoreKomputer++;
                    System.out.println("komputer :" + scoreKomputer);
                    System.out.println(nama + " : " + scorePemain);
                }else if (pilihanKomputer == 3){
                    System.out.println("Anda Memilih "+suit);
                    System.out.println("Komputer memilih BATU");
                    System.out.println("You Winner!");
                    scorePemain++;
                    System.out.println("Komputer : " + scoreKomputer);
                    System.out.println(nama + " : " + scorePemain);
                }
            }
            else if(janKen == 2 ){
                if (pilihanKomputer == 1){
                    System.out.println("Anda Memilih "+suit);
                    System.out.println("Komputer meilih KERTAS");
                    System.out.println("You Winner!");
                    scorePemain++;
                    System.out.println("Komputer : " + scoreKomputer);
                    System.out.println(nama + " : " + scorePemain);
                }else if(pilihanKomputer == 3) {
                    System.out.println("Anda Memilih "+suit);
                    System.out.println("Komputer meilih BATU");
                    System.out.println("You Loser!");
                    scoreKomputer++;
                    System.out.println("Komputer : " + scoreKomputer);
                    System.out.println(nama + " : " + scorePemain);
                }
            }
            else if(janKen == 3 ){
                if (pilihanKomputer == 1 ){
                    System.out.println("Anda Memilih "+suit);
                    System.out.println("Komputer meilih KERTAS");
                    System.out.println("You Looser!");
                    scoreKomputer++;
                    System.out.println("Komputer : " + scoreKomputer);
                    System.out.println(nama + " : "+ scorePemain);
                }else if(pilihanKomputer == 2 ) {
                    System.out.println("Anda Memilih "+suit);
                    System.out.println("Komputer meilih GUNTING");
                    System.out.println("You Winner!");
                    scorePemain++;
                    System.out.println("Komputer : " + scoreKomputer);
                    System.out.println(nama + " : " + scorePemain);

                }
            }
            else if (janKen == 4){
                System.out.println("KELUAR");
                break;
            }

            if (scorePemain == 10){
                System.out.println("~~~YOU ARE WINNER CONGRATULATION!!~~~~");
            }
            if (scoreKomputer == 10)
                System.out.println("~~~YOU ARE LOSER!!!~~~");
        }
    }
}