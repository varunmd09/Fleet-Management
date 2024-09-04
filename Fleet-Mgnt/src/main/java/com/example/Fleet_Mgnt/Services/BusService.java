package com.example.Fleet_Mgnt.Services;
import com.example.Fleet_Mgnt.Entity.Bus;
import com.example.Fleet_Mgnt.Entity.Driver;
import com.example.Fleet_Mgnt.Entity.Route;
import com.example.Fleet_Mgnt.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;


    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Bus getBusById(Long id) {
        return busRepository.findById(id).orElse(null);
    }

    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    public Bus assignRoute(Long busId, Route route) {
        Bus bus = busRepository.findById(busId).orElseThrow(() -> new RuntimeException("Bus not found"));
        bus.setRoute(route);
        return busRepository.save(bus);
    }

    public Bus assignDriver(Long busId, Driver driverid) {
        Bus bus = busRepository.findById(busId).orElseThrow(() -> new RuntimeException("Bus not found"));
        bus.setDriver(driverid);
        return busRepository.save(bus);
    }
}
