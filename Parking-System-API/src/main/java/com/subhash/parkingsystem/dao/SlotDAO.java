package com.subhash.parkingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.parkingsystem.models.Slot;

/**
 * @author subhash
 *
 */

public interface SlotDAO extends JpaRepository<Slot, Long>{

}
