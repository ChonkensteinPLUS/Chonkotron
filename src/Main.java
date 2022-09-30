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
    // Die Katze will pro Tag zufällig zwisczhen (2 und 5 mal Futter)

    // Beispielkatze : Fluffy von Chonkenstein
    // Name : Fluffy
    // Flauschalität von 100
    // Gewicht : 8 kg

    // Aufgabe : Bauen das Chonkotron nach und konfigurieren sie es so, das
    // Fluffy endlich diät macht und ein gesundes Gewicht erreicht.

    public static void main(String[] args)
    {
        // Init stuff
        Katze cat = new Katze("Fluffy", 8.0);

        Katzenfutter food1 = new Katzenfutter("ChonkyDeluxe", 800, new Chonkotron().getMaxCapacity());
        Katzenfutter food2 = new Katzenfutter("HealthyBoi", 500, new Chonkotron().getMaxCapacity());
        Katzenfutter food3 = new Katzenfutter("YouTooFat", 200, new Chonkotron().getMaxCapacity());
        Katzenfutter[] foodArray = {food1, food2, food3};

        Chonkotron chonkotron = new Chonkotron(foodArray);


        // ?
        int dayCounter = 1;
        while (cat.getWeight() > 7.0) {
            System.out.println("Day " + dayCounter);
            cat.EatAllDay(chonkotron);

            System.out.printf("- Day ended. %s now weighs %.2f kgs\n\n", cat.getName(), cat.getWeight());
            dayCounter++;
            chonkotron.Refill();
        }
    }
}
