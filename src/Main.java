import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Chonkotron chonk2000 = new Chonkotron();
     /*   Jerboa cutie = new Jerboa("Cutie von Cutington", 8, 100);
        for(int i = 0;i < 14;i++) {
            dayPassing(chonk2000, cutie);
            System.out.println(cutie);
        } */

        Katze fluffy = new Katze("Fluffy von Chonkenstein", 8f);
        for(int i = 0;i < 14;i++){
            dayPassing(chonk2000,fluffy);
            System.out.println(fluffy);
        }

    }
    /**
     * Simuliert den Verlauf eines Tages, ruft 2-5 mal die Füttern Funktion auf
     * @param chonkotron Chonkotron welches das Futter ausschüttet
     * @param chonkster Katze die gefüttert werden soll ...
     */
    public static void dayPassing(Chonkotron chonkotron, Katze chonkster) {

        Random rd = new Random();
        int numNoms = rd.nextInt(2,6);
        System.out.println(numNoms);
        for (int i = 0; i < numNoms; i++) {
            chonkster.eat(chonkotron.dispenseFood(chonkster));
        }
        chonkster.EndOfDay();
    }
    public static void dayPassing(Chonkotron grubmachine, Jerboa chonkster) {

        Random rd = new Random();
        int numNoms = rd.nextInt(2,6);
        System.out.println(numNoms);
        for (int i = 0; i < numNoms; i++) {
            chonkster.grabGrub(grubmachine);
        }
        chonkster.evalWeight();
    }

    // Step 1:
    // Es soll ein KatzenfutterAutomat implementiert werden (das CHONKOTRON)
    // Dieser Automat soll verschiedene Futtersorten beinhalten (je 500g)
    // Es gibt die Futtersorten : ChonkyDeluxe (800 kal pro 150g)
    //                            HealthyBoi   (500 kal pro 150g)
    //                            YouTooFat    (200 kal pro 150g)
    // Wenn eine Katze Futter holen will wird sie gewogen
    // wenn sie zwischen unter 4 Kilo wiegt bekommt sie ChonkyDeulxe
    // wenn sie zwischen 4 und 7 Kilo wiegt bekommt sie HealthyBoi
    // wenn sie mehr als 7 Kilo wiegt bekommt sie YouTooFat
    // Bei jedem Füttern werden 100g Futter gegeben.

    // Step 2:
    // Die Katze will den Chonkertraum leben (also so viel und leckeres Futter
    // wie möglich -> Ziel der Katze : zunehmen)
    // Jeden Tag nimmt die Katze zu oder ab
    // bei 1400 kal pro tag bleibt das gewicht stabil
    // für je 500 kal extra nimmt sie 1 kg zu
    // für je 500 kal weniger nimmt sie 1 kg ab
    // Die Katze will pro Tag zufällig zwischen (2 und 5 mal) Futter

    // Beispielkatze : Fluffy von Chonkenstein
    // Name : Fluffy
    // Flauschalität von 100
    // Gewicht : 8 kg

    // Aufgabe : Bauen das Chonkotron nach und konfigurieren sie es so, das
    // Fluffy endlich diät macht und ein gesundes Gewicht erreicht.

    // Level 2 : Die Katze hat Tricks gelernt : Wenn man auf den Knopf drückt kommt futter
    //          -> drücken bis der Arzt kommt
    //           Die Katze hat gelernt : Auch diätfutter kann man essen : es muss nur mehr sein !
    //          -> Wenn ihr die Kalorien nicht reichen , einfach nochmal futter verlagen !
    //           Die Katze hat gelernt : Wenn ich weniger Futter kriege, bewege ich mich eben einfach
    //           weniger, das nenne ich energieeffizienz
    //          -> Wenn die Katze abzunehmen droht, dann bewegt sie sich weniger und braucht weniger Kalorien
    //           (100 kal weniger pro Tag) (solange bis 800kal / Tag)

    // Aufgabe : Bringen sie das ihrer Katze bei und überlisten sie das böse Chonkotron !

    // Level 3 : Passen sie das Chonkotron an und zwingen sie die Katze zur Diät !
    //           Sollte das Futter einmal leer sein, dann muss es nachgefüllt werden.
    //           Um Futter nachzufüllen braucht man 1 Tag, an dem dieses Futter nicht verfügbar ist
    //           (es muss also ein anderes ausgeschüttet werden)



}
