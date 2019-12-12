package com.retail.store;

import java.util.List;

import com.retail.store.model.Item;
import com.retail.store.model.ItemType;

public interface StoreService {
    long getTotalPriceForSelectedItems(String selectedItems, List<Item> items);

    long getDiscountAsPerStorePolicy(long nonGroceryItemPrice, String discountOption);

    long getDiscountAsPerCurrentOffer(long totalPrice);

    void printItemList(ItemType itemType);

    long getFinalPrice(String selectedNonGroceryItems, String selectedGroceryItems, String discountOption);
}
