/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Prisma Putra NIM 123190048
 */
import java.util.Scanner;

public class Main {
   public static void main(String args[])
    {
       
        
        Scanner scan = new Scanner(System.in);
        
        String pilih = "y";
        
        while(pilih.equals("y"))
        {
        Mahasiswa baru = new Mahasiswa("","",0,0,0);   
        System.out.println("======================================");
        System.out.println("|Selamat Datang di Program Input Data|");
        System.out.println("|           With JDK 15              |");
        System.out.println("|          Prisma Putra              |");
        System.out.println("|            123190048               |");
        System.out.println("======================================");
        System.out.print("| Masukkan Nama      : ");
        String nama = scan.nextLine();
        
        System.out.print("| Masukkan NIM       : ");
        String NIM = scan.nextLine();
        
        System.out.print("| Masukkan Umur      : ");
        int usia = scan.nextInt();
        
        System.out.print("| Masukkan Nilai UTS : ");
        int uts = scan.nextInt();
        
        System.out.print("| Masukkan Nilai UAS : ");
        int uas = scan.nextInt();

        baru.Tampil(nama,NIM,usia,uts,uas);
        
        System.out.println("======================================");
        System.out.print("| Anda Ingin Mengedit Data?(y/n): ");
        pilih = scan.next();
        
        scan.nextLine();
        
        System.out.print("\n");
        }
    }
}
