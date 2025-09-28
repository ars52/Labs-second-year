class Refrigerator extends Appliance {
    private static int fridgeCount = 0; 

    public Refrigerator() {
        super();
        fridgeCount++;
    }

    public Refrigerator(String brand, String model, String color) {
        super(brand, model, color);
        fridgeCount++;
    }

    public static int getFridgeCount() { return fridgeCount; }

    @Override
    public String getType() { return "Холодильник"; }

    @Override
    public void info() {
        System.out.println("Холодильник хранит продукты -> " + brand + " " + model + " " + color);
    }
}