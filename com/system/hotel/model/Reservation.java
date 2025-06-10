package com.system.hotel.model;
// Alt + Shift + S  and press R for getters and setters


import java.time.LocalDateTime;

public class Reservation {
	private static int incrementId = 1;
	
	private final String idReservation;
	private User user;
	private Room room;
	private ReservationStatus status;
	private LocalDateTime bookingDate;
	private int daysBooking;
	private LocalDateTime endBookingDate;
	
	public enum ReservationStatus {
	    PENDING,
	    CONFIRMED,
	    CANCELED,
	    COMPLETED
	}

	public Reservation(User user, Room room, ReservationStatus status,
			int daysBooking) {
		
		this.user = user;
		this.room = room;
		this.status = status;
		this.setBookingDate(LocalDateTime.now());
		this.daysBooking = daysBooking;
		this.setEndBookingDate(bookingDate.plusDays(daysBooking));
		
		this.idReservation = room.getIdRoom() + "-RES-" + user.getLastName() + "-" + incrementId++;
	}

	public String getIdReservation() {
		return idReservation;
	}

	public User getUser() {
		return user;
	}


	public Room getRoom() {
		return room;
	}


	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getDaysBooking() {
		return daysBooking;
	}


	public LocalDateTime getEndBookingDate() {
		return endBookingDate;
	}
	

	public void setEndBookingDate(LocalDateTime endBookingDate) {
		this.endBookingDate = endBookingDate;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", user=" + user + ", room=" + room + ", status="
				+ status + ", bookingDate=" + bookingDate + ", daysBooking=" + daysBooking + ", endBookingDate="
				+ endBookingDate + "]";
	}
	
}
