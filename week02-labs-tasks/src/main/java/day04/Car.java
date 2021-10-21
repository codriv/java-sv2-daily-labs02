package day04;

public class Car {
    private int amountOfGas;
    private int distance;

    public int getAmountOfGas() {
        return amountOfGas;
    }

    public int getDistance() {
        return distance;
    }

    public void setAmountOfGas(int amountOfGas) {
        this.amountOfGas = amountOfGas;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getConsumption() {
        return amountOfGas / ((double)distance / 100);
    }
}
