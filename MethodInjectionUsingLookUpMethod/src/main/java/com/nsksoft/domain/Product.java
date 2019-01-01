package com.nsksoft.domain;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	@Value(value = "Mobiles")
	private String productName;
	@Value(value = "Chaina")
	private String madeBy;
	private Order orderDetails;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public Order getOrderDetails() {
		return orderinformations();
	}

	@Lookup
	public Order orderinformations() {
		return new Order();
	}

	public void setOrderDetails(Order orderDetails) {
		this.orderDetails = orderDetails;
	}

}
