import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TransportFactory transportFactory = new TransportFactory();

        System.out.print("Enter the delivery method (Truck, Ship, Drone): ");
        String deliveryMethod = scanner.nextLine();


        Transport transport = transportFactory.createTransport(deliveryMethod.toUpperCase());
        transport.deliver();

        scanner.close();

    }
}