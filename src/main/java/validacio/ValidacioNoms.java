/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacio;

/**
 *
 * @author Usuario
 */


public class ValidacioNoms {

    public static boolean comencaAmbMajuscula(String text) {

        if (text == null || text.trim().isEmpty()) {
            return false;
        }

        return Character.isUpperCase(text.trim().charAt(0));
    }

    public static boolean esBuit(String text) {
        return text == null || text.trim().isEmpty();
    }
}