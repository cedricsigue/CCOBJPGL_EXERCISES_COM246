public class App {
    public static void main(String[] args) throws Exception {

        CarWash wash = new CarWash();

        // Polymorphic variable/object
        HybridVehicle car1 = new HybridSedan();
        car1.carName = "Hybrid Sedan";
        car1.chargebattery();
        car1.fillgas();
        wash.wash(car1);
        System.out.println(car1.carName);
        

        // Polymorphic variable/object
        HybridVehicle car2 = new HybridPickUp();
        car2.carName = "Hybrid PickUp";
        car2.chargebattery();
        car2.fillgas();
        wash.wash(car2);
        System.out.println(car2.carName);
        


    }
}
