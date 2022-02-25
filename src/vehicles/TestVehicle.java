/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author lenhu
 */
public class TestVehicle {
    public static void main(String[] args){
     CAr c = new CAr();
     c.color="red";
     c.make= "HONDA";
     c.year=2020;
     c.passengers =10;
     
     System.out.println(c);
     
     Vehicles v = new Vehicles();
     v.make="V";
     v.model="Huyndai";
     v.year= 2021;
             System.out.println(v);
        
    }
}
