package com.airplane.practic.logic;

public class Airplane {
     String city; // пункт призначення
     int flightNumber; // номер рейсу
     String airplaneType; // тип літака
     String departureTime; // час вильоту
     String sundayDays; //дні неділі

     public Airplane(String city, int flightNumber, String airplaneType, String departureTime, String sundayDays){
          this.city = city;
          this.flightNumber = flightNumber;
          this.airplaneType = airplaneType;
          this.departureTime = departureTime;
          this.sundayDays = sundayDays;
     }
     @Override
     public String toString() {
          return city + " "
                  + flightNumber + " "
                  + airplaneType + " "
                  + departureTime + " "
                  + sundayDays;
     }


     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public int getFlightNumber() {
          return flightNumber;
     }

     public void setFlightNumber(int flightNumber) {
          this.flightNumber = flightNumber;
     }

     public String getAirplaneType() {
          return airplaneType;
     }

     public void setAirplaneType(String airplaneType) {
          this.airplaneType = airplaneType;
     }

     public String getDepartureTime() {
          return departureTime;
     }

     public void setDepartureTime(String departureTime) {
          this.departureTime = departureTime;
     }

     public String getSundayDays() {
          return sundayDays;
     }

     public void setSundayDays(String sundayDays) {
          this.sundayDays = sundayDays;
     }
}
