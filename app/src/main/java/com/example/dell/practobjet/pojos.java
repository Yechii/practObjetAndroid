package com.example.dell.practobjet;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Dell on 07/09/2017.
 */

public class pojos implements Serializable{
    private String usuario;

    public String getUsuario(String s) {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter(String s) {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getNumeroDeTelefono(String s) {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return usuario + "\n" + email;
    }

    public pojos(String usuario, String email, String twitter, String numeroDeTelefono, String fecha) {
        this.usuario = usuario;
        this.email = email;
        this.twitter = twitter;
        this.numeroDeTelefono = numeroDeTelefono;
        this.fecha = fecha;
    }

    public pojos() {

    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    private String email;
    private String twitter;
    private String numeroDeTelefono;
    private String fecha;

}
