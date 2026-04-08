import java.util.HashSet;
import java.util.Set;

public class UsoDeSet {
    public static void main(String[] args) {
        Set<Integer> codigosSecretos = new HashSet<>();

        // 1. add() y eliminación de duplicados
        codigosSecretos.add(101);
        codigosSecretos.add(205);
        codigosSecretos.add(101); // ¡IGNORADO!

        // 2. contains() -> Búsqueda instantánea O(1)
        if (codigosSecretos.contains(205)) {
            System.out.println("Acceso concedido al código 205");
        }

        // 3. remove() -> Aquí NO hay índices. Eliminas por valor exacto.
        codigosSecretos.remove(101);

        // 4. Recorrer elementos
        // Fíjate que NO podemos usar un for tradicional (i = 0) porque no hay get(i)
        System.out.println("Códigos activos:");
        for (Integer codigo : codigosSecretos) {
            System.out.println(codigo);
        }
    }
}