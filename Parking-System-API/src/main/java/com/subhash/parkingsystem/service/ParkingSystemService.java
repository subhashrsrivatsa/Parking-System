package com.subhash.parkingsystem.service;

import java.util.List;
import java.util.Optional;

import com.subhash.parkingsystem.models.Gate;
import com.subhash.parkingsystem.models.ParkingLot;
import com.subhash.parkingsystem.models.Slot;
import com.subhash.parkingsystem.models.Vehicle;
import com.subhash.parkingsystem.models.VehicleEntry;

/**
 * @author subhash
 *
 */

public interface ParkingSystemService {

	void saveParkingLot(ParkingLot parkingLot);

	Optional<ParkingLot> getParkingLot();

	Optional<Slot> getSlot(Long id);

	Optional<Gate> getGate(Long id);

	void saveVehicleEntryFlow(Vehicle vehicle, Gate gate, Slot slot);

	void saveVehicleExitFlow(Vehicle vehicle, Gate gate, Slot slot, Short amount);
	
	Optional<List<VehicleEntry>> getAllVehicleEntries();
}
