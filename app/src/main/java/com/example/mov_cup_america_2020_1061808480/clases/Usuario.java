package com.example.mov_cup_america_2020_1061808480.clases;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroTelefono;
    private String contrasena;
    private String repetirContrasena;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, String numeroTelefono, String contrasena, String repetirContrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRepetirContrasena() {
        return repetirContrasena;
    }

    public void setRepetirContrasena(String repetirContrasena) {
        this.repetirContrasena = repetirContrasena;
    }
}
