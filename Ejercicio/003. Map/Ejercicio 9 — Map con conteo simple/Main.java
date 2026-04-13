package Collections_Framework.Map.Ejercicio_9_Map_Conteo_Simple;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"java","oop","java","list","java","map","oop"};

        Map<String, Integer> count = new HashMap<>();

        for(String word: words){
            if(!count.containsKey(word)){
                count.put(word,1);
            }else{
                int currentword = count.get(word);
                count.put(word, currentword+1);
            }
        }

        System.out.println("\n--- Conteo de Frecuencia de Palabras ---");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println("Palabra: [" + entry.getKey() + "] se repite: " + entry.getValue() + " veces.");
        }


    }
}
