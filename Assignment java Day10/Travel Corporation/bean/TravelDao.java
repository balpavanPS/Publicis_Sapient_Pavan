package com.travel.dao;

import java.util.ArrayList;

import com.travel.bean.Travel;
import com.travel.bean.Passenger;

public interface TravelDao {
	ArrayList<Travel> listAllBus();
	ArrayList<Passenger> listAllPassenger();
	boolean checkAvailability(String source,String destination);
	int addPassenger(Passenger passenger);
}
