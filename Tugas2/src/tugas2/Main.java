package tugas2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 * 
 * @author Prisma Putra (123190048) Praktikum PBO-E
 * Using JDK 15 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersegiPanjang pp = new PersegiPanjang(0,0);
        Lingkaran lingk = new Lingkaran(0);
        System.out.println("=============================================");
        System.out.println("|         THIS PROGRAM USE JDK 15           |");
        System.out.println("=============================================");
        
        boolean Continue = true;
        do{
        Scanner scan = new Scanner(System.in);
        double tinggi = 0;
        double s = 0;
       
        
            int memilih = 0;
        System.out.println("==========================");
        System.out.println("|         Menu           |");
        System.out.println("==========================");
        System.out.println("| 1. Persegi & Balok     |");
        System.out.println("| 2. Lingkaran & Kerucut |");
        System.out.println("| 3. Exit                |");
        System.out.println("==========================");
        System.out.print("Pilihan Anda: ");
        try{
        memilih = scan.nextInt();
        } catch (Exception error)
        {
            System.out.println("Error: " + error.getMessage());
        }
        switch(memilih)
        {
            case 1 :  
                try{
                System.out.print("\n==========================\n");
                System.out.print("| Masukkan Panjang: ");
                pp.setPanjang(scan.nextDouble()) ;
                System.out.print("| Masukkan Lebar: ");
                pp.setLebar(scan.nextDouble());
                System.out.print("| Masukkan Tinggi: ");
                tinggi = scan.nextDouble();
                } catch(Exception error)
                {
                    System.out.println("Error: " + error.getMessage());
                }
                PersegiPanjang persegipanjang = new PersegiPanjang(pp.getPanjang(),pp.getLebar());
                Balok balok = new Balok(pp.getPanjang(),pp.getLebar(),tinggi);
                System.out.print("==========================\n");
                System.out.print("OUTPUT====================\n");
                persegipanjang.tampilkan();
                balok.tampilkanBalok();
                System.out.print("==========================\n");
                System.out.println("\n");
                break;

                
            case 2 :
                try{
                System.out.print("\n==========================\n");
                System.out.print("| Masukkan Jari-Jari: ");
                lingk.setJari2(scan.nextDouble());
                System.out.print("| Masukkan Tinggi: ");
                tinggi = scan.nextDouble();
                s = 0;
                }
                catch(Exception error)
                {
                    System.out.println("Error: " + error.getMessage());
                }
                Lingkaran lingkaran = new Lingkaran(lingk.getJari2());
                Kerucut kerucut = new Kerucut(lingk.getJari2(),tinggi);
                System.out.print("==========================\n");
                System.out.print("OUTPUT====================\n");
                lingkaran.tampilkan();
                kerucut.tampilkanKerucut(lingk.getJari2(),tinggi);
                kerucut.tampilkanKerucut(lingk.getJari2(),s, tinggi);
                System.out.print("==========================\n");
                System.out.println("\n");
                break;
                
            case 3 : 
                System.out.println("\nThank You For Using This Simple Java Program\n"); 
                System.exit(0);
                
        }
       
    } while(Continue);
}
}
