package Collections_Framework.Box.Ejercicio_1_clase_generica_box;

public class Main {
    public static class Box<T>{
        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Box<String> textBox = new Box<>();
        textBox.setValue("Hello world");
        System.out.println(textBox.getValue());

        Box<Integer> numberBox = new Box<>();
        numberBox.setValue(12345);
        System.out.println(numberBox.getValue());
    }
}