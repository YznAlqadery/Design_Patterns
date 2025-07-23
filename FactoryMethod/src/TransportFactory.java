public class TransportFactory {

    public Transport createTransport(String type){
        if (type == null || type.isEmpty()) return null;


        switch (type){
            case "TRUCK" -> {
                return new Truck();
            }
            case "SHIP" -> {
                return new Ship();
            }
            case "DRONE" -> {
                    return new Drone();
            }
            default  -> {
                throw new IllegalArgumentException("Unknown notification type: " + type);
            }
        }
    }
}
