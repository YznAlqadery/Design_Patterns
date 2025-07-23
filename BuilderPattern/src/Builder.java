public interface Builder {
    HouseBuilder setType(String type);
    HouseBuilder addGarage();
    HouseBuilder addSwimmingPool();
    HouseBuilder addGarden();
    House build();

}
