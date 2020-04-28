package com.subhash.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.parkingsystem.models.VehicleEntry;

/**
 * @author subhash
 *
 */

public interface VehicleEntryDAO extends JpaRepository<VehicleEntry, Long>{

}
