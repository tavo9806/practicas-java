package ExpresionesLambda;

import Interfaces.IMensajero;
import Interfaces.IOperacion;

public class Main {

    public static void main(String[] args) {

        IMensajero lambdaMensajero = (String nombre, int edad) -> {
            System.out.println("Hola desde lambda" + nombre);
            System.out.println("La edad " + edad);
        };
        lambdaMensajero.emitirMensaje("Tavo", 27);

        //Fn anonima
        IOperacion suma = new IOperacion() {
            @Override
            public int operar(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Suma anónima: " + suma.operar(2,2));

        //Lambdas
        IOperacion operacion = (int a, int b) -> a + b;
        System.out.println("Suma desde lambda: " + operacion.operar(2,2));
    }
}
