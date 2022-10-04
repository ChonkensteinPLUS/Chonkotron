public class FoodContainer {

    private String content;
    private float contentCalories;
    private float remaining;

    public FoodContainer(FeedTypes Sorte){
        this.remaining = 500;
        if(Sorte == FeedTypes.CHONKYDELUXE){
            this.content = "Chonky Deluxe Premium Cat Food !";
            this.contentCalories = 800f / 1.5f;
        }
        if(Sorte == FeedTypes.HEALTHYBOI){
            this.content = "Healthy Boi Semi-Vegan Cat Food !";
            this.contentCalories = 500f / 1.5f;
        }
        if(Sorte == FeedTypes.YOUTOOFAT){
            this.content = "YouTooFat Diet Cat Food !";
            this.contentCalories = 200f / 1.5f;
        }
    }

    public String getContent() { return content; }
    public float getContentCalories() { return contentCalories; }
    public float getRemaining() { return remaining; }
    public void setRemaining(float remaining) { this.remaining = remaining; }

    @Override
    public String toString() {
        return "Futter{" +
                "name = '" + this.content + '\'' +
                ", calories = " + this.contentCalories +
                ", remaining = " + this.remaining + "g" +
                '}';
    }
}
