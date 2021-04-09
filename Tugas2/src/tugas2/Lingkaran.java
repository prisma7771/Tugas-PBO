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
public class Lingkaran implements MenghitungBidang{

    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
    
    @Override
    public double luasBidang()
    {
        return Math.PI*Math.pow(jari2,2);
    }
    
    @Override
    public double kelilingBidang()
    {
        return 2*Math.PI*jari2;
    }
    
    
    void tampilkan()
    {
        System.out.println("Luas Lingkaran: " + luasBidang());
        System.out.println("Keliling Lingkaran: " + kelilingBidang());
    }
    
}
