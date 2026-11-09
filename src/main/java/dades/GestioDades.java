/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dades;

/**
 *
 * @author Usuario
 */



import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GestioDades {

    public static ArrayList<Usuari> usuaris = new ArrayList<>();
    public static ArrayList<Joc> jocs = new ArrayList<>();
    public static ArrayList<Lloguer> lloguers = new ArrayList<>();

    public static int seguentRegistre = 3;

    static {
        carregarDadesInicials();
    }

    private static void carregarDadesInicials() {

        // Crear usuaris
        Usuari usuari1 = new Usuari(
                "Marc", "Rosselló", "Garcia",
                "12345678A", "600111222", dataActual()
        );

        Usuari usuari2 = new Usuari(
                "Anna", "Martínez", "Sánchez",
                "87654321B", "600333444", dataActual()
        );

        usuaris.add(usuari1);
        usuaris.add(usuari2);

        // Crear jocs: 2 unitats per plataforma
        Joc joc1 = new Joc("The Legend of Zelda", "Aventura", 2, 2, 0, 0);

        Joc joc2 = new Joc(
                "FIFA", "Esports",
                0, 0, 2, 2
        );

        jocs.add(joc1);
        jocs.add(joc2);

        // Crear dos lloguers inicials
        LocalDate avui = LocalDate.now();

        Lloguer lloguer1 = new Lloguer(
                1, usuari1, joc1, Plataforma.PS5,
                formatData(avui),
                formatData(avui.plusDays(7))
        );

        Lloguer lloguer2 = new Lloguer(
                2, usuari2, joc2, Plataforma.XBOX,
                formatData(avui),
                formatData(avui.plusDays(7))
        );

        lloguers.add(lloguer1);
        lloguers.add(lloguer2);

        // Descomptar les unitats llogades
        joc1.setUnitatsPS5(joc1.getUnitatsPS5() - 1);
        joc2.setUnitatsXbox(joc2.getUnitatsXbox() - 1);
    }

    private static String dataActual() {
        return formatData(LocalDate.now());
    }

    private static String formatData(LocalDate data) {
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return data.format(format);
    }
}

