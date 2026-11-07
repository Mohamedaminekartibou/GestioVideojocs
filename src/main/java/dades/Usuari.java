/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dades;

/**
 *
 * @author Usuario
 */

public class Usuari {

    private String nom;
    private String cognom1;
    private String cognom2;
    private String dni;
    private String telefon;

    public Usuari(String nom, String cognom1,
            String cognom2, String dni, String telefon) {

        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dni = dni;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return nom + " " + cognom1 + " " + cognom2;
    }
}
