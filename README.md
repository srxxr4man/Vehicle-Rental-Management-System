# Vehicle Rental Management System

## About
A simple console-based Vehicle Rental Management System developed using Java. The project demonstrates object-oriented programming concepts through vehicle registration details and rental charge calculations.

## Features
- Supports cars, bikes, and electric vehicles.
- Accepts vehicle details through user input.
- Displays vehicle-specific information.
- Calculates total rental charges based on the number of rental days.
- Uses a menu-driven interface.

## OOP Concepts Used
- **Inheritance:** `Car`, `Bike`, and `ElectricVehicle` extend the `Vehicle` class.
- **Encapsulation basics:** Vehicle data and behavior are organized into classes.
- **Method Overriding:** Subclasses override methods inherited from `Vehicle`.
- **Polymorphism:** A `Vehicle` reference can hold objects of different vehicle subclasses.
- **Constructors:** Initialize vehicle properties.

## Technologies
- Java
- Java Scanner class
- Object-Oriented Programming

## How to Run

1. Install the Java Development Kit (JDK).
2. Clone or download this repository.
3. Open a terminal in the project folder.
4. Compile the program:

   `javac Inheritance.java`

5. Run the application:

   `java Inheritance`

## Rental Charge Calculation

Total Rental Charge = Daily Rental Charge × Number of Days

## Future Improvements
- Add vehicle availability tracking.
- Add customer details and booking management.
- Introduce different pricing rules for different vehicle types.
- Store rental records in a file or database.

## Author
Developed as a Java object-oriented programming project.
