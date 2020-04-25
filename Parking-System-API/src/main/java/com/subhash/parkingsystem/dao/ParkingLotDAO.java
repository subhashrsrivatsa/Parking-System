package com.subhash.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.parkingsystem.models.ParkingLot;

/**
 * @author subhash
 *
 */

public interface ParkingLotDAO extends JpaRepository<ParkingLot, Long>{

}
