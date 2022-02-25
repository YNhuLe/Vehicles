/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author lenhu
 */
public class CAr extends Vehicles{
    public String color;
    public int passengers;
    
    public CAr(){}
    
    public CAr(String color, int passengers, String model, String make, int year){
        super(model, make, year);
        this.color = color;
        this.passengers= passengers;
    }

    @Override
    public String toString() {
        return "CAr{" + "color=" + color + ", passengers=" + passengers + '}';
    }
    
    public CAr clone(){
     return new CAr(color, passengers, model, make, year);   
    }
    public boolean equals(CAr anotherCar){
        return this.make.equals(anotherCar.make)&&
                this.model.equals(anotherCar.model)&&
                this.year==anotherCar.year&&
                this.color.equals(anotherCar.color)&&
                this.passengers==anotherCar.passengers;
    }
}
