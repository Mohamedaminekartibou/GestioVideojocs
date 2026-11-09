/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dades;

/**
 *
 * @author Usuario
 */



public class Joc {

    private String nom;
    private String genere;
    private int unitatsPS5;
    private int unitatsSwitch2;
    private int unitatsXbox;
    private int unitatsPC;

    public Joc(String nom, String genere, int unitatsPS5,
            int unitatsSwitch2, int unitatsXbox, int unitatsPC) {

        this.nom = nom;
        this.genere = genere;
        this.unitatsPS5 = unitatsPS5;
        this.unitatsSwitch2 = unitatsSwitch2;
        this.unitatsXbox = unitatsXbox;
        this.unitatsPC = unitatsPC;
    }

    public String getNom() {
        return nom;
    }

    public String getGenere() {
        return genere;
    }

    public int getUnitatsPS5() {
        return unitatsPS5;
    }

    public int getUnitatsSwitch2() {
        return unitatsSwitch2;
    }

    public int getUnitatsXbox() {
        return unitatsXbox;
    }

    public int getUnitatsPC() {
        return unitatsPC;
    }

    public void setUnitatsPS5(int unitats) {
        unitatsPS5 = unitats;
    }

    public void setUnitatsSwitch2(int unitats) {
        unitatsSwitch2 = unitats;
    }

    public void setUnitatsXbox(int unitats) {
        unitatsXbox = unitats;
    }

    public void setUnitatsPC(int unitats) {
        unitatsPC = unitats;
    }
}
