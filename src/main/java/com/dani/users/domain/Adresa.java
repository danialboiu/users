package com.dani.users.domain;

public class Adresa {

    private String strada;
    private int numar;
    private String bloc;
    private int ap;
    private boolean salvatiAdresaPermanent;

    public String getStrada() {
        return strada;
    }

    public int getNumar() {
        return numar;
    }

    public String getBloc() {
        return bloc;
    }

    public int getAp() {
        return ap;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public Adresa(String strada, int numar, String bloc, int ap) {
        this.strada = strada;
        this.numar = numar;
        this.ap = ap;
        this.bloc = bloc;
    }

    public Adresa() {
    }
}
