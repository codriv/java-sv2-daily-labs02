package day04;

public class GasStation {

    int price;

    public GasStation() {
        price = 450;
    }

    public int tank(Car car, int gas) {
        car.setAmountOfGas(gas);
        return gas * price;
    }
}
