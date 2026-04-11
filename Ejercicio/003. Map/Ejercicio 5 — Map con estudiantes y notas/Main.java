+
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        //Agregar 5 estudiantes con sus respectivas notas usando put()
        students.put("Alejandro", 20);
        students.put("Jason", 10);
        students.put("Duhaa", 5);
        students.put("Arleth", 11);
        students.put("Emily", 17);

        //Imprimir todo el Map
        System.out.println("Impimir lista de estudiantes");
        students.forEach((llave,valor) -> {
            System.out.println("Nombres: "+ llave + " | Notas: "+ valor);
        });

        // Mostrar la nota de un estudiante específico usando get()
        System.out.println("\nNota de Arleth: " + students.get("Arleth"));

        // Verificar si un estudiante existe usando containsKey()
        System.out.println("\n¿Existe Arleth? " + students.containsKey("Arleth"));

        //Eliminar un estudiante usando remove()
        System.out.println("\nImprimir luego de eliminar un estudiante");
        students.remove("Emily");
        students.forEach((llave, valor) -> {
            System.out.println("Nombres: "+ llave + " | Notas: "+ valor);
        });

        //Mostrar el tamaño final del mapa
        System.out.println("\nTamaño final del mapa: "+students.size());
    }
}

