package mx.com.gm.mundopc;

public class DispositivoEntrada {

    /**
     * Tipo de entrada del periférico
     */
    private String tipoEntrada;

    /**
     * Marca del dispositivo de entrada
     */
    private String marca;

    /**
     * Public Constructor
     * @param tipoEntrada
     * @param marca
     */
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada='" + tipoEntrada + '\'' + ", marca='" + marca + '\'' + '}';
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    /**
     * @param tipoEntrada Establece el Tipo de entrada del periférico
     */
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    /**
     * @param marca Establece la marca del dispositivo de entrada
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
