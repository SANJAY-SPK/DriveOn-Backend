package com.driveon.controller;

import com.driveon.model.Vehicle;
import com.driveon.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/driveon/vehicles")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicleDetails) {
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(id);
        if (optionalVehicle.isPresent()) {
            Vehicle vehicle = optionalVehicle.get();
            vehicle.setName(vehicleDetails.getName());
            vehicle.setType(vehicleDetails.getType());
            vehicle.setPricePerDay(vehicleDetails.getPricePerDay());
            vehicle.setSeats(vehicleDetails.getSeats());
            vehicle.setTransmission(vehicleDetails.getTransmission());
            vehicle.setImage(vehicleDetails.getImage());
            vehicle.setAvailable(vehicleDetails.getAvailable());
            vehicle.setCreatedAt(vehicleDetails.getCreatedAt());
            vehicle.setUpdatedAt(vehicleDetails.getUpdatedAt());
            return vehicleRepository.save(vehicle);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable Long id) {
        vehicleRepository.deleteById(id);
    }

    // ...existing code...
}