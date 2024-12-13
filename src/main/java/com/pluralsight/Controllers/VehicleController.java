package com.pluralsight.Controllers;



import com.pluralsight.DOA.VehicleDao;
import com.pluralsight.Model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    private VehicleDao vehicleDao;

    @Autowired
    public VehicleController(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    @RequestMapping(path ="/vehicle",method = RequestMethod.GET)
    public List<Vehicle> getAllVehicles(){
        return this.vehicleDao.getAll();
    }

    @RequestMapping(path="/vehicle/{VIN}", method = RequestMethod.GET)
    public Vehicle getAVehicle(@PathVariable int VIN) {
        return this.vehicleDao.getByVIN(VIN);
    }

    @RequestMapping(path="/vehicle", method = RequestMethod.POST)
    public Vehicle addAVehicle(@RequestBody Vehicle vehicle) {
        return this.vehicleDao.insert(vehicle);
    }

    @RequestMapping(path="/vehicle/{VIN}", method=RequestMethod.PUT)
    public boolean updateAVehicle(@PathVariable int VIN, @RequestBody Vehicle vehicle) {
        return this.vehicleDao.update(VIN, vehicle);
    }

}

