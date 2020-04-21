/**
 * To store the Tariff information
 */
package com.subhash.parkingsystem.models;

import java.math.BigDecimal;

/**
 * @author subhash
 *
 */

public class Tariff {

	private Long id;
	private Double basicPeriod;
	private BigDecimal extendedBid;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getBasicPeriod() {
		return basicPeriod;
	}
	public void setBasicPeriod(Double basicPeriod) {
		this.basicPeriod = basicPeriod;
	}
	public BigDecimal getExtendedBid() {
		return extendedBid;
	}
	public void setExtendedBid(BigDecimal extendedBid) {
		this.extendedBid = extendedBid;
	}
	
}
