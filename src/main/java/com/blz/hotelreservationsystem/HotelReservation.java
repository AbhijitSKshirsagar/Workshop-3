package com.blz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservation {

	ArrayList<Hotel> hotelList = new ArrayList<>();

	public Hotel addHotel(String hotelName, int rating, double rewardsCustomerCost,
			double weekdayRateRegularCustermerCost) {

		Hotel hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotel.setRewardsCustomerCost(rewardsCustomerCost);
		hotel.setWeekDayRegularCustermerCost(weekdayRateRegularCustermerCost);
		hotelList.add(hotel);
		return hotel;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system");
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Ridgewood", 5, 220, 100);
		hotelReservation.addHotel("Bridgewood", 4, 160, 110);
		hotelReservation.addHotel("Lakewood", 3, 110, 80);
		hotelReservation.printHotelList();
	}

	private void printHotelList() {
		System.out.println(hotelList);
	}

}
