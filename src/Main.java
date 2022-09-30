public class Main {

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

    public static void main(String[] args) {

        Chonkotron c1 = new Chonkotron();
        Katze flauschi = new Katze("Flauschi von Chonkenstein",8f);
        flauschi.eat(new Futter(FutterSorten.CHONKYDELUXE));

    }

}
