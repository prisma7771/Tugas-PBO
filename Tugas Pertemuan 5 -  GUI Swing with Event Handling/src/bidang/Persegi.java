package bidang;

public class Persegi implements MenghitungBidang{

   private double panjang;
   private double lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luasBidang()
    {
        return panjang*lebar;
    }
    
    @Override
    public double kelilingBidang()
    {
        return 2*(panjang+lebar);
    }
    
    void tampilkan()
    {
         System.out.println("Luas Persegi Panjang: " + luasBidang());
         System.out.println("Keliling Persegi Panjang: " + kelilingBidang());
    }
}

