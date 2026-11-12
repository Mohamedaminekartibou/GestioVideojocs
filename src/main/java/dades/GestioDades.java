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

    public static int seguentRegistre = 6;

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

        // Crear jocs
        Joc joc1 = new Joc("The Legend of Zelda", "Aventura", 2, 2, 0, 0);
        Joc joc2 = new Joc("FIFA", "Esports", 0, 0, 2, 2);

        jocs.add(joc1);
        jocs.add(joc2);

        LocalDate avui = LocalDate.now();

        // 1. Lloguer retornat
        Lloguer lloguer1 = new Lloguer(
                1, usuari1, joc1, Plataforma.PS5,
                formatData(avui.minusDays(14)),
                formatData(avui.minusDays(7))
        );
        lloguer1.setRetornat(true);

        // 2. Lloguer retornat
        Lloguer lloguer2 = new Lloguer(
                2, usuari2, joc2, Plataforma.XBOX,
                formatData(avui.minusDays(14)),
                formatData(avui.minusDays(7))
        );
        lloguer2.setRetornat(true);

        // 3. Lloguer atrasat
        Lloguer lloguer3 = new Lloguer(
                3, usuari1, joc1, Plataforma.PS5,
                formatData(avui.minusDays(14)),
                formatData(avui.minusDays(7))
        );

        // 4. Lloguer atrasat
        Lloguer lloguer4 = new Lloguer(
                4, usuari2, joc2, Plataforma.XBOX,
                formatData(avui.minusDays(14)),
                formatData(avui.minusDays(7))
        );

        // 5. Lloguer pendent normal
        Lloguer lloguer5 = new Lloguer(
                5, usuari1, joc1, Plataforma.SWITCH_2,
                formatData(avui),
                formatData(avui.plusDays(7))
        );

        lloguers.add(lloguer1);
        lloguers.add(lloguer2);
        lloguers.add(lloguer3);
        lloguers.add(lloguer4);
        lloguers.add(lloguer5);

        // Descomptar només els lloguers que encara estan actius
        joc1.setUnitatsPS5(joc1.getUnitatsPS5() - 1);
        joc2.setUnitatsXbox(joc2.getUnitatsXbox() - 1);
        joc1.setUnitatsSwitch2(joc1.getUnitatsSwitch2() - 1);
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
