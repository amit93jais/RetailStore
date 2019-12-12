package com.retail.store;

import java.util.Arrays;
import java.util.List;

import com.retail.store.model.Item;
import com.retail.store.model.ItemType;

public class ItemConstant {
    public static List<Item> getNonGroceryItem() {
	final List<Item> nonGroceryItems = Arrays.asList(new Item(1, "Item1", ItemType.NONGROCERY, 80),
		new Item(2, "Item2", ItemType.NONGROCERY, 100), new Item(3, "Item3", ItemType.NONGROCERY, 200),
		new Item(4, "Item4", ItemType.NONGROCERY, 320), new Item(5, "Item5", ItemType.NONGROCERY, 250));
	return nonGroceryItems;
    }

    public static List<Item> getGroceryItem() {
	final List<Item> groceryItems = Arrays.asList(new Item(6, "Item1", ItemType.NONGROCERY, 70),
		new Item(7, "Item2", ItemType.NONGROCERY, 110), new Item(8, "Item3", ItemType.NONGROCERY, 230),
		new Item(9, "Item4", ItemType.NONGROCERY, 310), new Item(10, "Item5", ItemType.NONGROCERY, 240));
	return groceryItems;
    }
}
