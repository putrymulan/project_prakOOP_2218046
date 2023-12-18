/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author ASUS
 */
public class TokoHijabMulan extends abs_Stock implements KondisiHijab{
    String NamaHijab;
    String Bahan;
    String Warna;
    String Merk;
    String catatan;
    int Harga;
    int Stock;
    int Jumlah;
      
            
    public int getHarga(){
        return Harga;
    }
    
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    @Override
    public int jmlStock(){
        return Stock;
    }
    
    @Override
    public String KondisiHijabBaik(){
        return "Kondisi Bagus";
    }
    
    @Override
    public String KondisiHijabRusak(){
        return "Kondisi Rusak";
    }
    
//    @Override
//    public int totalKeuntungan(){
//        return (Harga * Kode);
//    }
    
    int TotalPemasukan(){
        Jumlah = Stock * Harga;
        return Jumlah;
    }
    
//    int TotalPemasukan(int Harga){
//        return Jumlah;
//    }

void NamaHijab(String NamaHijab) {
    this.NamaHijab = NamaHijab;
    }
void Bahan (String Bahan){
    this.Bahan = Bahan;
}
void Warna (String Warna){
    this.Warna = Warna;
}
void Merk (String Merk){
    this.Merk = Merk;
}
void catatan (String catatan){
    this.catatan = catatan;
}
//void Harga (int Harga){
//    this.Harga = Harga;
//}
//void Stock (int Stock){
//    this.Stock = Stock;
//}
}