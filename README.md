# CS400
CS400 COURSE

This repo is created for CS400.
This repo is used for X team and project.
Design A Shopping Checklist Auto-Generator

Problem
Each time before customer goes for shopping, he/she may need to write down each item he/she needs. Moreover, customer has to decide the best store he/she needs to go based on the items he/she wants for this week. My idea is to design a program to help customer to make a decision and print a screen in smart phone. This may replace the estape or notepad.

Primary stakeholder
The people who need to go shopping in certain stores may use our program. Our program can take the input of items custom wants, and compare the total prices (current stored in our back-end database) from each store. Then it would give the best choice (based on price only for current version, maybe adding distance and merchandise quality in future) of store, and further print out a checklist. With the printed checklist, customer can easily estimate the total amount he/she needs to pay and never miss anything. It can save the time of customer to find a pen/paper and write everything. Plus, it may help customer save money.

Graphical User interface (GUI)
The GUI should include the selection of preferred stores, selection of product, and selection of how you want your output (pdf or word).

Data
The data needs from user input is the store selection and product selection. The data stored back-end should be a product class, with the attribute include store name, product name and price. 

Class (Type) Summary
It should include an interface for user to input his/her preferred store name and preferred product. The classes should include a search class to generate all combination of stores with all product. It should include a compare class to sort the returned list with the cheapest select coming first. It should also include a print class to print the current results to pdf or png for easy view.

