package com.system.hotel.model;


public class Room {

	private static int incrementId = 1;
    private String idRoom;
    private int roomNumber;
    private RoomType type;
    private RoomStatus status;
    private double price;
    private Boolean hasWifi;
    private int numBeds;
    private Boolean hasAc;
    private Hotel hotel;

    public Room(int roomNumber, RoomType type, double price, 
                Boolean hasWifi, int numBeds, RoomStatus status, 
                Boolean hasAc, Hotel hotel) {
		this.roomNumber = roomNumber;
		this.type = type;
		this.setPrice(price);
		this.hasWifi = hasWifi;
		this.numBeds = numBeds;
		this.setStatus(status);
		this.hasAc = hasAc;
		this.hotel = hotel;

        // Safe creation of idRoom after hotel is assigned
        char firstLetter = hotel.getName().charAt(0);
        this.idRoom = hotel.getId() + String.valueOf(firstLetter) + incrementId++;
    }

	public String getIdRoom() {
		return idRoom;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public enum RoomType {
	    SINGLE, DOUBLE, SUITE, FAMILY
	}

	public enum RoomStatus {
	    AVAILABLE, OCCUPIED, RESERVED, MAINTENANCE
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Boolean getHasWifi() {
		return hasWifi;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public Boolean getHasAc() {
		return hasAc;
	}


	public Hotel getHotel() {
		return hotel;
	}
	
	public RoomStatus getStatus() {
	    return status;
	}
	public RoomType getType() {
		return type;
	}

	public void setStatus(RoomStatus status) {
	    this.status = status;
	}
	public boolean isAvailable() {
	    return this.status == RoomStatus.AVAILABLE;
	}

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", roomNumber=" + roomNumber + ", type=" + type + ", status=" + status
				+ ", price=" + price + ", hasWifi=" + hasWifi + ", numBeds=" + numBeds + ", hasAc=" + hasAc + ", hotel="
				+ hotel + "]";
	}
}
