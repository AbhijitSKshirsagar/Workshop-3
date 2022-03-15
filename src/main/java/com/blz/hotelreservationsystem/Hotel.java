package com.blz.hotelreservationsystem;

/*
 * A hotel chain operating in Miami wishes to offer room reservation services over the internet. They
have three hotels in Miami: Lakewood, Bridgewood and Ridgewood. Each hotel has separate
weekday and weekend (Saturday and Sunday) rates. There are special rates for rewards customer
as a part of loyalty program. Each hotel has a rating assigned to it.

Ability to add Hotel in a Hotel
Reservation System with Name and
rates for Regular Customer
 */

public class Hotel {

	private String hotelName;
	private int rating;
	private double rewardsCustomerCost;
	private double weekDayRegularCustermerCost;

	// defoult constructor
	public Hotel() {
	}

	// parameterized constructore
	public Hotel(String hotelName, int rates, double regularCustomerCost) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekDayRegularCustermerCost = weekDayRegularCustermerCost;
		this.rewardsCustomerCost = rewardsCustomerCost;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getRewardsCustomerCost() {
		return rewardsCustomerCost;
	}

	public void setRewardsCustomerCost(double rewardsCustomerCost) {
		this.rewardsCustomerCost = rewardsCustomerCost;
	}

	public double getWeekDayRegularCustermerCost() {
		return weekDayRegularCustermerCost;
	}

	public void setWeekDayRegularCustermerCost(double weekDayRegularCustermerCost) {
		this.weekDayRegularCustermerCost = weekDayRegularCustermerCost;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", hotelNameweekDayRegularCustermerCost="
				+ weekDayRegularCustermerCost + ", rewardsCustomerCost=" + rewardsCustomerCost + "]";
	}

}
