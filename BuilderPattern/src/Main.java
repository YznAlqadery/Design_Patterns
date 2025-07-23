public class Main {

    public static void main(String[] args) {

        House villa = new HouseBuilder()
                .setType("Villa")
                .addGarage()
                .addSwimmingPool()
                .build();

        House apartment = new HouseBuilder()
                .setType("Apartment")
                .addGarden()
                .build();

        System.out.println(villa);
        System.out.println(apartment);
    }
}