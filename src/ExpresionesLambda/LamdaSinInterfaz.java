package ExpresionesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaSinInterfaz {

    public static void main(String[] args) {

        /*
                Predicate<T>: devuelve boolean → (x) -> x > 5
                Function<T, R>: transforma T en R → (x) -> x.toString()
                Consumer<T>: no devuelve nada → (x) -> System.out.println(x)
                Supplier<T>: no recibe nada, devuelve T → () -> 42
        */

        // Probar si el numero es par
        Predicate<Integer> esPar = x -> x % 2 == 0;
        System.out.println(esPar.test(3));
        System.out.println(esPar.test(4));

        // Maniplar Strings
        Function<String, String> cadena = x -> x.toUpperCase();
        System.out.println(cadena.apply("hola mundo"));

        // Largo de la cadena
        Function<String, Integer> cadena2 = x -> x.length();
        System.out.println(cadena2.apply("hola hola hola"));

        //Imprimir
        // Arrays.asList() -> permite agregar valores quemados SOLO LECTURA
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> imprime = x-> System.out.println("Numero: " + x);
        numeros.forEach(imprime); // forEach esta en las colecciones para recorrer
        //numeros.forEach(numero -> System.out.println(numero)); -> Progra funcional

        //Generar numero aleatorio
        //Supplier<Integer> random = () -> (int)(Math.random() * 101); // 0 to 100;
        Supplier<Integer> random = () -> new Random().nextInt(101);
        System.out.println(random.get()); // get() obtiene el valor generado de Supplier

        // TODO resolver ejercicios 
    }

}
