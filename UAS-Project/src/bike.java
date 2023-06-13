final class Bike<T> implements Vehicle<T> {
    private final T brand;
    private final int numOfWheels;
    private final int speedLimit;

    public Bike(T brand, int numOfWheels, int speedLimit) {
        this.brand = brand;
        this.numOfWheels = numOfWheels;
        this.speedLimit = speedLimit;
    }

    @Override
    public T getBrand() {
        return brand;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    @Override
    public void displayData() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + numOfWheels);
        System.out.println("Speed Limit: " + speedLimit);
        ride();
        System.out.println();
    }

    public void ride() {
        System.out.println("Riding the bike with " + numOfWheels + " wheels.");
        System.out.println("Speed Limit is " + speedLimit + " km/h");
    }

    public String getSpeedLimit() {
        return null;
    }
}
