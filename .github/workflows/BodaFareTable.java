import java.util.Scanner;

public class BodaFareTable {
    public static void main(String[] args) {

        final double BASE_FARE = 2000;
        final double RATE_PER_KM = 1000;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter maximum distance in kilometres: ");
        int maxDistance = input.nextInt();

        System.out.println("\nBODA FARE TABLE");

        for (int distance = 1; distance <= maxDistance; distance++) {

            double fare = BASE_FARE + (RATE_PER_KM * distance);

            System.out.println(
                distance + " km = UGX " + fare
            );
        }

        input.close();
    }
}