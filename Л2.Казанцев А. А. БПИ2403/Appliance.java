abstract class Appliance {
    protected String brand;
    protected String model;
    protected String color;

    public Appliance() {
        this.brand = "NnBrand";
        this.model = "NnModel";
        this.color = "NnColor";
    }

    public Appliance(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }

    public abstract String getType();

    public void info() {
        System.out.println(getType() + ": " + brand + " " + model + " " + color);
    }
}