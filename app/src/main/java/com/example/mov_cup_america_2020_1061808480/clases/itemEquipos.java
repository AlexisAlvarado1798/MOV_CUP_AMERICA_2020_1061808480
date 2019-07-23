package com.example.mov_cup_america_2020_1061808480.clases;

public class itemEquipos {
    private String nombreEquipo1;
    private String nombreEquipo2;
    private int Marcador;
    private int Marcador2;
    private String imag;
    private String imag2;


    public itemEquipos() {
    }

    public itemEquipos(String nombreEquipo1, String nombreEquipo2, int marcador, int Marcador2, String imag, String imag2) {
        this.nombreEquipo1 = nombreEquipo1;
        this.nombreEquipo2 = nombreEquipo2;
        this.Marcador = marcador;
        this.Marcador2=Marcador2;
        this.imag2=imag2;
        this.imag = imag;

    }

    public int getMarcador2() {
        return Marcador2;
    }

    public void setMarcador2(int marcador2) {
        Marcador2 = marcador2;
    }

    public String getImag2() {
        return imag2;
    }

    public void setImag2(String imag2) {
        this.imag2 = imag2;
    }

    public String nombreEquipo1() {
        return nombreEquipo1;
    }

    public void nombreEquipo1(String nombreEquipo1) {
        this.nombreEquipo1 = nombreEquipo1;
    }

    public String nombreEquipo2() {
        return nombreEquipo2;
    }

    public void nombreEquipo2(String nombreEquipo2) {
        this.nombreEquipo2 = nombreEquipo2;
    }

    public int getMarcador() {
        return Marcador;
    }

    public void setMarcador(int marcador) {
        Marcador = marcador;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }
}
