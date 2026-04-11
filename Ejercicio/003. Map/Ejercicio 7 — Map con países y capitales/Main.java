package Collections_Framework.Map.Ejercicio_7_Map_países_capitales;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Agregar 5 países con sus capitales
        Map<String, String> countries  = new HashMap<>();

        //imprimir todo el mapa
        countries.put("España", "Madrid");
        countries.put("Francia", "París");
        countries.put("Japón", "Tokio");
        countries.put("Brasil", "Brasilia");
        countries.put("Canadá", "Ottawa");

        //Emprimir todo el mapa
        for(Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println("País: "+ entry.getKey() +" | Capital: "+ entry.getValue());
        }

        //Mostrar la capital de un país específico
        System.out.println("\nCapital de Brasil: "+countries.get("Brasil"));

        //Verificar si un país existe
        System.out.println("\n¿Existe Francia? "+countries.containsKey("Francia"));

        //Eliminar una entrada y si intentamos buscarlo ahora, nos devolverá null
        countries.remove("Canadá");

        //Emprimir todo el mapa luego de elimiar un país
        for(Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println("País: "+ entry.getKey() +" | Capital: "+ entry.getValue());
        }

        //Mostrar el tamaño final del mapa
        System.out.println("\nmostrar el tamaño final del mapa: "+countries.size());
    }
}
