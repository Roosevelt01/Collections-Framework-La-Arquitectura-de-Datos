package Collections_Framework.Box.Ejercicio_16_Filtrar_elementos_lista_generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> List<T> filtrar(List<T> list, T valor){
        List<T> result = new ArrayList<>();

        for(T lists : list){

            if(lists.equals(valor)){
                result.add(lists);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,2,4,2));

        System.out.println(filtrar(numbers, 2));
    }
}
