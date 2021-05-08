package ruang;

import bidang.Persegi;

public class Balok extends Persegi implements MenghitungRuang{
    
  private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    

    @Override
    public double VolumeRuang()
    {
        return super.luasBidang()*tinggi;
    }
    
    @Override
    public double LuasRuang()
    {
        return 2*((super.getPanjang()*super.getLebar())+(super.getPanjang()*tinggi)+(super.getLebar()*tinggi));
    }
    
    void tampilkanBalok()
    {
        System.out.println("Volume Balok: " + VolumeRuang());
        System.out.println("Luas Permukaan Balok: " + LuasRuang());
    }
}

