/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Prisma Putra NIM 123190048
 */
public class Mahasiswa {

    String nama;
    String NIM;
    int usia;
    int uts;
    int uas;

    public Mahasiswa(String nama, String NIM, int usia, int uts, int uas) {
        this.nama = nama;
        this.NIM = NIM;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }

    public void Tampil(String nama, String NIM, int usia, int uts, int uas) {
        System.out.println();
        System.out.println("=================================================");
        System.out.println("Perkenalkan Nama Saya " + nama + ", NIM saya " + NIM);
        System.out.println("Usia :  " + usia + " Tahun");
        Rata(uts, uas);
    }

    public void Rata(int uts, int uas) {
        float total = ((float) uas + uts) / 2;
        System.out.println("Nilai Akhir:  " + total);
        System.out.println("=================================================");
    }

    public void InputData() {
        System.out.println("|            Input Data              |");
        System.out.println("======================================");
        Scanner scan = new Scanner(System.in);
        System.out.print("| Masukkan Nama      : ");
        nama = scan.nextLine();

        System.out.print("| Masukkan NIM       : ");
        NIM = scan.nextLine();

        System.out.print("| Masukkan Umur      : ");
        usia = scan.nextInt();

        System.out.print("| Masukkan Nilai UTS : ");
        uts = scan.nextInt();

        System.out.print("| Masukkan Nilai UAS : ");
        uas = scan.nextInt();
    }
}
