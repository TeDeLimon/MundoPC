package mx.com.gm.mundopc;

public class Keyboard extends DispositivoEntrada {

    /**
     * ID Único de cada Keyboard
     */
    private final int idKeyboard;

    /**
     * Contador Interno de la Clase incremental por cada instancia creada
     */
    public static int countKeyboard;

    /**
     * Constructor de la Clase Keyboard
     *
     * @param tipoEntrada Tipo de entrada del periférico
     * @param marca       Marca del dispositivo de entrada
     */
    public Keyboard(String tipoEntrada, String marca) {

        //Constructor de la clase Padre
        super(tipoEntrada, marca);

        //Establecemos el ID único de cada Mouse
        this.idKeyboard = Keyboard.countKeyboard++;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + this.idKeyboard + "tipoEntrada='" + super.getTipoEntrada() + '\'' + ", marca='" + super.getMarca() + '\'' + "}";
    }
}

