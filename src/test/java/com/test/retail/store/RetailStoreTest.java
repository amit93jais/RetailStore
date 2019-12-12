package com.test.retail.store;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.retail.store.ItemConstant;
import com.retail.store.StoreService;
import com.retail.store.StoreServiceImpl;
import com.retail.store.model.Item;

public class RetailStoreTest {
    StoreService store = new StoreServiceImpl();
    final static List<Item> nonGroceryItems = ItemConstant.getNonGroceryItem();
    final static List<Item> groceryItems = ItemConstant.getGroceryItem();

    @Test
    public void test_getTotalPriceForSelectedItems_when_no_item_selected() {
	final String selectedItems = "0";
	final long totalPrice = store.getTotalPriceForSelectedItems(selectedItems, nonGroceryItems);
	assertEquals(0, totalPrice);
    }

    @Test
    public void test_getTotalPriceForSelectedItems_when_two_item_selected() {
	final String selectedItems = "2,3";
	final long totalPrice = store.getTotalPriceForSelectedItems(selectedItems, nonGroceryItems);
	assertEquals(300, totalPrice);
    }

    @Test
    public void test_getTotalPriceForSelectedItems_when_one_item_selected() {
	final String selectedItems = "2";
	final long totalPrice = store.getTotalPriceForSelectedItems(selectedItems, nonGroceryItems);
	assertEquals(100, totalPrice);
    }

    @Test
    public void test_getTotalPriceForSelectedItems_when_all_item_selected() {
	final String selectedItems = "1, 2, 3, 4, 5";
	final long totalPrice = store.getTotalPriceForSelectedItems(selectedItems, nonGroceryItems);
	assertEquals(950, totalPrice);
    }

    /*
     * If user is applicable for all the discount options(chosen all) but we have to
     * give only 1 percent discount which is max
     */
    @Test
    public void test_getDiscountAsPerStorePolicy_when_all_item_selected() {
	final String discountOption = "1, 2, 3";
	final long nonGroceryItemPrice = 300;
	final long discount = store.getDiscountAsPerStorePolicy(nonGroceryItemPrice, discountOption);
	assertEquals(90, discount);
    }

    @Test
    public void test_getDiscountAsPerStorePolicy_when_none_selected() {
	final String discountOption = "4"; // no discount option selected
	final long nonGroceryItemPrice = 300;
	final long discount = store.getDiscountAsPerStorePolicy(nonGroceryItemPrice, discountOption);
	assertEquals(0, discount);
    }

    /* Calculate discount per 100 5$ */
    @Test
    public void test_getDiscountAsPerCurrentOffer() {
	final long totalPrice = 340;
	final long discount = store.getDiscountAsPerCurrentOffer(totalPrice);
	assertEquals(15, discount);
    }

    @Test
    public void test_getDiscountAsPerCurrentOffer_when_0_price() {
	final long totalPrice = 0;
	final long discount = store.getDiscountAsPerCurrentOffer(totalPrice);
	assertEquals(0, discount);
    }

    @Test
    public void test_getFinalPrice() {
	final String selectedNonGroceryItems = "2,3";
	final String selectedGroceryItems = "8";
	final String discountOption = "1";
	final long finalPrice = store.getFinalPrice(selectedNonGroceryItems, selectedGroceryItems, discountOption);
	assertEquals(415, finalPrice);
    }

    @Test
    public void test_getFinalPrice_when_no_groceryItemSelected() {
	final String selectedNonGroceryItems = "2,3";
	final String selectedGroceryItems = "0";
	final String discountOption = "1";
	final long finalPrice = store.getFinalPrice(selectedNonGroceryItems, selectedGroceryItems, discountOption);
	assertEquals(195, finalPrice);
    }

    @Test
    public void test_getFinalPrice_when_no_discountOptionSelected() {
	final String selectedNonGroceryItems = "2,3";
	final String selectedGroceryItems = "8";
	final String discountOption = "4";
	final long finalPrice = store.getFinalPrice(selectedNonGroceryItems, selectedGroceryItems, discountOption);
	assertEquals(505, finalPrice);
    }

    @Test
    public void test_getFinalPrice_when_no_ItemSelected() {
	final String selectedNonGroceryItems = "0";
	final String selectedGroceryItems = "0";
	final String discountOption = "4";
	final long finalPrice = store.getFinalPrice(selectedNonGroceryItems, selectedGroceryItems, discountOption);
	assertEquals(0, finalPrice);
    }

}
