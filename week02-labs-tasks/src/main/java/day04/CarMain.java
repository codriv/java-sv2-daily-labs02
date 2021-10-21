package day04;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation();

        car.setAmountOfGas(15);
        car.setDistance(245);
        System.out.println("Az autóban " + car.getAmountOfGas() + " liter üzemanyag volt, amivel " + car.getDistance() + " km-t tudott megtenni.");
        System.out.println("Az autó átlagfogyasztása így " + car.getConsumption() + " l/100km.");
        int newGas = 25;
        System.out.println("Ezután tankoltunk az autóba " + newGas + " liter üzemanyagot.");
        System.out.println("Az üzemanyag ára " + gasStation.price + " Ft/l. Így fizettünk " + gasStation.tank(car, newGas) + " Ft-ot.");
    }
}
