package com.nsksoft.domain;

import org.springframework.beans.factory.annotation.Required;

public class Clothes {

	private String typesOfCloth;
	private String madeBy;
	private double price;
	private String size;

	public String getTypesOfCloth() {
		return typesOfCloth;
	}

	public void setTypesOfCloth(String typesOfCloth) {
		this.typesOfCloth = typesOfCloth;
	}

	public String getMadeBy() {
		return madeBy;
	}

	@Required
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public double getPrice() {
		return price;
	}

	@Required
	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	@Required
	public void setSize(String size) {
		this.size = size;
	}

}
