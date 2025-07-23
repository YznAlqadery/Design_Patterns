public class HouseBuilder implements Builder{
    private String type;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    @Override
    public HouseBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public HouseBuilder addGarage() {
        this.hasGarage = true;
        return this;
    }

    @Override
    public HouseBuilder addSwimmingPool() {
        this.hasSwimmingPool = true;
        return this;
    }

    @Override
    public HouseBuilder addGarden() {
        this.hasGarden = true;
        return this;
    }

    @Override
    public House build() {
        return new House(type,hasGarage,hasSwimmingPool,hasGarden);
    }
}
