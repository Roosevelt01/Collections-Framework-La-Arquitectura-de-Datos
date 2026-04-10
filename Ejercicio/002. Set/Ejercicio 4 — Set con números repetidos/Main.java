package Collections_Framework.List.Ejercicio2_ListNumeros;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Agregar 6 números enteros
        List<Integer> numbers = new ArrayList<>(
                List.of(7, 8, 8, 9, 10, 6)
        );

        // Imprimir toda la lista
        System.out.println("Lista: " + numbers);

        // Calcular la suma total de los números usando un for
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }

        System.out.println("La suma total de los números es: " + total);

        // Encontrar el número mayor
        int largestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        System.out.println("El número mayor es: " + largestNumber);

        // El tamaño final de la lista
        System.out.println("El tamaño final de la lista es: " + numbers.size());
    }
}