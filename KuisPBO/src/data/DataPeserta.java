package data;

import java.util.Scanner;
import penilaian.PenilaianAndroid;
import penilaian.PenilaianWeb;

public class DataPeserta implements Menu{

    private String nik, nama;
    private double testulis, tescoding, teswawancara;

    public DataPeserta(String nik, String nama, double testulis, double tescoding, double teswawancara) {
        this.nik = nik;
        this.nama = nama;
        this.testulis = testulis;
        this.tescoding = tescoding;
        this.teswawancara = teswawancara;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTestulis() {
        return testulis;
    }

    public void setTestulis(double testulis) {
        this.testulis = testulis;
    }

    public double getTescoding() {
        return tescoding;
    }

    public void setTescoding(double tescoding) {
        this.tescoding = tescoding;
    }

    public double getTeswawancara() {
        return teswawancara;
    }

    public void setTeswawancara(double teswawancara) {
        this.teswawancara = teswawancara;
    }
    @Override
    public void InputData() {
         Scanner input = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("|            Input Data              |");
        System.out.println("======================================");
        System.out.print("|| NIK(Angka)     : ");
        setNik(input.nextLine());
        Integer.parseInt(getNik());
       
        System.out.print("|| Nama           : ");
        setNama(input.nextLine());
        System.out.print("|| Nilai Tes Tulis    : ");
        setTestulis(input.nextDouble());
        System.out.print("|| Nilai Tes Coding   : ");
        setTescoding(input.nextDouble());
        System.out.print("|| Nilai Tes Wawancara: ");
        setTeswawancara(input.nextDouble());
}
    
    @Override
    public void EditData() {
        System.out.println("======================================");
        System.out.println("|            Edit Data              |");
        System.out.println("======================================");
        Scanner input = new Scanner(System.in);
        System.out.print("|| Nilai Tes Tulis    : ");
        setTestulis(input.nextDouble());
        System.out.print("|| Nilai Tes Coding   : ");
        setTescoding(input.nextDouble());
        System.out.print("|| Nilai Tes Wawancara: ");
        setTeswawancara(input.nextDouble());
    

    }
    @Override
    public void TampilAndroid() {
        PenilaianAndroid pa = new PenilaianAndroid(getNik(), getNama(), getTestulis(), getTescoding(), getTeswawancara());
        System.out.println("Nilai Akhir Anda: " + pa.PenilaianPeserta());
        if (pa.PenilaianPeserta() >= 85) {
            System.out.println("KETERANGAN: LULUS");
            System.out.println("Selamat kepada saudara/i " + getNama() + " telah diterima di divisi Android Development");
        } else {
            System.out.println("KETERANGAN: GAGAL");
            System.out.println("Mohon maaf kepada saudara/i " + getNama() + " belum diterima di divisi Android Development");
        }

    }
    @Override
    public void TampilWeb() {
        PenilaianWeb pw = new PenilaianWeb(getNik(), getNama(), getTestulis(), getTescoding(), getTeswawancara());
        System.out.println("Nilai Akhir Anda: " + pw.PenilaianPeserta());
        if (pw.PenilaianPeserta() >= 85) {
            System.out.println("KETRANGAN: LULUS");
            System.out.println("Selamat kepada saudara/i " + getNama() + " telah diterima di divisi Web Development");
        } else {
            System.out.println("KETERANGAN: GAGAL");
            System.out.println("Mohon maaf kepada saudara/i " + getNama() + " belum diterima di divisi Web Development");
        }

    }
}
