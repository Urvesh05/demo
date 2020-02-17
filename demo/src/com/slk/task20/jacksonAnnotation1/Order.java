package com.slk.task20.jacksonAnnotation1;

import java.util.List;

public class Order {

	
	private int orderId;
	private List<Integer>itemIds;
	private Customer customer;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Integer> getItemIds() {
		return itemIds;
	}
	public void setItemIds(List<Integer> itemIds) {
		this.itemIds = itemIds;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemIds=" + itemIds + ", customer=" + customer + "]";
	}
	
}
