package Collections_Framework.List.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Agregar 5 nombres
        List<String> names = new ArrayList<>(List.of("Alejandro", "Duhaa", "Jason", "Arleth", "Thiago"));

        //2. Imprimir el primer nombre
        System.out.println("Primer nombre: "+names.get(0));

        //3. Cambiar uno de los nombres
        names.set(4, "Pedro");

        //4. Eliminar uno
        names.remove(3);

        System.out.println("Recorriendo toda la lista con un for");
        //5. Recorrer toda la lista con un for
        for(String name: names){
            System.out.println("- "+name);
        }

        //6. Mostrar el tamaño final
        System.out.println("El tamaño final: "+names.size());

    }
}
