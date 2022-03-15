package com.blz.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Hotel hotel1 = hotelReservation.addHotel("Ridgewood", 5, 220, 100);
		Hotel hotelridgewood = new Hotel("ridgewood", 5, 220);
		Assert.assertEquals(hotelridgewood.getHotelName(), hotel1.getHotelName());
	}

	@Test
	public void givenHotelReating_WhenSizeMatches_ShoulReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Hotel hotel2 = hotelReservation.addHotel("Bridgewood", 4, 160, 110);
		Hotel hotelbridgewood = new Hotel("bridgewood", 4, 160);
		Assert.assertEquals(hotelbridgewood.getHotelName(), hotel2.getHotelName());
	}

	@Test
	public void givenRewardsCostemerDetails_WhenSizeMatches_ShoulReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Hotel hotel3 = hotelReservation.addHotel("Lakewood", 3, 110, 80);
		Hotel hotelLakewood = new Hotel("lakewood", 3, 110);
		Assert.assertEquals(hotelLakewood.getHotelName(), hotel3.getHotelName());
	}

}
