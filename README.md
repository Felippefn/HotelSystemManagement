# 🏨 Hotel Reservation System

## 🌐 Project Overview
This is a simple Hotel Reservation System designed to manage hotels, rooms, users, and reservations.  
The system allows users to search rooms by date, make or cancel reservations, and handle check-in/check-out processes.

## ✨ Features
- Manage hotels with details like name, location, description, contact info, and star rating.
- Manage rooms including type, price, amenities, and status.
- Manage users who make reservations.
- Create, update, and cancel reservations.
- Automatically generate unique IDs for hotels, rooms, and reservations.
- Handle reservation statuses: Pending, Confirmed, Canceled, Completed.
- Calculate booking duration and reservation end date based on start date and number of days.

## Project Structure
- **Hotel**: Represents hotels with properties and a list of rooms.
- **Room**: Represents hotel rooms with details such as type, price, and amenities.
- **User**: Represents system users/customers.
- **Reservation**: Represents bookings made by users for rooms, including booking dates and status.

## Technologies
- Java (with standard libraries)
- Object-oriented design principles

## How to Use
1. Create instances of `Hotel`, `Room`, and `User`.
2. Create `Reservation` objects by associating a `User` with a `Room` and specifying booking details.
3. Use provided getters/setters and methods to manage reservations and room availability.

## Next Steps / Enhancements
- Implement persistence using a database.
- Add user authentication and authorization.
- Add UI (console or web interface) for easier interaction.
- Implement availability checks and conflict resolution for overlapping bookings.
- Add payment and billing management.

## Author
Felippe

## License
- MIT License

