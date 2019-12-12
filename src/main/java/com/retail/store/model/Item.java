package com.retail.store.model;

public class Item {
    private final int itemId;
    private String name;
    private ItemType type;
    private long price;

    public Item(int itemId, String name, ItemType nongrocery, long price) {
	super();
	this.itemId = itemId;
	this.name = name;
	this.type = nongrocery;
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public ItemType getType() {
	return type;
    }

    public void setType(ItemType type) {
	this.type = type;
    }

    public long getPrice() {
	return price;
    }

    public void setPrice(long price) {
	this.price = price;
    }

    public int getItemId() {
	return itemId;
    }

}
