public class Notebook extends Product {
    private int Ram;
    private int Storage;
    private double ScreenSize;

    public Notebook(double price,double discount,int stock,String name,Brand brand,int ram,int storage,double screenSize) {
        super(price,discount,stock,name,brand);
        this.Ram = ram;
        this.Storage = storage;
        this.ScreenSize=screenSize;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        this.Ram = ram;
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
}