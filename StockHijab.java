/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author ASUS
 */
public class StockHijab extends abs_Stock implements KondisiHijab{
    String KodeBrng;
    int Stock;
    private String TglMasuk;
    private String TglKeluar;
    String UkHijab, NamaHijab;
    String catatan;
    
    @Override
    public int jmlStock(){
        return Stock;
    }
    
//    @Override
//    public int totalKeuntungan(){
//        return Stock;
//    }
    public String getTglMasuk(){
        return TglMasuk;
    }
    public String getTglKeluar(){
        return TglKeluar;
    }
     @Override
    public String KondisiHijabBaik(){
        return "Kondisi Bagus";
    }
    
    @Override
    public String KondisiHijabRusak(){
        return "Kondisi Rusak";
    }
    
void KodeBrng(String KodeBrng){
    this.KodeBrng = KodeBrng;
}
public void setTglMasuk(String TglMasuk){
    this.TglMasuk = TglMasuk;
}
public void setTglKeluar(String TglKeluar){
    this.TglKeluar = TglKeluar;
}
void UkHijab(String UkHijab){
    this.UkHijab = UkHijab;
}
void NamaHijab(String Nama){
    this.NamaHijab = Nama;
}
void Stock(int Stock){
    this.Stock = Stock;
}
void catatan (String catatan){
    this.catatan = catatan;
}
 public static void main(String[] args){
     StockHijab Stock = new StockHijab();
     Stock.KodeBrng = "PM001";
     Stock.TglMasuk = "18-03-2023";
     Stock.TglKeluar = "25-03-2023";
     Stock.UkHijab = "M";
     System.out.println("Stock Hijab");
     System.out.println("-----------------------");
     System.out.println("Kode Barang : " + Stock.KodeBrng);
     System.out.println("Ukuruan Hijab : " + Stock.UkHijab);
     System.out.println("Tanggal Masuk : " + Stock.TglMasuk);
     System.out.println("Tanggal Keluar : " + Stock.TglKeluar);
 }
}