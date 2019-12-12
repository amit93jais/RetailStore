How the code can be run?

Step1: Build the project using command "mvn clean install"
Step2: Run the project as java application.
Step3:Follow the steps printed in console.
Note: 1. For Selecting a item use comma separated item's Id printed in console.
      2. If you do not want to select any item from the list use 0.
      
      
 Example of console Screen is attached Below:
      
								      ********** Welcome to Retail Store ********
								Current Offer: For every $100 on the bill, there would be a $5 discount 
								
								Please select the non-grocery item's you want to puchase:
								1 Item1 80
								2 Item2 100
								3 Item3 200
								4 Item4 320
								5 Item5 250
								Please Use comma separated itemId to select items(e.g. 2,3). If you do not wish to add any item press 0
								2,3
								
								Please select the grocery item's you want to purchase:
								6 Item1 70
								7 Item2 110
								8 Item3 230
								9 Item4 310
								10 Item5 240
								Please Use comma separated itemId to select items(e.g. 2,3). If you do not wish to add any item press 0
								8
								
								Please choose the following options for discount
								1.If you are employee
								If you are affiliate to our store
								If you are our custome from more than 2 years
								4.None of the ablove
								Note:This discount is not applicable on grocery items
								1,2
								Applied discount option: 1
								
								Non-Grocery Items Price 300
								Grocery-Items Price 230
								Discount Price by Store Policy 90
								Discount Price by current Offer 25
								
								Net Payable Amount: 415


How the Test case can be run?
Test case is written in  -> src/test/java folder
To run the test case run RetailStoreTest.java as junit.


How to run sonar report?
Step1.Run command "mvn sonar:sonar".
Step2:Now go to you http://localhost:9000. you would see the project report that you ran for.
      