/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author ASUS
 */
public class Main_THM {
    public static void main(String[] args){
        TokoHijabMulan THM = new TokoHijabMulan();
        THM.NamaHijab = "Pashmina";
        THM.Bahan = "Silk Premium";
        THM.Warna = "Merah";
        THM.Merk = "uma";
        THM.Harga = 50000;
        THM.Stock = 23;
        System.out.println("Nama Hijab : " + THM.NamaHijab);
        System.out.println("Bahan : " + THM.Bahan);
        System.out.println("Warna : " + THM.Warna);
        System.out.println("Merk : " + THM.Merk);
        System.out.println("Harga : " + THM.getHarga());
        System.out.println("Stock  : " + THM.Stock);
    }
}
