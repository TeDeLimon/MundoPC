package mx.com.gm.mundopc;

public class Mouse extends DispositivoEntrada {

    /**
     * ID Único de cada Mouse
     */
    private final int idMouse;

    /**
     * Contador Interno de la Clase incremental por cada instancia creada
     */
    public static int countMouse;

    /**
     * Constructor de la Clase Mouse
     *
     * @param marca Marca del dispositivo de entrada
     * @param tipoEntrada Tipo de entrada del periférico
     */
    public Mouse(String marca, String tipoEntrada) {

        //Constructor de la clase Padre
        super(tipoEntrada, marca);

        //Establecemos el ID único de cada Mouse
        this.idMouse = Mouse.countMouse++;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + ", " + super.toString() + "}";
    }
}

