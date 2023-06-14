interface Rideable {
    void ride();
}

interface Drivable {
    void drive();
}

interface Speed {
    int getSpeedLimit();
}

interface Tambah {
    void tambahData();
}
interface Tambah_Bike {
    void tambahDataBike();
}

interface Tambah_Car {
    void tambahDataCar();
}

interface Vehicle<T> {
    T getBrand();
    void displayData();
}


interface Lihat {
    void lihatData();
}

interface Hapus {
    void hapusData();
}

interface Keluar {
    void keluarAplikasi();
}


abstract class vehicle<T> implements Rideable, Drivable, Speed, Tambah, Lihat, Hapus, Keluar {
    private final T brand;

    public vehicle(T brand) {
        this.brand = brand;
    }

    public T getBrand() {
        return brand;
    }

    public void displayData() {
        System.out.println("Brand: " + getBrand());
    }
}
