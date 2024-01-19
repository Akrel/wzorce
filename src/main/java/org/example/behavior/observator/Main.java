package org.example.behavior.observator;
/***
 * Wzorzec Obserwator (ang. Observer) to wzorzec projektowy behawioralny, który definiuje zależność jeden do wielu między obiektami w taki sposób,
 * że gdy jeden obiekt zmienia swój stan, wszyscy zależni obserwatorzy są automatycznie powiadamiani i aktualizowani. Wzorzec ten umożliwia uniezależnienie
 * obiektu od jego obserwatorów, co pozwala na elastyczne i luźne powiązania między komponentami systemu.
 *
 * Główne cele wzorca Obserwator:
 * 1. Uniezależnienie obserwatorów od obiektu obserwowanego: Obserwatorzy nie muszą znać wewnętrznej struktury ani implementacji obiektu obserwowanego.
 * 2. Możliwość dodawania i usuwania obserwatorów w czasie rzeczywistym: Wzorzec ten umożliwia dynamiczne zarządzanie zależnościami.
 * 3. Powiadamianie obserwatorów o zmianach: Obserwatorzy są automatycznie informowani, gdy obiekt obserwowany zmienia swój stan.
 *
 * Struktura wzorca Obserwator:
 * 1. Obserwowany (Subject): Definiuje interfejs do dodawania, usuwania i powiadamiania obserwatorów.
 * 2. Konkretny Obserwowany (Concrete Subject): Implementuje interfejs Obserwowanego, utrzymuje listę obecnych obserwatorów oraz powiadamia ich o zmianach stanu.
 * 3. Obserwator: Definiuje interfejs do odbierania powiadomień o zmianach w obiekcie obserwowanym.
 * 4. Konkretny Obserwator (Concrete Observer): Implementuje interfejs Obserwatora, przechowuje referencję do obiektu obserwowanego oraz reaguje na powiadomienia o zmianach.
 */

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Dodawanie obserwatorów
        Display display1 = new Display();
        Display display2 = new Display();
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Ustawianie nowej temperatury powoduje powiadomienie obserwatorów
        weatherStation.setTemperature(25);

        // Usuwanie obserwatora
        weatherStation.removeObserver(display1);

        // Kolejne ustawienie temperatury
        weatherStation.setTemperature(30);
    }
}