package ExpresionesLambda;

import Interfaces.IMensajero;

public class Main {

    public static void main(String[] args) {

        IMensajero lambdaMensajero = (String nombre, int edad) -> {
            System.out.println("Hola desde lambda" + nombre);
            System.out.println("La edad " + edad);
        };
        lambdaMensajero.emitirMensaje("Tavo", 27);
    }
}
