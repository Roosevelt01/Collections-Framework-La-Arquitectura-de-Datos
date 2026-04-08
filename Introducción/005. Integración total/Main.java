

import java.util.*;
// Excepción personalizada (Checked)
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) { super(message); }
}

public class SistemaUsuarios {

    public static void main(String[] args) {
        // 1. LIST + EXCEPCIONES: Recibimos datos crudos (con errores)
        List<String> correosCrudos = new ArrayList<>();
        correosCrudos.add("alex@dev.com");
        correosCrudos.add("duhaa@dev.com");
        correosCrudos.add("alex@dev.com"); // Duplicado
        correosCrudos.add("hacker_sin_arroba.com"); // Inválido

        // 2. SET + ELIMINACIÓN DE DUPLICADOS: Filtramos los válidos
        Set<String> correosLimpios = new HashSet<>();

        System.out.println("--- FASE 1: Validación y Limpieza ---");
        for (String correo : correosCrudos) {
            try {
                validarCorreo(correo);
                correosLimpios.add(correo); // El Set destruirá a los gemelos mágicamente
            } catch (InvalidEmailException e) {
                System.out.println("❌ Error detectado: " + e.getMessage());
            }
        }

        // 3. MAP + BÚSQUEDA POR CLAVE: Guardamos en "Base de Datos"
        Map<String, String> baseDeDatos = new HashMap<>();
        System.out.println("\n--- FASE 2: Guardado en Base de Datos ---");
        
        for (String correo : correosLimpios) {
            // Usamos el correo como Clave única, y un texto genérico como Valor
            baseDeDatos.put(correo, "Usuario Activo");
            System.out.println("✅ Guardado: " + correo);
        }

        // 4. Búsqueda y Manejo de Errores Unchecked (Si no existe)
        System.out.println("\n--- FASE 3: Búsqueda ---");
        buscarUsuario(baseDeDatos, "duhaa@dev.com");
        buscarUsuario(baseDeDatos, "fantasma@dev.com"); 
    }

    // Método que lanza una Excepción Checked
    public static void validarCorreo(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("El correo '" + email + "' no tiene @");
        }
    }

    // Método que combina Map con manejo de errores (try-catch interno)
    public static void buscarUsuario(Map<String, String> db, String emailBuscado) {
        try {
            if (!db.containsKey(emailBuscado)) {
                // Lanzamos una Unchecked Exception (RuntimeException de Java)
                throw new IllegalArgumentException("Usuario no encontrado en la BD.");
            }
            System.out.println("🔍 Búsqueda exitosa: " + emailBuscado + " -> " + db.get(emailBuscado));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Fallo en búsqueda (" + emailBuscado + "): " + e.getMessage());
        }
    }
}
