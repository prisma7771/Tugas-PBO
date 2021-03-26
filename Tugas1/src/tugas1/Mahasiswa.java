/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Toshiba
 */
public class Mahasiswa {
    String nama;
    String NIM;
    int usia;
    int uts;
    int uas;
    
    public Mahasiswa(String nama, String NIM, int usia,int uts,int uas)
    {
        this.nama = nama;
        this.NIM = NIM;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    public void Tampil(String nama, String NIM, int usia, int uts, int uas)
    {   System.out.println();
        System.out.println("======================================");
        System.out.println("| Nama Anda :  " + nama);
        System.out.println("| NIM Anda  :  " + NIM);
        System.out.println("| Usia Anda :  " + usia + " Tahun");
        System.out.println("| Nilai UTS :  " + uts);
        System.out.println("| Nilai UAS :  " + uas);
        Rata(uts,uas);
 
        
    }
    
    public void Rata(int uts, int uas)
    {
        int total = (uas+uts)/2;
         System.out.println("| Nilai Rata-Rata:  " + total);
    }
}
