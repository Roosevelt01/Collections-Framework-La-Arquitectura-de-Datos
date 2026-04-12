package Collections_Framework.Map.Ejercicio_8_Map_actualización_valores;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Agregar 4 empleados con sus salarios
        Map<String, Double> employees = new HashMap<>();

        employees.put("Ana García", 2500.0);
        employees.put("Luis Pérez", 1800.50);
        employees.put("María López", 3200.0);
        employees.put("Carlos Ruiz", 2100.75);

        // Imprimir para verificar
        System.out.println("Imprimir lista de empleados");
        for(Map.Entry<String, Double> entry : employees.entrySet()){
            System.out.println("Nombre: "+ entry.getKey()+ "| Sueldo: "+entry.getValue());
        }

        //Actualizar el salario de uno de los empleados usando put() con la misma clave
        employees.put("María López", 5200.0);

        // Imprimir luego de actualizar el salario de uno de los empleados
        System.out.println("\nImprimir luego de actualizar el salario de uno de los empleados");
        for(Map.Entry<String, Double> entry : employees.entrySet()){
            System.out.println("Nombre: "+ entry.getKey()+ "| Sueldo: "+entry.getValue());
        }

        //Mostrar el salario actualizado con get()
        System.out.println("\nEl salario actualizado: "+employees.get("María López"));

    }
}
