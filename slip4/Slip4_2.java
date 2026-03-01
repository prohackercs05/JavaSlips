import java.util.*;

public class Slip4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> cityCodes = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add City and STD Code");
            System.out.println("2. Remove City");
            System.out.println("3. Search for City");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter City Name: ");
                    String city = sc.nextLine();
                    System.out.print("Enter STD Code: ");
                    String code = sc.nextLine();
                    if (cityCodes.containsKey(city)) {
                        System.out.println("Error: City already exists!");
                    } else {
                        cityCodes.put(city, code);
                        System.out.println("City added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter City Name to remove: ");
                    String rCity = sc.nextLine();
                    if (cityCodes.remove(rCity) != null) {
                        System.out.println("City removed successfully.");
                    } else {
                        System.out.println("Error: City not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter City Name to search: ");
                    String sCity = sc.nextLine();
                    String sCode = cityCodes.get(sCity);
                    if (sCode != null) {
                        System.out.println("STD Code for " + sCity + " is: " + sCode);
                    } else {
                        System.out.println("Error: City not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

/*
 * Explanation:
 * This program uses a HashMap to store city names as keys and their STD codes
 * as values.
 * A HashMap is chosen because it allows fast searching by key and ensures
 * unique keys (no duplicate cities).
 * The program runs in a loop, providing a menu for the user to select
 * operations.
 * i. Add: Uses containsKey() to check for duplicates before adding with put().
 * ii. Remove: Uses remove() to delete a city by its name.
 * iii. Search: Uses get() to retrieve the STD code associated with a city name.
 * The use of Scanner ensures interactive input from the user.
 */
