

final class Car<T> implements Vehicle<T> {
    private final T brand;
    private final int numOfDoors;
    private final int speedLimit;

    public Car(T brand, int numOfDoors, int speedLimit) {
        this.brand = brand;
        this.numOfDoors = numOfDoors;
        this.speedLimit = speedLimit;
    }

    @Override
    public T getBrand() {
        return brand;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    @Override
    public void displayData() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Doors: " + numOfDoors);
        System.out.println("Speed Limit: " + speedLimit);
        drive();
        System.out.println();
    }

    public void drive() {
        System.out.println("Driving the car with " + numOfDoors + " doors.");
        System.out.println("Speed Limit is " + speedLimit + " km/h");
    }

    public String getSpeedLimit() {
        return null;
    }
}
