public class Futter {

    private FutterSorten Sorte;
    private float remaining;

    public String getName() {
        return Sorte.getName();
    }

    public float getCalories() {
        return Sorte.getCalories();
    }

    public Futter(FutterSorten Sorte){
        this.Sorte = Sorte;
        this.remaining = 500;
    }

    @Override
    public String toString() {
        return "Futter{" +
                "name = '" + this.Sorte.getName() + '\'' +
                ", calories = " + this.Sorte.getCalories() +
                ", remaining = " + this.remaining + "g" +
                '}';
    }

    public void dispense(float ammount){
        this.remaining -= ammount;
    }
}
