/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicles;

/**
 *
 * @author lenhu
 */
public class Vehicles {

 public   String make;
 public String model;
 public int year;
 
 public Vehicles(){}
 public Vehicles(String model , String make, int year){
     this.make =make;
     this.model =model;
     this.year = year;
 }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
 
     public String toString(){
         return "Vehicles{" + " make= " + make + ", model= " + model + ", year= " + year + '}';}
 
    
}
