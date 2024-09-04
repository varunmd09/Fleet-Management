package com.example.Fleet_Mgnt.Controller;
import com.example.Fleet_Mgnt.Entity.Bus;
import com.example.Fleet_Mgnt.Entity.Driver;
import com.example.Fleet_Mgnt.Entity.Route;
import com.example.Fleet_Mgnt.Services.BusService;
import com.example.Fleet_Mgnt.Services.DriverServices;
import com.example.Fleet_Mgnt.Services.RouteService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Setter
@Getter
@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @Autowired
    private RouteService routeService;

    @Autowired
    private DriverServices driverService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @PostMapping
    public Bus addBus(@RequestBody Bus bus){
        return   busService.saveBus(bus);
    }



    @PutMapping("/{busId}/route/{routeId}")
    public ResponseEntity<Bus> assignRouteToBus(@PathVariable Long busId, @PathVariable Long routeId) {
        Route route = routeService.getRouteById(routeId);
        if (route == null) {
            return ResponseEntity.badRequest().body(null);
        }
        Bus bus = busService.assignRoute(busId, route);
        return ResponseEntity.ok(bus);
    }

    @PutMapping("/{busId}/driver/{driverId}")
    public ResponseEntity<Bus> assignDriverToBus(@PathVariable Long busId, @PathVariable Long driverId) {
        Driver driver = driverService.getDriverById(driverId);
        if (driver == null) {
            return ResponseEntity.badRequest().body(null);
        }
        Bus bus = busService.assignDriver(busId, driver);
        return ResponseEntity.ok(bus);
    }

}

