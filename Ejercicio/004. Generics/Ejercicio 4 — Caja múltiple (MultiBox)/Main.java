package Collections_Framework.Box.Ejercicio_4_MultiBox;

public class Main {
    public static void main(String[] args) {
        MultiBox<String> language = new MultiBox<>();
        language.add("Java");
        language.add("Python");

        System.out.println("Todos los lenguajes de programación: " + language.getAll());
        System.out.println("Existe la palabra Java? "+ language.contain("Java"));

        MultiBox<Integer> numbers = new MultiBox<>();
        numbers.add(4);
        numbers.add(16);

        System.out.println("Números: " + numbers.getAll());
    }
}
