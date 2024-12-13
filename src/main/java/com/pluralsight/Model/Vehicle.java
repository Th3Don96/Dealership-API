package com.pluralsight.Model;

public class Vehicle {

    private int VIN;
    private String Make, Model, FuelType, BodyStyle, ClassSize;
    private boolean Sold;

    public Vehicle(){

    }

    public Vehicle(int VIN, String make, String model, String fuelType,
                   String bodyStyle,String classSize, boolean sold) {
        this.VIN = VIN;
        this.Make = make;
        this.Model = model;
        this.FuelType = fuelType;
        this.BodyStyle = bodyStyle;
        this.ClassSize = classSize;
        Sold = sold;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", BodyStyle='" + BodyStyle + '\'' +
                ", Sold=" + Sold +
                '}';
    }

    public String getMake() {
        return Make;
    }

    public int getVIN() {
        return VIN;
    }

    public String getModel() {
        return Model;
    }


    public String getFuelType() {
        return FuelType;
    }

    public String getBodyStyle() {
        return BodyStyle;
    }


    public boolean isSold() {
        return Sold;
    }

}
