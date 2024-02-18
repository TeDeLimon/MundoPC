package mx.com.gm.mundopc;

public class Computer {
    /**
     * ID Único de cada Computadora
     */
    private final int idComputer;
    /**
     * Nombre de la Computadora
     */
    private String name;
    /**
     * Monitor de la Computadora
     */
    private Monitor monitor;
    /**
     * Teclado de la Computadora
     */
    private Keyboard keyboard;
    /**
     * Mouse de la Computadora
     */
    private Mouse mouse;
    /**
     * Contador Interno de la Clase incremental por cada instancia creada
     */
    private static int countComputer;

    /**
     * Constructor Privado de la Clase Computer
     */
    private Computer() {
        this.idComputer = ++Computer.countComputer;
    }

    /**
     * Constructor Público de la Clase Computer
     * @param name Nombre de la computadora
     * @param monitor Monitor de la computadora (Clase Monitor)
     * @param keyboard Teclado de la computadora (Clase Keyboard)
     * @param mouse Mouse de la computadora (Clase Mouse)
     */
    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" + "idComputer=" + idComputer + ", name='" + name + '\'' + ", monitor=" + monitor + ", keyboard=" + keyboard + ", mouse=" + mouse + '}';
    }

    // Getters and Setters for the class Computer

    public int getIdComputer() {
        return idComputer;
    }

    public String getName() {
        return name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
