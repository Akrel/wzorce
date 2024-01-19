package org.example.structural.adapter;

/***
 * Wzorzec Adaptera (ang. Adapter Pattern) to strukturalny wzorzec projektowy, który umożliwia współpracę dwóch klas o różnych interfejsach poprzez dostosowanie
 * interfejsu jednej z nich do interfejsu drugiej. Jest to szczególnie użyteczne, gdy chcemy użyć istniejącej klasy, ale jej interfejs nie spełnia wymagań naszego systemu.
 *
 * Struktura wzorca Adaptera:
 * 1. Cel (Target): To jest interfejs, który klient chce używać. Wzorzec Adaptera umożliwia dostosowanie obiektu do tego interfejsu.
 * 2. Adaptowany obiekt (Adaptee): To jest istniejący obiekt, którego interfejs nie spełnia wymagań klienta.
 * 3. Adapter: Jest to klasa, która implementuje interfejs celu i jednocześnie zawiera obiekt adaptowany. Adapter przekształca wywołania metod interfejsu celu na wywołania metod adaptowanego obiektu.
 */
public class Main {
    public static void main(String[] args) {
        KlasaKwadrat klasaKwadrat = new KlasaKwadrat();
        InterfejsProstokat adapter = new AdapterKwadrat(klasaKwadrat);

        int pole = adapter.obliczPoleProstokata(5, 10);
        System.out.println("Pole prostokąta: " + pole);
    }
}