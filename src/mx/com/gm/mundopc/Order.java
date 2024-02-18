package mx.com.gm.mundopc;

public class Order {

    /**
     * ID Único de cada Order
     */
    private final int idOrder;

    /**
     * Contador Interno de la Clase incremental por cada instancia creada
     */
    public static int countOrder;

    /**
     * Cantidad de Computadoras por Order
     */
    public static int countComputers;

    /**
     * Número Máximo de Computadoras por Order
     */
    public static final int MAX_COMPUTERS = 10;

    /**
     * Array de Computadoras, con un máximo de 10
     */
    private final Computer[] computers;

    public Order() {
        this.idOrder = ++Order.countOrder;
        this.computers = new Computer[Order.MAX_COMPUTERS];
    }

    public void addComputer(Computer computer) {

        if (!this.checkQuantity()) {
            System.out.println("Se ha superado el Nº Máximo de productos por Order, que es: " + Order.MAX_COMPUTERS);
            return;
        }

        // Agregamos la computadora a la orden
        this.computers[Order.countComputers++] = computer;
    }

    /**
     * Comprueba que no se haya alcanzado el límite de productos por Order
     *
     * @return Retorna true si la cantidad de productos es inferior a 10
     */
    private boolean checkQuantity() {
        return Order.countComputers < Order.MAX_COMPUTERS;
    }

    /**
     * Muestra la orden con los productos que contiene
     */
    public void showOrder() {
        System.out.println("Orden #" + this.idOrder);
        System.out.println("Computadoras de la orden #" + this.idOrder);
        for (int i = 0; i < Order.countComputers; i++) {
            System.out.println(this.computers[i].toString());
        }
    }
}
