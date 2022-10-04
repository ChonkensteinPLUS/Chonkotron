public class Chonkotron {

    private Futter[] futterSlots;
    private float portionSize;

    {
        this.futterSlots = new Futter[3];
        this.portionSize = 100f;
    }
    public Chonkotron(){
        this.futterSlots[0] = new Futter(FutterSorten.CHONKYDELUXE);
        this.futterSlots[1] = new Futter(FutterSorten.HEALTHYBOI);
        this.futterSlots[2] = new Futter(FutterSorten.YOUTOOFAT);
    }
    public float getPortionSize() { return portionSize; }
    public void setPortionSize(float portionSize) { this.portionSize = portionSize; }

    public Futter dispenseFood(Katze chonker) {
        Futter ReturnContainer;
        if (chonker.getGewicht() < 4) {
            ReturnContainer = this.futterSlots[0];
        } else if (chonker.getGewicht() < 7) {
            ReturnContainer = this.futterSlots[1];
        }
        else {
            ReturnContainer = this.futterSlots[2];
        }
        System.out.printf("%s gets \"%s\".\n", chonker.getName(), ReturnContainer.getName());
        ReturnContainer.dispense(portionSize);
        return ReturnContainer;
    }
}
