package com.subhash.parkingsystem.models;

/**
 * @author subhash
 *
 */

public class Gate {

	private Long id;
	private Short number;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Short getNumber() {
		return number;
	}
	public void setNumber(Short number) {
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!(obj instanceof Gate)) {
			return false;
		}
		Gate gate = (Gate) obj;
		if (this.getNumber().equals(gate.getNumber())) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.getNumber().hashCode();
	}
}
