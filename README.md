# CS400
CS400 Team Project

This repo is created for CS400.This repo is used for X team and project.Design A Shopping Checklist Auto-Generator

Title: Design Aa Shopping Checklist Generator
 
X-Team Number:  x142
 
Team Members:  
 
	Luke Clair (lleclair@wisc.edu)
	John Li (zli769@wisc.edu)
	Samuel Bahr (sdbahr@wisc.edu)
	Jonathan Luong (jluong@wisc.edu)
 
Problem: 
Each time before a customer goes for shopping, he/she they may need to write down each item he/shethey needs. Moreover, customers hasve to decide the best store he/shethat they needs to go to based on the items he/shethat they wants for this week. My Our idea is to design a program to help a customer to make a decision shopping list and print display on a screen in smart phone. This may replace the easytape or a notepad for creating shopping lists.
 
Primary stakeholder: 
The people who need to go shopping in certain various stores may use our program. Our program can take the input of items that a customer wants, and compare the total prices (current stored in our back-end database) from each store. Then it would give the best store choice (based on price only for current version, maybe adding distance and merchandise quality in future) of store, and further print out a shopping checklist. With the printed checklist, customers can easily estimate the total amount he/shethey needs to pay and never miss anything. It can save the time of customers to find a pen/paper and write everything. Plus, it may help customers save money.
 
 
Graphical User interface: 
The GUI should include the selection of preferred stores, selection of product, and selection of how you want your output (pdf or word).

 
 
Data Structure: 
The data needsed from user input is the store selection and product selection. The data stored back-end should be a product class, with the attribute includeing the store name, product name, ID number, and price. HashMap or TreeMap would be ideal to store such data in Java, if not using JDBC connecting with back-endwith a back-end database.
 
 
Input Data File Format: 
Customers can select from the menu by entering the quantity after searching for an item (using the GUI) or use a prompt by using java input (System.in).
 
(Java input example where ID#1, 2, 3 are the ID numbers of products. The second argument to the add method is the quantity to add)
		list.add(ID#1, 1)
list.add(ID#2, 1)
list.add(ID#3, 3)
list.remove(ID#2)
list.print()
 
Output Example: 
Save results as a class (Checklist) and export as pdf

(Note that in this example the first store did not have the last two items in stock and thus, the user must go to a different store for those items)
 
Milestones:
It The program should include an interface for userfor the user to input his/hertheir preferred store name and preferred product. The classes should include a search class to generate all combinations of stores with all productproducts. It should include aA compare class to sort the returned list with the cheapest select coming first should also be included. Additionally, It should also include a a print class to print the current results to pdf or png for easy view is also needed.
 
Front end development using HTML/CSS to generate GUI for user to select
Using java to store data in back-end (if possible, using MySQL and JDBC), or a Product class which includes product name, store name, price in each store.
Develop a method to take customer input as selection and then go through all product list, and compute the product in which store is cheapest and return a new Class with the product and its name.
Export the optimized shopping list and print as a pdf for view. 

 
Assign tasks for each member: 
      
          	Luke will work on and finish  (2)
           	John will work on and finish (3)
		Samuel will work on and finish (1)
		Jonathan will work on and finish (4)

