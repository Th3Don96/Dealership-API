package com.pluralsight.DOA.JDBC;


import com.pluralsight.DOA.VehicleDao;
import com.pluralsight.Model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcVehicleDao implements VehicleDao {

    private DataSource dataSource;
    private List<Vehicle> vehicle;


    @Autowired
    public JdbcVehicleDao(DataSource dataSource){
        this.dataSource = dataSource;
        this.vehicle = new ArrayList<>();
    }

    @Override
    public List<Vehicle> getAll(){
        this.vehicle.clear();
        String sql = "SELECT VIN, Make, Model, FuelType, BodyStyle, ClassSize, Sold FROM vehicle; ";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rows = statement.executeQuery();
            while (rows.next()){
                this.vehicle.add(new Vehicle(rows.getInt(1),rows.getString(2),
                        rows.getString(3),rows.getString(4),rows.getString(5),
                        rows.getString(6), rows.getBoolean(7)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return this.vehicle;
    }

    @Override
    public Vehicle getByVIN(int VIN) {
        return null;
    }

    @Override
    public Vehicle insert(Vehicle vehicle) {
        return null;
    }

    @Override
    public boolean update(int VIN, Vehicle vehicle) {
        return false;
    }
}
