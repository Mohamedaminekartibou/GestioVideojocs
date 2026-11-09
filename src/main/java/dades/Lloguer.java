/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dades;

/**
 *
 * @author Usuario
 */


public class Lloguer {

    private int numRegistre;
    private Usuari usuari;
    private Joc joc;
    private Plataforma plataforma;
    private String dataInici;
    private String dataPrevista;
    private boolean retornat;

    public Lloguer(int numRegistre, Usuari usuari, Joc joc,
            Plataforma plataforma, String dataInici,
            String dataPrevista) {

        this.numRegistre = numRegistre;
        this.usuari = usuari;
        this.joc = joc;
        this.plataforma = plataforma;
        this.dataInici = dataInici;
        this.dataPrevista = dataPrevista;
        this.retornat = false;
    }

    public int getNumRegistre() {
        return numRegistre;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public Joc getJoc() {
        return joc;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public String getDataInici() {
        return dataInici;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public boolean isRetornat() {
        return retornat;
    }

    public void setRetornat(boolean retornat) {
        this.retornat = retornat;
    }
}

