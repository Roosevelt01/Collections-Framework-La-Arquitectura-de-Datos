package Collections_Framework.Map.Ejercicio_6_Map_productos_precios;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Agregar 5 productos con su precio
        Map<String, Double> products = new HashMap<>();

        products.put("Laptop", 899.99);
        products.put("Mouse", 25.50);
        products.put("Teclado", 45.00);
        products.put("Monitor", 199.90);
        products.put("Auriculares", 59.95);

        // Imprimir todo el Map
        System.out.println("\nImprimir todo el map");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        //Mostrar el precio de un producto específico
        System.out.println("\nPrecio del mouse: "+products.get("Mouse"));

        //Verificar si un producto existe con containsKey()
        System.out.println("\n¿Existe el teclado?"+products.containsKey("Teclado"));

        // Calcular el precio total sumando todos los valores
        double precioTotal = 0;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            precioTotal += entry.getValue();
        }

        //Mostrar el tamaño final del mapa
        System.out.println("\nTamaño final del map: "+products.size());
    }
}
