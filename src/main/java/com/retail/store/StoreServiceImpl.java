package com.retail.store;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.retail.store.model.Item;
import com.retail.store.model.ItemType;

public class StoreServiceImpl implements StoreService {

    final static List<Item> nonGroceryItems = ItemConstant.getNonGroceryItem();
    final static List<Item> groceryItems = ItemConstant.getGroceryItem();

    @Override
    public long getTotalPriceForSelectedItems(String selectedItems, List<Item> items) {
	final List<Integer> itemIdList = Arrays.stream(selectedItems.split(",")).map(s -> Integer.parseInt(s.trim()))
		.collect(Collectors.toList());
	final long price = items.stream().filter(i -> itemIdList.contains(i.getItemId()))
		.collect(Collectors.summingLong(Item::getPrice));
	return price;
    }

    @Override
    public long getDiscountAsPerStorePolicy(long nonGroceryItemPrice, String discountOption) {
	final int appliedDiscountOption = Arrays.stream(discountOption.split(",")).map(s -> Integer.parseInt(s.trim()))
		.min(Integer::compare).get();
	System.out.println("Applied discount option: " + appliedDiscountOption);
	double discount = 0;
	switch (appliedDiscountOption) {
	case 1:
	    discount = nonGroceryItemPrice * .3;
	    break;
	case 2:
	    discount = nonGroceryItemPrice * .1;
	    break;
	case 3:
	    discount = nonGroceryItemPrice * .05;
	    break;
	}
	return (long) discount;
    }

    @Override
    public long getDiscountAsPerCurrentOffer(long totalPrice) {
	final long nundredCounts = totalPrice / 100;
	return nundredCounts * 5;
    }

    @Override
    public void printItemList(ItemType itemType) {
	List<Item> items = null;
	if (itemType.equals(ItemType.GROCERY)) {
	    items = groceryItems;
	} else {
	    items = nonGroceryItems;
	}
	for (final Item item : items) {
	    System.out.println(item.getItemId() + " " + item.getName() + " " + item.getPrice());
	}
	System.out.println("Please Use comma separated itemId to select items(e.g. 2,3). If you do not "
		+ "wish to add any item press 0");

    }

    @Override
    public long getFinalPrice(String selectedNonGroceryItems, String selectedGroceryItems, String discountOption) {
	final long nonGroceryItemPrice = getTotalPriceForSelectedItems(selectedNonGroceryItems, nonGroceryItems);
	final long groceryItemPrice = getTotalPriceForSelectedItems(selectedGroceryItems, groceryItems);
	final long discountPriceByPolicy = getDiscountAsPerStorePolicy(nonGroceryItemPrice, discountOption);
	final long discountPriceByOffer = getDiscountAsPerCurrentOffer(nonGroceryItemPrice + groceryItemPrice);
	System.out.println("\nNon-Grocery Items Price " + nonGroceryItemPrice);
	System.out.println("Grocery-Items Price " + groceryItemPrice);
	System.out.println("Discount Price by Store Policy " + discountPriceByPolicy);
	System.out.println("Discount Price by current Offer " + discountPriceByOffer);
	return nonGroceryItemPrice + groceryItemPrice - discountPriceByPolicy - discountPriceByOffer;
    }

}
