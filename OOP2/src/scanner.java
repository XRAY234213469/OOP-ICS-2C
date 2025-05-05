
import java.util.Scanner;
public class scanner {

    public static class GreetingExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the hour (0–23): ");
            int hour = scanner.nextInt();

            if (hour < 12) {
                System.out.println("Good morning!");
            } else {
                System.out.println("Good afternoon!");
            }

            scanner.close();
        }
    }
}





