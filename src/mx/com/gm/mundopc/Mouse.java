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
     * @param tipoEntrada Tipo de entrada del periférico
     * @param marca       Marca del dispositivo de entrada
     */
    public Mouse(String tipoEntrada, String marca) {

        //Constructor de la clase Padre
        super(tipoEntrada, marca);

        //Establecemos el ID único de cada Mouse
        this.idMouse = Mouse.countMouse++;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + "tipoEntrada='" + super.getTipoEntrada() + '\'' + ", marca='" + super.getMarca() + '\'' + "}";
    }
}

