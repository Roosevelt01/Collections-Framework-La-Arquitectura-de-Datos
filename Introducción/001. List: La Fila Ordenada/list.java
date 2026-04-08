import java.util.ArrayList;
import java.util.List;
public class UsoDeList {
    public static void main(String[] args) {
        
        // 1. Crear la lista (Usamos ArrayList por su velocidad de lectura O(1))
        List<String> tareas = new ArrayList<>();

        // 2. add() -> Insertar elementos (mantienen este orden estricto)
        tareas.add("Aprender Java");
        tareas.add("Configurar Base de Datos");
        tareas.add("Aprender Java"); // ¡Se permite el duplicado!

        // 3. get() -> Leer por índice (empieza en 0)
        System.out.println("Tarea 0: " + tareas.get(0)); // Aprender Java

        // 4. set() -> Actualizar un dato en una posición específica
        tareas.set(1, "Configurar PostgreSQL"); 

        // 5. contains() -> ¿Existe este dato? (Devuelve true/false)
        boolean tieneJava = tareas.contains("Aprender Java");

        // 6. remove() -> Eliminar por índice o por valor
        tareas.remove(2); // Elimina el duplicado en la posición 2

        // 7. size() -> Tamaño total
        System.out.println("Total de tareas: " + tareas.size());

        System.out.println("\n--- Recorriendo con FOR tradicional ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ". " + tareas.get(i));
        }

        System.out.println("\n--- Recorriendo con FOR-EACH (Recomendado) ---");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}
