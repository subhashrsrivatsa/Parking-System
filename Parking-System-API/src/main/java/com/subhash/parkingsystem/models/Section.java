package com.subhash.parkingsystem.models;

import java.util.Set;

/**
 * @author subhash
 *
 */

public class Section {
	
	private Long id;
	private Short number;
	private Set<Slot> slots;
	
	
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
	public Set<Slot> getSlots() {
		return slots;
	}
	public void setSlots(Set<Slot> slots) {
		this.slots = slots;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!(obj instanceof Section)) {
			return false;
		}
		Section section = (Section) obj;
		if (this.getNumber().equals(section.getNumber())) {
			if (this.getSlots() == null && section.getSlots() == null) {
				return true;
			} else if (this.getSlots() == null && section.getSlots() != null) {
				return false;
			} else if (this.getSlots() != null && section.getSlots() == null) {
				return false;
			} else if (this.getSlots().equals(section.getSlots())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	

}
