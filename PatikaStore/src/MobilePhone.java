public class MobilePhone extends Product {
    private int Storage;
    private double ScreenSize;
    private double Battery;
    private int Ram;
    private int Camera;
    private String Color;

    public MobilePhone(double price, double discount, int stock, String name, Brand brand, int storage, double screenSize, double battery, int ram, int camera, String color) {
        super(price, discount, stock, name, brand);
        this.Storage = storage;
        this.ScreenSize = screenSize;
        this.Battery = battery;
        this.Ram = ram;
        this.Camera = camera;
        this.Color = color;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        this.Storage = storage;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        this.ScreenSize = screenSize;
    }

    public double getBattery() {
        return Battery;
    }

    public void setBattery(double battery) {
        this.Battery = battery;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        this.Ram = ram;
    }

    public int getCamera() {
        return Camera;
    }

    public void setCamera(int camera) {
        this.Camera = camera;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
}