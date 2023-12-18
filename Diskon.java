/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author ASUS
 */
abstract public class Diskon {
    double diskon;
    
    public Diskon(){
        this.diskon = 0.2;
    }
    abstract double Diskon();
}
