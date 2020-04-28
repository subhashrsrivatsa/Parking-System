package com.subhash.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.parkingsystem.models.Gate;

/**
 * @author subhash
 *
 */

public interface GateDAO extends JpaRepository<Gate, Long>{

}
