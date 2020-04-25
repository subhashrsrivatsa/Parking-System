package com.subhash.parkingsystem.models;

import java.util.Date;

/**
 * @author subhash
 *
 */

public class VehicleEntry {

	private long id;
	private Date inTime;
	private Date outTime;
	private Vehicle vehicle;
	private Gate entryGate;
	private Gate exitGate;
	private Slot slot;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Gate getEntryGate() {
		return entryGate;
	}
	public void setEntryGate(Gate entryGate) {
		this.entryGate = entryGate;
	}
	public Gate getExitGate() {
		return exitGate;
	}
	public void setExitGate(Gate exitGate) {
		this.exitGate = exitGate;
	}
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VehicleEntry)) {
			return false;
		}
		VehicleEntry entry = (VehicleEntry) obj;
		if (this.getInTime().equals(entry.getInTime()) && this.getOutTime().equals(entry.getOutTime())) {
			if (this.getEntryGate().equals(entry.getEntryGate()) && this.getExitGate().equals(entry.getExitGate())) {
				if (this.getVehicle().equals(entry.getVehicle()) && this.getSlot().equals(entry.getSlot())) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
