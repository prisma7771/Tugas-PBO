package main;

import java.util.Scanner;
import data.DataPeserta;

public class Main {

    public static void main(String[] args) {
        boolean lanjut = true;
        do {
            int pilih = 0;
            System.out.println("=================================");
            System.out.println("|| SELAMAT DATANG DI PT. SUKA  ||"); 
            System.out.println("||         Pilih Divisi        ||");
            System.out.println("=================================");
            System.out.println("|| 1. Android Development      ||");
            System.out.println("|| 2. Web Development          ||");
            System.out.println("|| 3. Exit                     ||");
            System.out.println("=================================");
            System.out.print("|| Pilih Jenis Form: ");
            Scanner input = new Scanner(System.in);
            try {
                pilih = input.nextInt();
                if (pilih < 1 || pilih > 3) {
                    throw new Exception();
                }
            } catch (Exception error) {
                System.out.println("Error: " + error.getMessage());
            }
            switch (pilih) {
                case 1:
                try {
                    boolean lagi = true;
                    DataPeserta dp = new DataPeserta("", "", 0, 0, 0);
                    dp.InputData();
                    do {
                        System.out.println(" ");
                        System.out.println("=================================");
                        System.out.println("||         Pilih Menu          ||");
                        System.out.println("=================================");
                        System.out.println("|| 1. Edit Data                ||");
                        System.out.println("|| 2. Cek Hasil                ||");
                        System.out.println("|| 3. Exit                     ||");
                        System.out.println("=================================");
                        System.out.print("|| Pilih Menu: ");
                        int menu1 = 0;
                        menu1 = input.nextInt();

                        if (menu1 == 1) {
                            dp.EditData();
                        } else if (menu1 == 2) {
                            dp.TampilAndroid();
                        } else if (menu1 == 3) {
                            System.out.println("\nThank You For Using This Simple Java Program\n");
                            System.exit(0);
                        }
                    } while (lagi);
                } catch (Exception error) {
                    System.out.println("Error: " + error.getMessage());
                }
                break;

                case 2:
                try {
                    boolean lagi = true;
                    DataPeserta dp = new DataPeserta("", "", 0, 0, 0);
                    dp.InputData();
                    do {
                        System.out.println(" ");
                        System.out.println("=================================");
                        System.out.println("||         Pilih Menu          ||");
                        System.out.println("=================================");
                        System.out.println("|| 1. Edit Data                ||");
                        System.out.println("|| 2. Cek Hasil                ||");
                        System.out.println("|| 3. Exit                     ||");
                        System.out.println("=================================");
                        System.out.print("|| Pilih Menu: ");
                        int menu2 = 0;
                        menu2 = input.nextInt();

                        if (menu2 == 1) {
                            dp.EditData();
                        } else if (menu2 == 2) {
                            dp.TampilWeb();
                        } else if (menu2 == 3) {
                            System.out.println("\nThank You For Using This Simple Java Program\n");
                            System.exit(0);
                        }
                    } while (lagi);
                } catch (Exception error) {
                    System.out.println("Error: " + error.getMessage());
                }break;

                case 3: {
                    System.out.println("\nThank You For Using This Simple Java Program\n");
                    System.exit(0);
                    break;
                }
            }

        } while (lanjut);
    }

}
