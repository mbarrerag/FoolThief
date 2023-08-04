# FoolThief


![Screenshot 2023-08-03 232143](https://github.com/mbarrerag/FoolThief/assets/101472701/036653f7-20ce-45c9-8837-f7d142a59e8d)
![Screenshot 2023-08-03 232223](https://github.com/mbarrerag/FoolThief/assets/101472701/b294ed88-5dbe-43e8-844a-c0c13ea082d5)



This project is a programming implementation that focuses on creating a system to analyze and provide timely information to citizens about theft incidents in Colombia, specifically in Bogotá. 
The program aims to assist users in making informed decisions regarding their routes and locations to minimize the risk of being victims of theft. 
The system utilizes various data structures and algorithms, along with a set of custom Java classes, to store and process the relevant information.

# Data Structures Used:

# Dynamic Array:
The dynamic array is used to store and manage the incidents of theft reported by citizens. It allows for efficient resizing and insertion of new incidents as they are reported. 
The dynamic array provides flexibility in handling a variable number of theft cases and allows for easy access and modification of the stored data.

# Double Linked List:
The double linked list is employed to organize and manage additional information related to the theft incidents. 
It provides a flexible structure to store details such as locations, hours, UPZS (Unité de Planification Urbaine), and other specific information about each incident.
The double linked list allows for efficient insertion, deletion, and traversal of the data.

# Stack:
The stack data structure is utilized to implement a history feature in the program.
It keeps track of the user's navigation within the system, allowing them to move back to previously accessed screens or information. 
The stack follows the Last-In-First-Out (LIFO) principle, ensuring that the most recent screen or information is readily accessible.

# Queue:
The queue data structure is employed to manage the priority of theft cases reported by citizens. 
It allows for orderly processing of incidents based on their urgency or severity. 
The queue ensures that each reported case is appropriately analyzed and addressed, following a First-In-First-Out (FIFO) approach.
