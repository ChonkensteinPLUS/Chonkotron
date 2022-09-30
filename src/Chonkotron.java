import java.util.Arrays;

public class Chonkotron {

    private Futter[] futterSlots;

    {
        this.futterSlots = new Futter[3];
    }
    public Chonkotron(){
        this.futterSlots[0] = new Futter(FutterSorten.CHONKYDELUXE);
        this.futterSlots[1] = new Futter(FutterSorten.HEALTHYBOI);
        this.futterSlots[2] = new Futter(FutterSorten.YOUTOOFAT);
    }

    @Override
    public String toString() {
        return "Chonkotron{" +
                "futterSlots=" + Arrays.toString(this.futterSlots) +
                '}';
    }
}
