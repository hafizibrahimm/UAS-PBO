import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class test {
    private static List<Vehicle<String>> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Tambah data Bike");
            System.out.println("2. Tambah data Car");
            System.out.println("3. Lihat data");
            System.out.println("4. Hapus data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    tambahDataBike(scanner);
                    break;
                case 2:
                    tambahDataCar(scanner);
                    break;
                case 3:
                    lihatData();
                    break;
                case 4:
                    hapusData(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        }

        scanner.close();
    }

    private static void tambahDataBike(Scanner scanner) {
        scanner.nextLine(); // Consume newline

        System.out.print("Enter bike brand: ");
        String bikeBrand = scanner.nextLine();
        System.out.print("Enter number of wheels: ");
        int numOfWheels = scanner.nextInt();
        System.out.print("Enter bike speed limit: ");
        int bikeSpeedLimit = scanner.nextInt();

        Bike<String> myBike = new Bike<>(bikeBrand, numOfWheels, bikeSpeedLimit);
        vehicles.add(myBike);

        System.out.println("Data Bike berhasil ditambahkan!");
        System.out.println();
    }

    private static void tambahDataCar(Scanner scanner) {
        scanner.nextLine(); // Consume newline

        System.out.print("Enter car brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Enter number of doors: ");
        int numOfDoors = scanner.nextInt();
        System.out.print("Enter car speed limit: ");
        int carSpeedLimit = scanner.nextInt();

        Car<String> myCar = new Car<>(carBrand, numOfDoors, carSpeedLimit);
        vehicles.add(myCar);

        System.out.println("Data Car berhasil ditambahkan!");
        System.out.println();
    }

    private static void lihatData() {
        System.out.println("Data Bike:");
        for (Vehicle<String> vehicle : vehicles) {
            if (vehicle instanceof Bike) {
                Bike<String> bike = (Bike<String>) vehicle;
                System.out.println("Brand: " + bike.getBrand());
                System.out.println("Number of Wheels: " + bike.getNumOfWheels());
                System.out.println("Speed Limit: " + bike.getSpeedLimit());
                bike.ride();
                System.out.println();
            }
        }

        System.out.println("Data Car:");
        for (Vehicle<String> vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car<String> car = (Car<String>) vehicle;
                System.out.println("Brand: " + car.getBrand());
                System.out.println("Number of Doors: " + car.getNumOfDoors());
                System.out.println("Speed Limit: " + car.getSpeedLimit());
                car.drive();
                System.out.println();
            }
        }
    }
  
    private static void hapusData(Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter vehicle brand to delete: ");
        String brandToDelete = scanner.nextLine();
      
        boolean found = false;
        for (int i = vehicles.size() - 1; i >= 0; i--) {
            Vehicle<String> vehicle = vehicles.get(i);
            if (vehicle instanceof Bike) {
                Bike<String> bike = (Bike<String>) vehicle;
                if (bike.getBrand().equals(brandToDelete)) {
                    vehicles.remove(i);
                    found = true;
                }
            } else if (vehicle instanceof Car) {
                Car<String> car = (Car<String>) vehicle;
                if (car.getBrand().equals(brandToDelete)) {
                    vehicles.remove(i);
                    found = true;
                }
            }
        }
      
        if (found) {
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
        System.out.println();
    }
}
