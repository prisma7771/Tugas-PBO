/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Prisma Putra NIM 123190048 Praktikum PBO-E
 */
import java.util.Scanner;

public class Main {
   public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);   
        System.out.println("======================================");
        System.out.println("|Selamat Datang di Program Input Data|");
        System.out.println("|           With JDK 15              |");
        System.out.println("|          Prisma Putra              |");
        System.out.println("|            123190048               |");
        System.out.println("======================================");
        
        Mahasiswa baru = new Mahasiswa("","",0,0,0);
        baru.InputData();
        
        String pilih = "y";
        
        while(pilih.equals("y"))
        {
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("======================================");
        System.out.println("| 1. Lihat Data                      |");
        System.out.println("| 2. Edit  Data                      |");
        System.out.println("| 3. Keluar                          |");
        System.out.println("======================================");
        System.out.print("Masukkan Pilihan Anda: ");
        int memilih;
        memilih = scan.nextInt();
        
        switch(memilih)
        {
            case 1 : baru.Tampil(baru.nama,baru.NIM,baru.usia,baru.uts,baru.uas); break;
            case 2 : baru.InputData(); break;
            case 3 : System.out.println("\nThank You For Using This Simple Java Program\n"); System.exit(0);
        }
        System.out.print("Kembali Ke Menu?(y/n): ");
        pilih = scan.next();
        scan.nextLine();
        }
        System.out.print("\n");
        }
    }
