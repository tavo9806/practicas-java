package ClaseAnonima;

import Interfaces.IAnimal;

public class ClaseAnonima {
    public static void main(String[] args) {

        IAnimal perro = new IAnimal() {
            @Override
            public void hacerSonido() {
                System.out.println("Woof woof");
            }
        }; // -> Limites de la clase anonima

        perro.hacerSonido(); // -> usar instancia....
    }

}
