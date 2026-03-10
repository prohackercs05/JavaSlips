import java.util.*;

public class S4_2 {
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
            sc.nextLine(); 

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


