class VacuumCleaner extends Appliance {
    public VacuumCleaner() {
        super();
    }

    public VacuumCleaner(String brand, String model, String color) {
        super(brand, model, color);
    }

    @Override
    public String getType() { return "Пылесос"; }

    @Override
    public void info() {
        System.out.println("Пылесос убирает пол -> " + brand + " " + model + " " + color);
    }
}