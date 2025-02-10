import java.util.ArrayList;
import java.util.Scanner;

class News {
    String title;
    String details;
    String imagePath;

    public News(String title, String details, String imagePath) {
        this.title = title;
        this.details = details;
        this.imagePath = imagePath;
    }

    public void displayNews() {
        System.out.println("\n-----------------------------");
        System.out.println("Title: " + title);
        System.out.println("Details: " + details);
        System.out.println("Image Path: " + imagePath);
        System.out.println("-----------------------------\n");
    }
}

public class news_application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<News> newsList = new ArrayList<>();

        while (true) {
            System.out.println("\n> Select your choice");
            System.out.println("1. Add news details");
            System.out.println("2. List news");
            System.out.println("3. Exit app");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add news
                    System.out.print("\nEnter News Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter News Details: ");
                    String details = scanner.nextLine();
                    System.out.print("Enter Photo Path or URL: ");
                    String imagePath = scanner.nextLine();

                    newsList.add(new News(title, details, imagePath));
                    System.out.println("News added successfully!\n");
                    break;

                case 2:
                    // List news
                    if (newsList.isEmpty()) {
                        System.out.println("\nNo news available.\n");
                    } else {
                        System.out.println("\n------ News Feed ------");
                        for (News news : newsList) {
                            news.displayNews();
                        }

                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("\nExiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\nInvalid choice! Please try again.\n");
            }
        }
    }
}

