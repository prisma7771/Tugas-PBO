/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Toshiba
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    
   double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
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
