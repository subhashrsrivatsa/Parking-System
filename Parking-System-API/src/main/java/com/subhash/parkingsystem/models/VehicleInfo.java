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
}
