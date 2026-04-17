package Collections_Framework.Box.Ejercicio_2_Método_generico;

public class Main {

    public static <T> void showValue(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        showValue("Java");
        showValue(123);
        showValue(15.5);
    }
}

