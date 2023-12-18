/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import javax.swing.text.html.HTML;

/**
 *
 * @author ASUS
 */
public class PengirimanHijab extends Diskon{
    private String Alamat;
    int Harga, TotalPendapatan, JmlBrng;
    String NamaToko, Merk, NamaHijab,kode;
    
    public String getAlamat(){
        return Alamat;
    }
    
    @Override
    double Diskon(){
        return (TotalPendapatan() * diskon);
    }
    
    public int TotalPendapatan(){
        return (JmlBrng * Harga);
    }
//    @Override
//    public int jmlStock(){
//        return (Stock - JmlBrng);
//    }
    
//    @Override
//    int TotalPemasukan(){
//        Jumlah = Stock * Harga;
//        return Jumlah;
//    }
    
public void setAlamat (String Alamat){
    this.Alamat = Alamat; 
}
void JmlBrng (int JmlBrng){
    this.JmlBrng = JmlBrng;
}
void Harga (int harga){
    this.Harga = harga;
}
void NamaToko (String NamaToko){
    this.NamaToko = NamaToko;
}
void Merk (String Merk){
    this.Merk = Merk;
}
void NamaHijab(String NamaHijab) {
    this.NamaHijab = NamaHijab;
    }
public void TotalPendapatan(int Total){
        this.TotalPendapatan = Total;
    }
}