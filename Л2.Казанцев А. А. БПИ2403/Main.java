public class Main {
    public static void main(String[] args) {

        Appliance a1 = new Refrigerator("Samsung", "2121r", "black");
        Appliance a2 = new Dishwasher("Bosch", "565ll", "red");
        Appliance a3 = new Refrigerator("LG", "54udf", "pink");
        Appliance a4 = new VacuumCleaner("Dyson", "styler", "orange");

        Appliance a5 = new Refrigerator();

        a1.info();
        a2.info();
        a3.info();
        a4.info();
        a5.info();

        System.out.println("Количество холодильников: " + Refrigerator.getFridgeCount());
    }
}
