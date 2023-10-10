package com.airplane.practic.graficInterface;

import com.airplane.practic.logic.AirplaneManager;

import java.util.Scanner;

public class GraficInterface {
     public static void runner() {
          Scanner in = new Scanner(System.in);
          AirplaneManager airplaneManager = new AirplaneManager();

          int choice;

          do {
               System.out.println("Головне меню:");
               System.out.println("1: Пошук рейсів за містом призначення.");
               System.out.println("2: Пошук рейсів за днем неділі.");
               System.out.println("3: Пошук рейсів за днем неділі та годиною.");
               System.out.println("0: Вихід.");
               System.out.print("Оберіть дію: ");

               choice = in.nextInt();
               in.nextLine();

               switch (choice) {
                    case 1:
                         System.out.print("Введіть пункт призначення: ");
                         String destination = in.nextLine();
                         System.out.println("Список рейсів за містом призначення:");
                         printTableHeader();
                         airplaneManager.getFlightsByDestination(destination);
                         break;
                    case 2:
                         System.out.print("Введіть день неділі: ");
                         String sunday = in.nextLine();
                         System.out.println("Список рейсів за днем неділі:");
                         printTableHeader();
                         airplaneManager.getFlightsForSunday(sunday);
                         break;
                    case 3:
                         System.out.print("Введіть день неділі: ");
                         String sundayAndTime = in.nextLine();
                         System.out.print("Введіть час вильоту (години:хвилини): ");
                         String time = in.nextLine();
                         System.out.println("Список рейсів за днем неділі та годиною:");
                         printTableHeader();
                         airplaneManager.getSundayAndTimeFlights(sundayAndTime, time);
                         break;
                    case 0:
                         continue;
                    default:
                         System.out.println("Невірний вибір. Спробуйте ще раз.");
               }
          } while (choice != 0);
     }

     private static void printTableHeader() {
          System.out.printf("| %-10s | %-8s | %-15s | %-7s | %-10s |\n", "Пункт", "Номер", "Тип", "Час", "День");
          System.out.println("------------------------------------------------------------------");
     }
}