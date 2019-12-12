package com.retail.store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.retail.store.model.ItemType;

public class StoreMain {

    public static void main(String[] args) throws IOException {
	final StoreService service = new StoreServiceImpl();
	final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("********** Welcome to Retail Store ********");
	System.out.println("Current Offer: For every $100 on the bill, there would be a $5 discount ");

	System.out.println("\nPlease select the non-grocery item's you want to puchase:");
	service.printItemList(ItemType.NONGROCERY);
	final String selectedNonGroceryItems = br.readLine();

	System.out.println("\nPlease select the grocery item's you want to purchase:");
	service.printItemList(ItemType.GROCERY);
	final String selectedGroceryItems = br.readLine();

	System.out.println(
		"\nPlease choose the following options for discount\n1.If you are employee\nIf you are affiliate to our store"
			+ "\nIf you are our custome from more than 2 years\n4.None of the ablove"
			+ "\nNote:This discount is not applicable on grocery items");
	final String selectedOption = br.readLine();

	final long finalPrice = service.getFinalPrice(selectedNonGroceryItems, selectedGroceryItems, selectedOption);
	System.out.println("\nNet Payable Amount: " + finalPrice);
    }

}
