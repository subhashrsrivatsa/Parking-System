/**
 * 
 */
package com.subhash.parkingsystem.models;

/**
 * @author subhash
 *
 */
public class Vehicle {
	
	// Member variables of the class Vehicle 
	private Long vID;
	private String number;
	private VehicleType type;
	private VehicleInfo info;
	
	// Getter and Setter methods  for the member variables
	public Long getvID() {
		return vID;
	}
	public void setvID(Long vID) {
		this.vID = vID;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public VehicleInfo getInfo() {
		return info;
	}
	public void setInfo(VehicleInfo info) {
		this.info = info;
	}
	
}
