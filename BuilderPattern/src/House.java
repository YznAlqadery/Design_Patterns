public class House {

    private String type;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    public House(String type, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden) {
        this.type = type;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
