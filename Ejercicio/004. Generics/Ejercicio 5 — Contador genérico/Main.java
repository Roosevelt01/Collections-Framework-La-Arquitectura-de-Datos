package Collections_Framework.Box.Ejercicio_14_Contador_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static <T> Map<T, Integer> contarElement(List<T> lista){
        Map<T, Integer> contador = new HashMap<>();

        for(T list: lista) {

            if (contador.containsKey(list)) {
                int valorActual = contador.get(list);

                contador.put(list, valorActual+1);
            } else {
                contador.put(list,1);
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,3,3));

        System.out.println(contarElement(numbers));
    }
}
