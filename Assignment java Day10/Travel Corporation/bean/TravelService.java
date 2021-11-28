package com.travel.service;

import java.util.ArrayList;

import com.travel.bean.Travel;
import com.travel.bean.Passenger;

public interface TravelService {
	boolean checkForBusAvailibility(String source,String destination);
	ArrayList<Travel> listOfAllBus();
	ArrayList<Passenger> listOfAllPassenger();
	boolean addPassenger(Passenger passenger);
}
