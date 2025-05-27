package Simulation;

import Environment.Island;

import java.util.Scanner;

public class IslandSimulator {
    public static void start()
    {
        IslandService islandService = new IslandService();
         Scanner scanner = new Scanner(System.in);
         int day = 1;
        System.out.println("Welcome to island simulator!");

         System.out.print("Enter the width of the island: ");
         int width = scanner.nextInt();

         System.out.print("Enter the length of the island: ");
         int height = scanner.nextInt();

         Island island = new Island(width, height);
         islandService.populateIsland(island);

         System.out.println("The simulation mode will last for a certain number of days");

         System.out.print("How many days have to the simulation last? ");
         int daysToEnd = scanner.nextInt();
        scanner.nextLine();

         System.out.println("The simulation will last for " + daysToEnd + " days. Every day, the animals move, eat, and reproduce.");

        while (day <= daysToEnd) {
            System.out.println("=== Day " + day + " ===");
            islandService.simulateDay(island);
            day++;

            if (day <= daysToEnd) {
                System.out.println("Press Enter to move to the next day...");
                while (scanner.hasNextLine()) {
                    if (scanner.nextLine().isEmpty()) {
                        break;
                    }
                }
            }
        }
         System.out.println("Simulation complete!");
         scanner.close();
    }
}
