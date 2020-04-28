/**
 * To store the detail information of the Vehicle 
 */

package com.subhash.parkingsystem.models;

import java.util.Date;

/**
 * @author subhash
 *
 */

public class VehicleInfo {
	
	private Long id;
	private Date inTime;
	private Date outTime;
	private Short amount;
	private Gate entryGate;
	
	private Gate exitGate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Short getAmount() {
		return amount;
	}
	public void setAmount(Short amount) {
		this.amount = amount;
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
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VehicleInfo)) {
			return false;
		}
		VehicleInfo info = (VehicleInfo) obj;
		if (this.getInTime().equals(info.getInTime()) && this.getOutTime().equals(info.getOutTime())) {
			if (this.getEntryGate().equals(info.getEntryGate()) && this.getExitGate().equals(info.getExitGate())) {
				if (this.getAmount().equals(info.getAmount())) {
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
