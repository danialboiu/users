package com.dani.users.requests;

import com.dani.users.domain.Adresa;

public class CreateUserRequest {
    private String nume;
    private Adresa adresa;
    private String email;
    private String parola;

    public CreateUserRequest(String nume, Adresa adresa, String email, String parola) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.parola = parola;
    }


    public CreateUserRequest() {
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
