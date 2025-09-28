class Dishwasher extends Appliance {
    public Dishwasher() {
        super();
    }

    public Dishwasher(String brand, String model, String color) {
        super(brand, model, color);
    }

    @Override
    public String getType() { return "Посудомоечная машина"; }

    @Override
    public void info() {
        System.out.println("Посудомоечная машина моет посуду -> " + brand + " " + model + " " + color);
    }
}