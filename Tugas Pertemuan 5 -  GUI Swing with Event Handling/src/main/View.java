package main;

import bidang.Persegi;
import ruang.Balok;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class View extends JFrame implements ActionListener{
    JLabel ljudul, lpanjang, llebar, ltinggi,lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
    JTextField fpanjang, flebar, ftinggi;
    JButton jhitung,jreset;
    Persegi persegi = new Persegi(0,0);
    Balok balok = new Balok(0,0,0);
    public View(){
        ljudul = new JLabel("KALKULATOR BALOK");
        lpanjang = new JLabel("Panjang");
        llebar = new JLabel("Lebar");
        ltinggi = new JLabel("Tinggi");
        lbl = new JLabel(" ");
        lbl1 = new JLabel(" ");lbl2 = new JLabel(" ");
        lbl3 = new JLabel(" ");lbl4 = new JLabel(" ");
        lbl5 = new JLabel(" ");lbl6 = new JLabel(" ");
        lbl7 = new JLabel(" ");lbl8 = new JLabel(" ");
        
        
        fpanjang = new JTextField(10);
        flebar = new JTextField(10);
        ftinggi = new JTextField(10);
        
        jhitung = new JButton("Hitung");
        jreset = new JButton("Reset");
        jhitung.addActionListener(this);
        jreset.addActionListener(this);
        
        
        setLayout(null);
        setSize(500,500);
        add(ljudul);add(lpanjang);add(llebar);add(ltinggi);
        add(lbl);
        add(lbl1);add(lbl2);add(lbl3);add(lbl4);
        add(lbl5);add(lbl6);add(lbl7);add(lbl8);
        add(fpanjang);add(flebar);add(ftinggi);
        add(jhitung);add(jreset);
        
        ljudul.setBounds(180,20,200,20);
        lpanjang.setBounds(30,60,100,20);
        llebar.setBounds(30,120,100,20);
        ltinggi.setBounds(30,180,100,20);
        
        lbl.setBounds(180,220,200,20);
        
        lbl1.setBounds(30,250,200,20);
        lbl2.setBounds(30,280,200,20);
        lbl3.setBounds(30,310,200,20);
        lbl4.setBounds(30,340,200,20);
        
        lbl5.setBounds(230,250,205,20);
        lbl6.setBounds(230,280,205,20);
        lbl7.setBounds(230,310,205,20);
        lbl8.setBounds(230,340,205,20);
        
        fpanjang.setBounds(150,60,200,20);
        flebar.setBounds(150,120,200,20);
        ftinggi.setBounds(150,180,200,20);
        
        
        jhitung.setBounds(120,400,100,20);
        jreset.setBounds(250,400,100,20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);   
    }
      @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==jhitung){
            try{
            persegi.setPanjang(Double.parseDouble(fpanjang.getText()));
            persegi.setLebar(Double.parseDouble(flebar.getText()));
            balok.setTinggi(Double.parseDouble(ftinggi.getText()));
              
            Persegi persegi2 = new Persegi(persegi.getPanjang(),persegi.getLebar());
            Balok balok2 = new Balok(persegi.getPanjang(),persegi.getLebar(),balok.getTinggi());
            
            lbl.setText("Hasil:");
            lbl1.setText("Luas Persegi Panjang");
            lbl2.setText("Keliling Persegi Panjang");
            lbl3.setText("Volume Balok");
            lbl4.setText("Luas Permukaan Balok");
            lbl5.setText(String.format(": %.2f",persegi.luasBidang()));
            lbl6.setText(String.format(": %.2f",persegi.kelilingBidang()));
            lbl7.setText(String.format(": %.2f",balok2.VolumeRuang()));
            lbl8.setText(String.format(": %.2f",balok2.LuasRuang()));
            }
            catch(NullPointerException error){
                showMessageDialog(null,error.getMessage());
            }  
            catch(NumberFormatException error){
                showMessageDialog(null,error.getMessage());
            } 
         }
        if(e.getSource()==jreset){
           fpanjang.setText(" ");
           flebar.setText(" ");
           ftinggi.setText(" ");
           lbl.setText(" ");
           lbl1.setText(" ");
           lbl2.setText(" ");
           lbl3.setText(" ");
           lbl4.setText(" ");
           lbl5.setText(" ");
           lbl6.setText(" ");
           lbl7.setText(" ");
           lbl8.setText(" ");
        }
    }
}
