package com.system.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static int incrementId = 1;

    private int id;
    private String name;
    private String location;
    private String description;
    private String contactInfo;
    private int stars; // Can be 1 to 5
    private List<Room> rooms;

    public Hotel(String name, String location, String description, String contactInfo, int stars) {
        this.id = incrementId++;
        this.name = name;
        this.location = location;
        this.description = description;
        this.contactInfo = contactInfo;
        this.stars = stars;
        this.rooms = new ArrayList<>();
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }
    
    @Override
    public String toString() {
        return  "=============\n" 
    + "Id: " + getId() 
    + "\nName: "  + getName() 
    + "\nLocation" + getLocation()
    + "\nDescription: " + getDescription()
    + "\nContact: " + getContactInfo()
    + "\nStars: " + getStars()
    + "\nNumber of Rooms: " + getRooms().size();
	}
}
