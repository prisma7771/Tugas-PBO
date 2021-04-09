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
public class Kerucut extends Lingkaran implements MenghitungRuang{
    double s;
    double tinggi;

    public Kerucut(double jari2, double tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }
    
    public Kerucut(double jari2, double tinggi, double s) {
        super(jari2);
        this.s = s;
        this.tinggi = tinggi;
    }
    
    @Override
    public double VolumeRuang()
    {
        return (Math.PI*super.getJari2()*super.getJari2()*tinggi)/3;
    }
    
    @Override
    public double LuasRuang()
    {
         s = Math.sqrt((Math.pow(super.getJari2(),2)+Math.pow(tinggi,2)));
        return (Math.PI*super.getJari2()*(super.getJari2()+s));
    }
    
    void tampilkanKerucut(double jari2, double tinggi)
    {
        System.out.println("Volume Kerucut: " + VolumeRuang());
    }
    
    void tampilkanKerucut(double jari2, double tinggi, double s)
    {
        System.out.println("Luas Permukaan Kerucut: " + LuasRuang());
    }
   

}
