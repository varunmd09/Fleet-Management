package com.example.Fleet_Mgnt.Services;

import com.example.Fleet_Mgnt.Entity.Route;
import com.example.Fleet_Mgnt.Repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Long id) {
        return routeRepository.findById(id).orElse(null);
    }

    public Route saveRoute(Route route) {
        return routeRepository.save(route);
    }
}
