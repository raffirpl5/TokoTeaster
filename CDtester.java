package Toko;

import java.util.Scanner;

public class CDtester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ada berapa jumlah object? (max 10)");
        int jumlah = in.nextInt();
        for(int i=0; i<jumlah; i++) {
        }
        //condition dilengkapi > 10 atau < 1 tidak dijalankan 
        if (jumlah < 1 || jumlah > 10) {
            System.out.println("Input salah");
        }
        if (jumlah > 10 | jumlah < 1) {
            System.out.println("takbisa a");
        } else {
            for(int i=1; i<=jumlah; i++) {
                // mencegah error krn tipe data tidak sesuai
                try {
                    System.out.println("Silahkan pilih 1 untuk CD dan 2 untuk DVD");
                    int pilihan = in.nextInt();
                    if (pilihan == 1) {
                        CD c = new CD();
                        c.printInfo();
                    } else if (pilihan == 2) {
                        DVD d = new DVD();
                        d.print();
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                } catch (Exception e) {
                    System.out.println("Tipe data salah, hanya menerima angka ");
                }
            }
        }
        // mencegah error krn tipe data tidak sesuai
        in.close();

        // CD cd = new CD(); 
        // cd.setLabel("ABC");
        // cd.setArtist("Lady Gaga");
        // cd.setNumSong(10);
        // cd.setNumSong(2);

        // DVD dvd = new DVD();
        // dvd.setStudio("Universal");
        // dvd.setRating("PG");
        // dvd.setLength(120);

        // cd.print();
        // dvd.print();

    }

}
