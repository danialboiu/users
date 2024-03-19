package com.dani.users.domain;

public class User {
    private String id;
    private String nume;
    Adresa adresa;
    private String email;
    private String parola;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public String getParola() {
        return parola;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public User(String id, String nume, Adresa adresa, String email, String parola) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.parola = parola;
        this.email = email;
    }

    public User() {
    }
}
