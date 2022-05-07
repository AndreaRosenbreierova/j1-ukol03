package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        Pocitac andrejkyPocitac;
        andrejkyPocitac = new Pocitac();


        Procesor andrejkyProcesor = new Procesor();
        andrejkyProcesor.setRychlost(4300_000_000_000L);
        andrejkyProcesor.setVyrobce("Intel");

        Pamet andrejkyPamet = new Pamet();
        andrejkyPamet.setKapacita(32_000_000_000L);

        Disk andrejkyDisk = new Disk();
        andrejkyDisk.setKapacita(121_129_000_000L);

        andrejkyPocitac.setCpu(andrejkyProcesor);
        andrejkyPocitac.setRam(andrejkyPamet);
        andrejkyPocitac.setPevnyDisk(andrejkyDisk);

        System.out.println(andrejkyPocitac.toString());

        andrejkyPocitac.zapniSe();
        System.out.println(andrejkyPocitac.toString());

        System.out.println("Program spuštěn.");

        andrejkyPocitac.zapniSe();
        andrejkyPocitac.vypniSe();
        andrejkyPocitac.vypniSe();
        System.out.println(andrejkyPocitac.toString());






    }

}
