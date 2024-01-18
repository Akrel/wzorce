package org.example.structural.adapter;

public class AdapterKwadrat implements InterfejsProstokat {
    private KlasaKwadrat klasaKwadrat;

    public AdapterKwadrat(KlasaKwadrat klasaKwadrat) {
        this.klasaKwadrat = klasaKwadrat;
    }

    @Override
    public int obliczPoleProstokata(int szerokosc, int wysokosc) {
        // Tutaj używamy istniejącej funkcji obliczPoleKwadratu jako adaptowanej
        return klasaKwadrat.obliczPoleKwadratu(szerokosc);
    }
}