package mx.com.gm.mundopc;

public class Monitor {

    /**
     * ID Único del Monitor
     */
    private int idMonitor;

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

    }

    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{idMonitor=%d, brand='%s', size=%s, countMonitor=%d}".formatted(idMonitor, brand, size, countMonitor);
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
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
        this.countMonitor = countMonitor;
    }
}
