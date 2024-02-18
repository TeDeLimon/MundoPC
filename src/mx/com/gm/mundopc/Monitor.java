package mx.com.gm.mundopc;

public class Monitor {

    /**
     * ID Único del Monitor
     */
    private final int idMonitor;

    /**
     * Marca del Monitor
     */
    private String brand;

    /**
     * Tamaño pulgadas del Monitor
     */
    private double size;

    /**
     * Cantidad de monitores
     */
    private static int countMonitor;

    private Monitor() {
        this.idMonitor = ++Monitor.countMonitor;
    }

    /**
     * Public Constructor for Monitor
     * @param brand Marca del Monitor
     * @param size Tamaño pulgadas del Monitor
     */
    public Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{idMonitor=%d, brand='%s', size=%s, countMonitor=%d}".formatted(idMonitor, brand, size, countMonitor);
    }

    // Getters and Setters for the class Monitor

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getCountMonitor() {
        return countMonitor;
    }

    public void setCountMonitor(int countMonitor) {
        Monitor.countMonitor = countMonitor;
    }
}
