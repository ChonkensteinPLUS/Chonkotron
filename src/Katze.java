import java.util.Random;

public class Katze
{
    private String name;
    private double weight;
    private int fluffiness;
    private double maintenance;
    private double dailyCalories;

    {
        name = "DefaultCatName";
        weight = 6.0;
        fluffiness = 100;
        maintenance = 800;
    }

    public void CalculateFluffiness () {
        this.fluffiness = (int)(weight * 16.66);
        if (this.fluffiness > 100 ) {
            this.fluffiness = 100;
        }
        if (this.fluffiness < 50) {
            this.fluffiness = 50;
        }
    }

    public void RequestFood (Chonkotron tron) {
        tron.DispenseFood(this);
    }

    public void EatFood (Katzenfutter food, double amount) {
        dailyCalories += food.getCalories() * (amount / 100);
        //System.out.printf("Calories: %s, daily: %s\n", (food.getCalories() * (amount / 100)), dailyCalories);
    }

    public void EatAllDay (Chonkotron tron) {
        dailyCalories = 0;
        int mealsPerDay = new Random().nextInt(2, 6);

        while (mealsPerDay > 0) {
            RequestFood(tron);
            mealsPerDay--;
        }

        double calDifference = dailyCalories - maintenance;
        double weightChange = calDifference / 500d;
        this.weight += weightChange;
        CalculateFluffiness();
    }

    public Katze (String name, double weight) {
        this.name = name;
        this.weight = weight;
        CalculateFluffiness();
    }

    public String getName()
    {
        return name;
    }
    public double getWeight()
    {
        return weight;
    }
    public int getFluffiness()
    {
        return fluffiness;
    }
}
