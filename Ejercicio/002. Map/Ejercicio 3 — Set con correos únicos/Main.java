package Collections_Framework.Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>(List.of(
                        "rodriguez299@gmail.com",
                        "martinez47@gmail.com",
                        "jason229@gmail.com",
                        "martinez47@gmail.com",
                        "rodriguez299@gmail.com",
                        "ada225@gmail.com"
                )
        );

        // Imprimir todo el Set
        System.out.println("Correos únicos:");
        for (String email : emails) {
            System.out.println(email);
        }

        // Verificar si un correo existe
        System.out.println("\n¿Existe jason229@gmail.com? " + emails.contains("jason229@gmail.com"));

        // Eliminar un correo
        emails.remove("martinez47@gmail.com");

        // Recorrer todo el Set con un for
        System.out.println("\nCorreos después de eliminar uno:");
        for (String email : emails) {
            System.out.println(email);
        }

        // Mostrar tamaño final
        System.out.println("\nTamaño real: " + emails.size());
    }
}
