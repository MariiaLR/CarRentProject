import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EconomyCars chevrolet = new EconomyCars("Chevrolet Spark", "Gasoline ", "Automatic ");

        StandardClass mazda = new StandardClass("Mazda 6", "GAsoline", "Automatic");

        PremiumClass bmw = new PremiumClass("BMW X5", "Diesel", "Automatic");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1 for Economy class; 2 for Standard class; 3 for Premium class");
        int classCar = scanner.nextInt();
        if (classCar == 1) {
            chevrolet.price();
        } else if (classCar == 2) {
            mazda.price();
        } else if (classCar == 3) {
            bmw.price();
        };
        System.out.println();
        System.out.print("Proceed to rent?( y/n ): ");
        String dec = scanner.next();
        if (dec.equals("y")) {
            System.out.println("Enter your First Name: ");
            String fName = scanner.next();
            System.out.println("Enter your Second name");
            String sName = scanner.next();
            System.out.println("Enter your Middle Name");
            String mName = scanner.next();
            System.out.println("Enter your Driving Licence number");
            String drivingLicence = scanner.next();
            System.out.println("Enter delivery address");
            String deliveryAddress = scanner.next();
            System.out.println("Enter number of days for your booking");
            int duration = scanner.nextInt();
            System.out.println("Please check your reservation details:" + fName +", " + sName +", " +mName+", " +
                    drivingLicence +", " + deliveryAddress +", " + duration);
        } else if (dec.equals("n")) {
            System.out.println("We are waiting for your return: ");
            System.out.println();
        }



            }





    }


















