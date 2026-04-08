import java.util.HashMap;
import java.util.Map;

public class UsoDeMap {
    public static void main(String[] args) {
        // Clave: String (Matrícula) -> Valor: String (Nombre)
        Map<String, String> estudiantes = new HashMap<>();

        // 1. put() -> Insertar o Actualizar
        estudiantes.put("A-123", "Alejandro");
        estudiantes.put("B-456", "Duhaa");
        
        // Si usamos una clave que ya existe, SOBREESCRIBE el valor
        estudiantes.put("B-456", "Duhaa (Actualizada)");

        // 2. get() -> Buscar por clave
        System.out.println("Estudiante A-123: " + estudiantes.get("A-123"));

        // 3. containsKey() -> Validar si existe la clave
        if (estudiantes.containsKey("Z-999")) {
            System.out.println("El estudiante Z existe");
        }

        // 4. remove() -> Eliminar a partir de la clave
        estudiantes.remove("A-123");

        // 5. entrySet() -> Recorrer pares clave-valor
        System.out.println("\nLista de Estudiantes:");
        for (Map.Entry<String, String> par : estudiantes.entrySet()) {
            System.out.println("Matrícula: " + par.getKey() + " | Nombre: " + par.getValue());
        }
    }
}


