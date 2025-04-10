                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
public class App {
    public static void main(String[] args) throws Exception {

                HybridVehicle car1 = new HybridSedan();
                car1.carName = "Tesla";

                HybridVehicle car2 = new HybridPickup();
                car2.carName = "Ford";

                car1.chargebattery();
                car1.fillgas();

                car2.chargebattery();
                car2.fillgas();
                
                carwash cw = new carwash();
                cw.wash(car1);
                cw.wash(car2);
    }
        }