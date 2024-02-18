package mx.com.gm.mundopc;

public class MundoPC {

    public static void main(String[] args) {
        // Creación de Objetos Monitor
        Monitor monitorHP = new Monitor("HP", 13);
        Monitor monitorAcer = new Monitor("Acer", 15);
        Monitor monitorLG = new Monitor("LG", 17);
        Monitor monitorSamsung = new Monitor("Samsung", 21);

        // Creación de Objetos Keyboard
        Keyboard keyboardHP = new Keyboard("HP", "");
        Keyboard keyboardAcer = new Keyboard("Acer", "Bluetooth");
        Keyboard keyboardLG = new Keyboard("LG", "USB");
        Keyboard keyboardSamsung = new Keyboard("Samsung", "Bluetooth");

        // Creación de Objetos Mouse
        Mouse mouseHP = new Mouse("HP", "USB");
        Mouse mouseAcer = new Mouse("Acer", "Bluetooth");
        Mouse mouseLG = new Mouse("LG", "USB");
        Mouse mouseSamsung = new Mouse("Samsung", "Bluetooth");

        // Creación de Objetos Computer
        Computer computerHP = new Computer("HP", monitorHP, keyboardHP, mouseHP);
        Computer computerAcer = new Computer("Acer", monitorAcer, keyboardAcer, mouseAcer);
        Computer computerLG = new Computer("LG", monitorLG, keyboardLG, mouseLG);
        Computer computerSamsung = new Computer("Samsung", monitorSamsung, keyboardSamsung, mouseSamsung);

        // Creación de Objetos Order
        Order order1 = new Order();
        order1.addComputer(computerHP);
        order1.addComputer(computerAcer);
        order1.addComputer(computerLG);
        order1.addComputer(computerSamsung);
        order1.showOrder();
    }
}
