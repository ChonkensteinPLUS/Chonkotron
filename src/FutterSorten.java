public enum FutterSorten {
    CHONKYDELUXE("Chonky Deluxe Premium Cat Food !",533.33f),
    HEALTHYBOI("Healthy Boi Semi-Vegan Cat Food !",333.33f),
    YOUTOOFAT("YouTooFat Diet Cat Food !",133.33f);

    private final String name;
    private final float calories;

    FutterSorten(String name, float calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public float getCalories() {
        return calories;
    }
}
