public class VehicleTest {
    public static void main(String[] args){
        Car car1 = new Car("Hyundai", "Sonata", 2016);
        Car car2 = new Car("Honda", "Civic", 2013);
        Truck truck1 = new Truck("Ford", "F150", 2005);
        Truck truck2 = new Truck("Toyota", "Tacoma", 2026);

        System.out.println("Vehicle Information\n-------------------");
        car1.displayInfo();
        car1.displayType();
        System.out.println();
        System.out.println("Vehicle Information\n-------------------");
        car2.displayInfo();
        car2.displayType();
        System.out.println();
        System.out.println("Vehicle Information\n-------------------");
        truck1.displayInfo();
        truck1.displayType();
        System.out.println();
        System.out.println("Vehicle Information\n-------------------");
        truck2.displayInfo();
        truck2.displayType();
        System.out.println();
        System.out.println(car1.getModel() + " with year: " + car1.getYear() + " is outdated.\n");
        car1.setYear(2026);
        System.out.println("Updated Vehicle Information\n-------------------");
        car1.displayInfo();
        car1.displayType();
    }
}
