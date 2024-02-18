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
     * @param marca Marca del dispositivo de entrada
     * @param tipoEntrada Tipo de entrada del periférico
     */
    public Keyboard(String marca, String tipoEntrada) {

        //Constructor de la clase Padre
        super(tipoEntrada, marca);

        //Establecemos el ID único de cada Mouse
        this.idKeyboard = Keyboard.countKeyboard++;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + this.idKeyboard + ", " + super.toString() + "}";
    }
}

