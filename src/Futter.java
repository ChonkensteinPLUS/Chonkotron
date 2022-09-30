public class Futter {

    private String name;
    private float calories;
    private float remaining;

    public String getName() {
        return name;
    }

    public float getCalories() {
        return calories;
    }

    public Futter(FutterSorten Sorte){
        this.remaining = 500;
        if(Sorte == FutterSorten.CHONKYDELUXE){
            this.name = "Chonky Deluxe Premium Cat Food !";
            this.calories = 800f / 1.5f;
        }
        if(Sorte == FutterSorten.HEALTHYBOI){
            this.name = "Healthy Boi Semi-Vegan Cat Food !";
            this.calories = 500f / 1.5f;
        }
        if(Sorte == FutterSorten.YOUTOOFAT){
            this.name = "YouTooFat Diet Cat Food !";
            this.calories = 200f / 1.5f;
        }
    }

    @Override
    public String toString() {
        return "Futter{" +
                "name = '" + this.name + '\'' +
                ", calories = " + this.calories +
                ", remaining = " + this.remaining + "g" +
                '}';
    }
}
