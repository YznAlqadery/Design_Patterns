 public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        Transport truckTransport = transportFactory.createTransport("TRUCK");
        truckTransport.deliver();

        Transport shipTransport = transportFactory.createTransport("SHIP");
        shipTransport.deliver();

        Transport droneTransport = transportFactory.createTransport("DRONE");
        droneTransport.deliver();
    }
}