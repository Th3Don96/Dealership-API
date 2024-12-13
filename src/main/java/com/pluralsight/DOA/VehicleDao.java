package com.pluralsight.DOA;

import com.pluralsight.Model.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> getAll();
    Vehicle getByVIN(int VIN);
    Vehicle insert(Vehicle vehicle);
    boolean update(int VIN, Vehicle vehicle);
}
