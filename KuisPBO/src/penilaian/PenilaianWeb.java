package penilaian;

import data.DataPeserta;

public class PenilaianWeb extends DataPeserta implements Penilaian {

    public PenilaianWeb(String nik, String nama, double testulis, double tescoding, double teswawancara) {
        super(nik, nama, testulis, tescoding, teswawancara);
    }

    @Override
    public double PenilaianPeserta() {
        return ((getTestulis() / 100) * 40) + ((getTescoding() / 100) * 35) + ((getTeswawancara() / 100) * 25);
    }
}
