/**
 * To store the type information of the Parking Lots 
 */

package com.subhash.parkingsystem.models;

import java.util.Set;

/**
 * @author subhash
 *
 */

public class ParkingLot {

	private Long id;
	private Set<Section> sections;
	private Set<Gate> gates;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Section> getSections() {
		return sections;
	}
	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}
	public Set<Gate> getGates() {
		return gates;
	}
	public void setGates(Set<Gate> gates) {
		this.gates = gates;
	}
	
}
