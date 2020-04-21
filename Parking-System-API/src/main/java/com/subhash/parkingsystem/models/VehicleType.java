/**
 * To store the type information of the Vehicle 
 */

package com.subhash.parkingsystem.models;

/**
 * @author subhash
 *
 */

public class VehicleType {
	
	private String normalCar;
	private String electricCar;
	
	public String getNormalCar() {
		return normalCar;
	}
	public void setNormalCar(String normalCar) {
		this.normalCar = normalCar;
	}
	public String getElecctricCar() {
		return electricCar;
	}
	public void setElecctricCar(String electricCar) {
		this.electricCar = electricCar;
	}

}
