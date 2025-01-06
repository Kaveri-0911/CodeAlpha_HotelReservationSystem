# 🌟Hotel Reservation System🌟

## Overview

The Hotel Reservation System is a simple console-based Java application that allows users to:

- Search for available rooms by category (e.g., Single, Double, Suite)
- Make reservations by selecting an available room
- View existing reservations
- Exit the application

This program simulates basic functionality for managing hotel room bookings and can be extended further for more advanced features such as date-based availability, cancellation, or integration with a payment gateway.

## ⚡Features

### 1. Room Categorization

- Rooms are categorized into Single, Double, and Suite
- Each room has a unique room number, price, and availability status

### 2. Search for Rooms

- Users can search for available rooms by entering a room category
- The system displays the details of all available rooms in the selected category

### 3. Make Reservations

- Users can reserve a room by entering their name and the desired room number
- Once a room is reserved, it is marked as unavailable

### 4. View Reservations

- Displays all reservations, including the reservation ID, guest name, and room details

## How to Run

Prerequisites:
- Java Development Kit (JDK) 8 or higher
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code) or terminal to run the program

Steps:
1. Download the source code file: HotelReservationSystem.java
2. Compile the program using the command:
3. Run the program using the command:
4. Follow the menu prompts in the console to interact with the application

## Classes Overview

### * Room
Represents a hotel room with attributes:
- room number
- category
- price
- availability status

### * Reservation
Represents a reservation with attributes:
- reservation ID
- guest name
- associated room

### * HotelReservationSystem
Contains the main logic of the program, including:
- Initialization of rooms
- Search, reservation, and viewing functionality
- Main menu loop

## Sample Usage

1. Search for Rooms
2. Make a Reservation
3. View Reservations
4. Exit
   
## Future Enhancements

- Add date-based availability for rooms
- Implement cancellation and modification of reservations
- Integrate a payment gateway for real transactions
- Create a graphical user interface (GUI) for better usability
- Add database integration for persistent storage of rooms and reservations

