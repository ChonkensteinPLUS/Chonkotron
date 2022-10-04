import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Chonkotron chonk2000 = new Chonkotron();
        Jerboa cutie = new Jerboa("Cutie von Cutington", 4, 100);
        for(int i = 0;i < 14;i++) {
            dayPassing(chonk2000, cutie);
            System.out.println(cutie);
        }
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


}
