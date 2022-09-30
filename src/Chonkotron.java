public class Chonkotron {

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

    Catfood[] container;
    int chonkyDeluxeFillStatus;
    int healthyBoiFillStatus;
    int youTooFatFillStatus;

    {
        container = new Catfood[] {new ChonkyDeluxe(), new HealthyBoi(), new YouTooFat()};
        chonkyDeluxeFillStatus = 500;
        healthyBoiFillStatus = 500;
        youTooFatFillStatus = 500;

    }


    public int getChonkyDeluxeFillStatus() {
        return chonkyDeluxeFillStatus;
    }

    public void setChonkyDeluxeFillStatus(int chonkyDeluxeFillStatus) {
        this.chonkyDeluxeFillStatus = chonkyDeluxeFillStatus;
    }

    public int getHealthyBoiFillStatus() {
        return healthyBoiFillStatus;
    }

    public void setHealthyBoiFillStatus(int healthyBoiFillStatus) {
        this.healthyBoiFillStatus = healthyBoiFillStatus;
    }

    public int getYouTooFatFillStatus() {
        return youTooFatFillStatus;
    }

    public void setYouTooFatFillStatus(int youTooFatFillStatus) {
        this.youTooFatFillStatus = youTooFatFillStatus;
    }

    public Catfood[] getContainer() {
        return container;
    }

    public void setContainer(Catfood[] container) {
        this.container = container;
    }
}
