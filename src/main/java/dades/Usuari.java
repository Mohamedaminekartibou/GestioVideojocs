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
    private String llinatge1;
    private String llinatge2;
    private String dni;
    private String telefon;
    private String dataRegistre;

    public Usuari(String nom, String llinatge1, String llinatge2,
            String dni, String telefon, String dataRegistre) {

        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.dni = dni;
        this.telefon = telefon;
        this.dataRegistre = dataRegistre;
    }

    public String getNomComplet() {
        return nom + " " + llinatge1 + " " + llinatge2;
    }

    public String getNom() {
        return nom;
    }
    public String getDni() {
        return dni;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getDataRegistre() {
        return dataRegistre;
    }
}
