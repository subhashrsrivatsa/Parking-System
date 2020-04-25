package com.subhash.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.parkingsystem.models.VehicleInfo;

/**
 * @author subhash
 *
 */

public interface VehicleInfoDAO extends JpaRepository<VehicleInfo, Long>{

}
