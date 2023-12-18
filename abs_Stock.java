/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author ASUS
 */
public abstract class abs_Stock {
    String nama;
    
    public String nama(){
        return nama;
    }
    abstract int jmlStock();
}