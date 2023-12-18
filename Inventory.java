/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;

/**
 *
 * @author ASUS
 */
public class Inventory {
    int stock;
    String harga;
    String warna;
    String namaHijab;
    
//    public Inventory() {
////        namaHijab = "Segi Empat";
////        warna = "Biru Dongker";
////        stock = 25;
////        harga = "22.500";
//    }
    public Inventory (String NamaHijab, String Warna, String Harga, int Stock){
        namaHijab = "Segi Empat";
        warna = "Biru Dongker";
        stock = 25;
        harga = "22.500";
    }
    void datanamaHijab(String namaHijab){         
        this.namaHijab = namaHijab; 
    } 
    void dataWarna(String warna){         
        this.warna = warna; 
    }
    public String getnamaHijab() {
        return namaHijab;
    }
    public String getwarna() {
        return warna;
    }
    public int getStock() {
        return stock;
    }
    public String getharga() {
        return harga;
    }
    int cetakStock(){         
        return stock; 
    } 
    String cetakharga(){         
        return harga; 
    }
}
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    
    

