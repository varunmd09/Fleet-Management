package com.example.Fleet_Mgnt.Repository;

import com.example.Fleet_Mgnt.Entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
