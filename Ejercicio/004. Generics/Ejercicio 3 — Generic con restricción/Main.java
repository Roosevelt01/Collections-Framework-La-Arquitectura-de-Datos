package Collections_Framework.Box.Ejercicio_3_Generic_con_restriccion;

public class Main {
    public static <T extends Comparable<T>> T max(T a, T b){
        if(a.compareTo(b) > 0){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(max(10,20));
        System.out.println(max("Ana","Luis"));
    }
}