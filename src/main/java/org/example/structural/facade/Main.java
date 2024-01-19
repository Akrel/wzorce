package org.example.structural.facade;

/***
 * wzorzec fasady (Facade pattern) to wzorzec projektowy strukturalny, który dostarcza jednolite, uproszczone interfejsy do zestawu interfejsów w podsystemie.
 * Wzorzec ten ukrywa złożoność systemu, oferując jednolity punkt dostępu dla klientów.
 *
 * Główne cele wzorca fasady:
 *  1. Ułatwienie korzystania z systemu: Fasada dostarcza jednolity interfejs, który jest bardziej zrozumiały i łatwiejszy
 *  do korzystania dla klienta niż pełen zestaw interfejsów w podsystemie.
 *  2.  Ukrywanie złożoności: Fasada pozwala klientom korzystać z systemu bez konieczności zaznajamiania się z jego złożoną strukturą.
 *  Ukrywa skomplikowane detale implementacyjne.
 *
 *  Struktura wzorca fasada:
 *
 *  1. Fasada (Facade): Definiuje jednolity interfejs dla zestawu interfejsów w podsystemie. Odpowiada za zarządzanie i kierowanie żądaniami klientów do odpowiednich obiektów w podsystemie.
 *  2. Podsystem (Subsystem): Zawiera zbiór powiązanych ze sobą interfejsów i klas, z których składa się pełna funkcjonalność systemu.
 *
 */
public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}