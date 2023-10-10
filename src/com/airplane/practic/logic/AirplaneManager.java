package com.airplane.practic.logic;

import java.util.Scanner;

public class AirplaneManager {
     private static Airplane[] airplaneArrays;

     public AirplaneManager(){
          airplaneArrays = new Airplane[31];

          airplaneArrays[0] = new Airplane("Мукачево", 101, "Пасажирський", "10:50", "Понеділок");
          airplaneArrays[1] = new Airplane("Львів", 102, "Приватний", "12:30", "Вівторок");
          airplaneArrays[2] = new Airplane("Київ", 103, "Пасажирський", "14:15", "Середа");
          airplaneArrays[3] = new Airplane("Одеса", 104, "Вантажний", "16:00", "Четвер");
          airplaneArrays[4] = new Airplane("Мукачево", 105, "Пасажирський", "18:45", "П'ятниця");
          airplaneArrays[5] = new Airplane("Харків", 106, "Приватний", "20:20", "Субота");
          airplaneArrays[6] = new Airplane("Львів", 107, "Пасажирський", "10:30", "Неділя");
          airplaneArrays[7] = new Airplane("Київ", 108, "Пасажирський", "12:15", "Понеділок");
          airplaneArrays[8] = new Airplane("Мукачево", 109, "Вантажний", "14:00", "Вівторок");
          airplaneArrays[9] = new Airplane("Одеса", 110, "Пасажирський", "15:45", "Середа");
          airplaneArrays[10] = new Airplane("Харків", 111, "Приватний", "17:30", "Четвер");
          airplaneArrays[11] = new Airplane("Львів", 112, "Пасажирський", "19:15", "П'ятниця");
          airplaneArrays[12] = new Airplane("Київ", 113, "Пасажирський", "21:00", "Субота");
          airplaneArrays[13] = new Airplane("Мукачево", 114, "Вантажний", "22:45", "Неділя");
          airplaneArrays[14] = new Airplane("Мукачево", 115, "Пасажирський", "11:30", "Вівторок");
          airplaneArrays[15] = new Airplane("Одеса", 116, "Пасажирський", "13:15", "Середа");
          airplaneArrays[16] = new Airplane("Львів", 117, "Приватний", "15:00", "Четвер");
          airplaneArrays[17] = new Airplane("Київ", 118, "Вантажний", "17:45", "П'ятниця");
          airplaneArrays[18] = new Airplane("Харків", 119, "Пасажирський", "19:30", "Субота");
          airplaneArrays[19] = new Airplane("Одеса", 120, "Приватний", "21:15", "Неділя");
          airplaneArrays[20] = new Airplane("Мукачево", 121, "Пасажирський", "23:00", "Понеділок");
          airplaneArrays[21] = new Airplane("Київ", 122, "Пасажирський", "10:30", "Вівторок");
          airplaneArrays[22] = new Airplane("Львів", 123, "Вантажний", "12:15", "Середа");
          airplaneArrays[23] = new Airplane("Мукачево", 124, "Пасажирський", "14:00", "Четвер");
          airplaneArrays[24] = new Airplane("Харків", 125, "Приватний", "15:45", "П'ятниця");
          airplaneArrays[25] = new Airplane("Одеса", 126, "Пасажирський", "17:30", "Субота");
          airplaneArrays[26] = new Airplane("Київ", 127, "Пасажирський", "19:15", "Неділя");
          airplaneArrays[27] = new Airplane("Мукачево", 128, "Вантажний", "21:00", "Понеділок");
          airplaneArrays[28] = new Airplane("Львів", 129, "Пасажирський", "22:45", "Вівторок");
          airplaneArrays[29] = new Airplane("Київ", 130, "Пасажирський", "11:30", "Середа");
          airplaneArrays[30] = new Airplane("Одеса", 131, "Приватний", "13:15", "Четвер");
     }
     public void getFlightsByDestination(String destination){ // пошук за містом призначення
          for (Airplane airplane: airplaneArrays) {
               if(airplane.getCity().equals(destination)){
                    System.out.printf("| %-10s | %-8d | %-15s | %-7s | %-10s |\n", airplane.getCity(), airplane.getFlightNumber(),
                            airplane.getAirplaneType(), airplane.getDepartureTime(), airplane.getSundayDays());
               }
          }
     }
     public void getFlightsForSunday(String sunday) { // пошук за днем
          for (Airplane airplane : airplaneArrays) {
               if (airplane.getSundayDays().equals(sunday)) {
                    System.out.printf("| %-10s | %-8d | %-15s | %-7s | %-10s |\n", airplane.getCity(), airplane.getFlightNumber(),
                            airplane.getAirplaneType(), airplane.getDepartureTime(), airplane.getSundayDays());
               }
          }
     }
     public void getSundayAndTimeFlights(String sundayAndTime, String time) { //пошук за днем і годиною
          String[] timeParts = time.split(":");
          int hours = Integer.parseInt(timeParts[0]);
          int minutes = Integer.parseInt(timeParts[1]);

          for (Airplane airplane : airplaneArrays) {
               if (airplane.getSundayDays().equals(sundayAndTime)) {

                    String[] departureTimeParts = airplane.getDepartureTime().split(":");
                    int departureHours = Integer.parseInt(departureTimeParts[0]);
                    int departureMinutes = Integer.parseInt(departureTimeParts[1]);

                    if (departureHours > hours || (departureHours == hours && departureMinutes > minutes)) {
                         System.out.printf("| %-10s | %-8d | %-15s | %-7s | %-10s |\n", airplane.getCity(), airplane.getFlightNumber(),
                                 airplane.getAirplaneType(), airplane.getDepartureTime(), airplane.getSundayDays());
                    }
               }
          }
     }
}
