package com.subhash.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.parkingsystem.models.Vehicle;

/**
 * @author subhash
 *
 */

public interface VehicleDAO extends JpaRepository<Vehicle, Long>{

}
