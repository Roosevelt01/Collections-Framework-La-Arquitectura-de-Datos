// 1. CLASE GENÉRICA SIMPLE
// La letra <T> significa "Type" (Tipo). Es un comodín que se define al instanciar.
class CajaMagica<T> {
    private T contenido;

    public void guardar(T contenido) { this.contenido = contenido; }
    public T sacar() { return contenido; }
}

public class UsoGenerics {
    // 2. MÉTODO GENÉRICO SIMPLE
    // Este método puede imprimir un Array de Strings, de Integers, de lo que sea.
    public static <T> void imprimirArray(T[] elementos) {
        for (T elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Uso de la Clase Genérica
        CajaMagica<String> cajaDeTexto = new CajaMagica<>();
        cajaDeTexto.guardar("Mi tesoro");
        
        CajaMagica<Double> cajaDeNumeros = new CajaMagica<>();
        cajaDeNumeros.guardar(99.99);

        // Uso del Método Genérico
        String[] nombres = {"Ana", "Luis"};
        Integer[] numeros = {1, 2, 3};
        imprimirArray(nombres); 
        imprimirArray(numeros);
    }
}