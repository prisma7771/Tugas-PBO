package penilaian;

import data.DataPeserta;

public class PenilaianAndroid extends DataPeserta implements Penilaian {

    public PenilaianAndroid(String nik, String nama, double testulis, double tescoding, double teswawancara) {
        super(nik, nama, testulis, tescoding, teswawancara);
    }

    @Override
    public double PenilaianPeserta() {
        return ((getTestulis() / 100) * 20) + ((getTescoding() / 100) * 50) + ((getTeswawancara() / 100) * 30);
    }

}
